package basics;

public class MinMax {

	public static void main(String[] args) {
		int[] num = {11,23,13,24,53};
			System.out.println("Maximum value is: " + sMax(num));
			System.out.println("Minimum value is: " + sMin(num));
			System.out.println("Average value is: " + fAve(num));
	}
	
	
	public static int sMax(int[]arr) {
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
				
			}
		}
		return max;
	}
	public static int sMin(int[]arr) {
		int min = arr[0];
		for( int i=0;i<arr.length;i++) {
			if(arr[i]< min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int fAve(int[]arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
	        sum = sum + arr[i];
		}
	    return sum / arr.length;
	}
	}
	


