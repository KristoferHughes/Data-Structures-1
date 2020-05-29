package algs13;
import stdlib.*;
//Kristofer Hughes CSC 300

//PROBLEM 2.2.17
public class MyLinkedSort {
    static class Node {
        public Node() { }
        public double item;
        public Node next;
    }

    int N;
    Node first;
    
    public MyLinkedSort () {
        first = null;
        N = 0;
        checkInvariants ();
    }

    private void myassert (String s, boolean b) { if (!b) throw new Error ("Assertion failed: " + s); }
    private void checkInvariants() {
        myassert("Empty <==> first==null", (N == 0) == (first == null));
        Node x = first;
        for (int i = 0; i < N; i++) {
            if (x==null) {
                throw new Error ("List too short!");
            }
            x = x.next;
        }
        myassert("EndOfList == null", x == null);
    }

    public boolean isEmpty () { return first == null; }
    public int size () { return N; }
    public void add (double item) {
        Node newfirst = new Node ();
        newfirst.item = item;
        newfirst.next = first;
        first = newfirst;
        N++;
    }

    private static void print (String s, MyLinkedSort b) {
        StdOut.print (s + ": ");
        for (Node x = b.first; x != null; x = x.next)
            StdOut.print (x.item + " ");
        StdOut.println ();
    }
    private static void print (String s, MyLinkedSort b, double i) {
        StdOut.print (s + ": ");
        for (Node x = b.first; x != null; x = x.next)
            StdOut.print (x.item + " ");
        StdOut.println (": " + i);
    }
    
    public Node sort(Node l) 
    {
        if (l == null || l.next == null)
            return l;
        
        
        Node c = l;
        Node r = l.next;
        
       
        while ((r != null) && (r.next != null)) 
        {
        	l = l.next;
            r = (r.next).next;
        }
        r = l.next;
        l.next = null;
        return merge(sort(c), sort(r));
    }

    public void append(Node last) 
    {
        first = last;
    }
    
  

    private static class Split {
    	Node a, b;
    	}


    	
    	//Utility function
    	private void Splitgo(Node head, Split splitnode) {

    	Node fast = head.next, slow = head;

    	if (head == null || head.next == null) {
    	splitnode.a = head;
    	splitnode.b = null;
    	  
    	} else {

    	while (fast != null) {
    	fast = fast.next;
    	if (fast != null) {
    	slow = slow.next;
    	fast = fast.next;
    	}
    	}
    	  
    	splitnode.a = head;
    	splitnode.b = slow.next;
    	slow.next = null;
    	}
    	  

    	}
 
    public Node merge(Node lt, Node rt) 
    {
        Node temp = new Node();
        Node Sechead = temp;
        Node m = Sechead;
        
        while ((lt != null) && (rt != null)) 
        {
            if (lt.item <= rt.item) 
            {
                m.next = lt;
                m = lt;
                lt = lt.next;
            }
            else 
            {
               m.next = rt;
                m = rt;
                rt = rt.next;
            }
        }
        m.next = (lt == null) ? rt : lt;
        
        
        return Sechead.next;
    }

    
   
    private void sort(){ 

    	
    	append(sort(first));
    	
    	 }

    public static void main (String args[]) {
        int[] a1 = new int[20];
		for (int i = 0; i < a1.length; i++)
			a1[i] = i;
		StdRandom.shuffle (a1);
        MyLinkedSort b1 = new MyLinkedSort ();
        for (int i:a1) b1.add(i);
        MyLinkedSort.print("before sort",b1);
        b1.sort();
        MyLinkedSort.print("after sort",b1);
        int[] a2 = new int[200];
		for (int i = 0; i < a2.length; i++)
			a2[i] = i;
		StdRandom.shuffle (a2);
        MyLinkedSort b2 = new MyLinkedSort ();
        for (int i:a1) b2.add(i);
        MyLinkedSort.print("before sort",b2);
        b2.sort();
        MyLinkedSort.print("after sort",b2);
         
    }
}