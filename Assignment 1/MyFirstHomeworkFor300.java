package algs11;

import stdlib.StdOut;
import java.util.*; // for comparing arrays in main() tests only

class MyFirstHomeworkFor300 {

	/*
	 * minValue returns the minimum value in an array of doubles. You can assume
	 * the array is nonempty and has no duplicates. Your solution must go
	 * through the array exactly once. Your solution must not call any other
	 * functions. Here are some examples (using "==" informally):
	 * 
	 * -7 == minValue(new double[] { -7 }) -7 == minValue(new double[] { 1, -4,
	 * -7, 7, 8, 11 }) -13 == minValue(new double[] { -13, -4, -7, 7, 8, 11 })
	 * -9 == minValue(new double[] { 1, -4, -7, 7, 8, 11, -9 })
	 */

	public static double minValue(double[] array) {
		double min = array[0]; 
	    for(int i=1;i<array.length;i++){ 
	      if(array[i] < min){ 
	        min = array[i]; 
	      } 
	    } 
	    return min; 
	  } 
	
	/*
	 * minPosition returns the position of the minimum value in an array of
	 * doubles. The first position in an array is 0 and the last is the
	 * array.length-1. You can assume the array is nonempty and has no
	 * duplicates. Your solution must go through the array exactly once. Your
	 * solution must not call any other functions. Here are some examples (using
	 * "==" informally):
	 * 
	 * 0 == minPosition(new double[] { -7 }) 2 == minPosition(new double[] { 1,
	 * -4, -7, 7, 8, 11 }) 0 == minPosition(new double[] { -13, -4, -7, 7, 8, 11
	 * }) 6 == minPosition(new double[] { 1, -4, -7, 7, 8, 11, -9 })
	 */
	public static int minPosition(double[] array) {
		int index = 0;
	       int min =  (int) array[index];
	       
	       for (int i=1; i<array.length; i++){

	           if (array[i] < min ){
	               min = (int) array[i];
	               index = i;
	           }


	       }
	       return index ;

	}
	
	
	

	/*
	 * distanceBetweenMinAndMax returns difference between the minPosition and
	 * the maxPosition in an array of doubles.
	 * 
	 * You can assume the array is nonempty and has no duplicates. Your solution
	 * must go through the array exactly once. Your solution must not call any
	 * other functions. Here are some examples (using "==" informally):
	 * 
	 * 0 == distanceBetweenMinAndMax(new double[] { -7 }) // -7,-7 are the min
	 * and max 3 == distanceBetweenMinAndMax(new double[] { 1, -4, -7, 7, 8, 11
	 * }), // 7,11 5 == distanceBetweenMinAndMax(new double[] { -13, -4, -7, 7,
	 * 8, 11 }) // -13,11 1 == distanceBetweenMinAndMax(new double[] { 1, -4,
	 * -7, 7, 8, 11, -9 }) // -9,11
	 */
	

	public static double distanceBetweenMinAndMax(double [] array) {
		int index = 0;
	    int min =  (int) array[index];
	       
	       for (int i=1; i<array.length; i++){

	           if (array[i] < min ){
	               min = (int) array[i];
	               index = i;
	           }
	           int index2=0;
	           int max =  (int) array[index2];
		       
		       for (int k=1; i>array.length; i++){

		           if (array[i] > max ){
		               max = (int) array[i];
		               index2 = i;
		           }

	       }
	       return (index2 - index);
	       }
		return min;
	}
	     
	              
		
	              
       
   




	/*
	 * numUnique returns the number of unique values in an array of doubles.
	 * Unlike the previous questions, the array may be empty and it may contain
	 * duplicate values. Also unlike the previous questions, you can assume the
	 * array is sorted.
	 * 
	 * Your solution must go through the array exactly once. Your solution must
	 * not call any other functions. Here are some examples (using "=="
	 * informally):
	 * 
	 * 0 == numUnique(new double[] { }) 1 == numUnique(new double[] { 11 }) 1 ==
	 * numUnique(new double[] { 11, 11, 11, 11 }) 8 == numUnique(new double[] {
	 * 11, 11, 11, 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88, 88 }) 8
	 * == numUnique(new double[] { 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66,
	 * 77, 88 })
	 */
	public static double numUnique(double[] array) {
	    if (array.length == 0) {
	        return 0;
	    }
	    int numCount = 1;
	    for (int i = 0; i < array.length - 1; i++) {
	        if (array[i] != array[i + 1]) {
	            numCount++;
	        }
	    }
	    return numCount;
	}

	/*
	 * removeDuplicates returns the number of unique values in an array of
	 * doubles. You may assume that the list is sorted, as you did for
	 * numUnique.
	 * 
	 * Your solution may call numUnique, but should not call any other
	 * functions. After the call to numUnique, you must go through the array
	 * exactly one more time. Here are some examples (using "==" informally):
	 * 
	 * new double[] { } == removeDuplicates(new double[] { }) new double[] { 11
	 * } == removeDuplicates(new double[] { 11 }) == removeDuplicates(new
	 * double[] { 11, 11, 11, 11 }) new double[] { 11, 22, 33, 44, 55, 66, 77,
	 * 88 } == removeDuplicates(new double[] { 11, 11, 11, 11, 22, 33, 44, 44,
	 * 44, 44, 44, 55, 55, 66, 77, 88, 88 }) == removeDuplicates(new double[] {
	 * 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88 })
	 */
	public static double[] removeDuplicates(double[] array) {
		int k = 0; 
        int n = 0;
		double[] temp = array;
		for (int i=0; i<n-1; i++) 
            
            if (array[i] != array[i+1]) 
                temp[k++] = array[i]; 
          
        
        temp[k++] = array[n-1];    
          
       
        for (int i=0; i<k; i++) 
            array[i] = temp[i]; 
       
       
        return array;
        		
    } 
				

	// You can write tests here to make sure your functions work.  Some examples here.
	public static void main(String[] args) {
		// test minValue( double [] )
		StdOut.println("minValue:");
		StdOut.print("-7 == minValue(new double[] { -7 }) ");
		StdOut.println(-7 == minValue(new double[] { -7 }));

		StdOut.print("-7 == minValue(new double[] { 1, -4, -7, 7, 8, 11 }) ");
		StdOut.println(-7 == minValue(new double[] { 1, -4, -7, 7, 8, 11 }));

		StdOut.print("-13 == minValue(new double[] { -13, -4, -7, 7, 8, 11 }) ");
		StdOut.println(-13 == minValue(new double[] { -13, -4, -7, 7, 8, 11 }));

		StdOut.print("-9 == minValue(new double[] { 1, -4, -7, 7, 8, 11, -9 }) ");
		StdOut.println(-9 == minValue(new double[] { 1, -4, -7, 7, 8, 11, -9 }));

		// test minPosition( double[] )
		StdOut.println("\nminPosition:");
		StdOut.print("0 == minPosition(new double[] { -7 }) ");
		StdOut.println(0 == minPosition(new double[] { -7 }));

		StdOut.print("2 == minPosition(new double[] { 1, -4, -7, 7, 8, 11 }) ");
		StdOut.println(2 == minPosition(new double[] { 1, -4, -7, 7, 8, 11 }));

		StdOut.print("0 == minPosition(new double[] { -13, -4, -7, 7, 8, 11 }) ");
		StdOut.println(0 == minPosition(new double[] { -13, -4, -7, 7, 8, 11 }));

		StdOut.print("6 == minPosition(new double[] { 1, -4, -7, 7, 8, 11, -9 }) ");
		StdOut.println(6 == minPosition(new double[] { 1, -4, -7, 7, 8, 11, -9 }));

		// test distanceBetweenMinAndMax( double[])
		StdOut.println("\ndistanceBetweenMinAndMax:");
		StdOut.print("0 == distanceBetweenMinAndMax(new double[] { -7 }) ");
		StdOut.println(0 == distanceBetweenMinAndMax(new double[] { -7 }));

		StdOut.print("3 == distanceBetweenMinAndMax(new double[] { 1, -4, -7, 7, 8, 11 }) ");
		StdOut.println(3 == distanceBetweenMinAndMax(new double[] { 1, -4, -7, 7, 8, 11 }));

		StdOut.print("5 == distanceBetweenMinAndMax(new double[] { -13, -4, -7, 7, 8, 11 }) ");
		StdOut.println(5 == distanceBetweenMinAndMax(new double[] { -13, -4, -7, 7, 8, 11 }));

		StdOut.print("1 == distanceBetweenMinAndMax(new double[] { 1, -4, -7, 7, 8, 11, -9 }) ");
		StdOut.println(1 == distanceBetweenMinAndMax(new double[] { 1, -4, -7, 7, 8, 11, -9 }));
	
		// test numUnique( double[] )
		StdOut.println("\nnumUnique:");
		StdOut.print("0 == numUnique(new double[] { }) ");
		StdOut.println(0 == numUnique(new double[] { }));

		StdOut.print("1 == numUnique(new double[] { 11 }) ");
		StdOut.println(1 == numUnique(new double[] { 11 }));

		StdOut.print("1 == numUnique(new double[] { 11, 11, 11, 11 }) ");
		StdOut.println(1 == numUnique(new double[] { 11, 11, 11, 11 }));

		StdOut.print("8 == numUnique(new double[] { 11, 11, 11, 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88, 88 }) ");
		StdOut.println(8 == numUnique(new double[] { 11, 11, 11, 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88, 88 }));

		StdOut.print("8 == numUnique(new double[] { 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88 }) ");
		StdOut.println(8 == numUnique(new double[] { 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88 }));

		// test removeDuplicates( double[])
		StdOut.println("\nremoveDuplicates:");
		StdOut.print("new double[] { } == removeDuplicates(new double[] { }) ");
		StdOut.println(Arrays.equals(new double[] { }, removeDuplicates(new double[] { })));

		StdOut.print("new double[] { 11 } == removeDuplicates(new double[] { 11 }) ");
		StdOut.println(Arrays.equals(new double[] { 11 }, removeDuplicates(new double[] { 11 })));

		StdOut.print("new double[] { 11 } == removeDuplicates(new double[] { 11, 11, 11, 11 }) ");
		StdOut.println(Arrays.equals(new double[] { 11 }, removeDuplicates(new double[] { 11, 11, 11, 11 })));

		StdOut.print("new double[] { 11, 22, 33, 44, 55, 66, 77, 88 } == removeDuplicates(new double[] { 11, 11, 11, 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88, 88 }) ");
		StdOut.println(Arrays.equals(new double[] { 11, 22, 33, 44, 55, 66, 77, 88 }, removeDuplicates(new double[] { 11, 11, 11, 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88, 88 })));

		StdOut.print("new double[] { 11, 22, 33, 44, 55, 66, 77, 88 } == removeDuplicates(new double[] { 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88 }) ");
		StdOut.println(Arrays.equals(new double[] { 11, 22, 33, 44, 55, 66, 77, 88 }, removeDuplicates(new double[] { 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88 })));

	}
}
