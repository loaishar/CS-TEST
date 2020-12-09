/**
 * This class represents a skeleton for the mid-term of Intro2CS course (Ariel
 * U. CS). Please implement the static functions below.
 */

public class Bohan {
	public static String myID = "206706285"; // make sure you update your ID.

	public static String[] stringArr2Set(String[] a) {
		int[] str2 = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					str2[j] = j;
				}
			}
		}
		int resultLength = 0;
		for (int i = 0; i < str2.length; i++) {
			if (str2[i] == 0) {
				resultLength++;
			}
		}
		String[] result = new String[resultLength];
		int index = 0;
		int j = 0;
		for (int i = 0; i < str2.length; i++) {
			index = str2[i];
			if (index == 0) {
				result[j] = a[i];
				j++;
			}
		}

		for (String eachString : result) {
			System.out.println(eachString);
		}

		return null;
	}

	public static int maxMonotoneIncArr(double[] a) {
		int n=a.length;
		double arr[] = new int[n]; 
          int i,j,max = 0; 
  
           for ( i = 0; i < n; i++ ) 
		   arr[i] = 1; 
  
           for ( i = 1; i < n; i++ ) 
              for ( j = 0; j < i; j++ )  
                         if ( arr[i] > arr[j] &&  
						 arr[i] < arr[j] + 1) 
								  arr[i] = arr[j] + 1; 
  
           for ( i = 0; i < n; i++ ) 
              if ( max < arr[i] ) 
                 max = arr[i]; 
  
            return max; 
    }

	public static int sumOf2() {
		int sum=0;
		int max=6;
		int min=0;
		int first = Math.random() * (max - min + 1) + min;
		int second = Math.random() * (max - min + 1) + min;
		sum=first+second;

		return sum;
	}

	public static double evenSumProb() {
		return -1;
	}

	public static int intersectionSetSize(int[][] a, int[][] b) {
		int c = 0;

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {

				// print element value for equal
				// elements else *
				if (A[i][j] == B[i][j])
					c++;
			}

		}
		return c;
	}
}
