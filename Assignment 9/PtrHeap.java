package algs24;

import stdlib.StdIn;
import stdlib.StdOut;


/**
 *  The <tt>PtrHeap</tt> class is the priorityQ class from Question 2.4.24.
 *  It represents a priority queue of generic keys.
 *  
 *  It supports the usual <em>insert</em> and <em>delete-the-maximum</em>
 *  operations, along with methods for peeking at the maximum key,
 *  testing if the priority queue is empty, and iterating through
 *  the keys.
 *  For additional documentation, see <a href="http://algs4.cs.princeton.edu/24in">Section 2.4</a> of
 *  <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 */

public class PtrHeap<K extends Comparable<? super K>> {
	 
	private K[] in;                    
	private int N;                       
	private int MAXN;
	
	@SuppressWarnings("unchecked")
	/** Create an empty priority queue  */
	public PtrHeap(int firstQueue) { 
		
		MAXN = firstQueue;
		in = (K[]) new Comparable[firstQueue + 1];
		N = 0;
	}

	/** Is the priority queue empty? */
	public boolean isEmpty() { 
		return N == 0; }


	/** Return the number of items on the priority queue. */
	public int size() { 
		return N; }

	/**
	 * Return the largest key on the priority queue.
	 * Throw an exception if the priority queue is empty.
	 */
	public K max() {
		
	if (isEmpty()) throw new Error("Priority queue empty");
	return in[1];
		
	}

	/** Add a new key to the priority queue. */
	public void insert(K x) { 
	
		in[++N] = x;

		
	}

	/**
	 * Delete and return the largest key on the priority queue.
	 * Throw an exception if the priority queue is empty.
	 */
	public K delMax() {
		if (N == 0) throw new Error("Priority queue empty");
		K max = in[1];
		in[N+1] = null; 
		return max;
	}

	private void showHeap() {
	    // a method to print out the heap
		// useful for debugging
		for (int i = 1; i <= N; i++)
			StdOut.print (in[i] + " ");
		StdOut.println ();
	}

	public static void main(String[] args) {
		PtrHeap<String> in = new PtrHeap<>(100);
		StdIn.fromString("10 20 30 40 50 - - - 05 25 35 - - - 70 80 05 - - - - ");
		while (!StdIn.isEmpty()) {
			StdOut.print ("in:  "); in.showHeap();
			String item = StdIn.readString();
			if (item.equals("-")) StdOut.println("max: " + in.delMax());
			else in.insert(item);
		}
		StdOut.println("(" + in.size() + " left on in)");

	}

}