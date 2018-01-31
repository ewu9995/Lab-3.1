import java.util.Arrays;

public class ArrayMethods1 {
	
	//Testing code
	public static void main(String[] args) {
		int[] test1 = {1,4,4,5,2,4,3,17,0};
		double[] test2 = {1.1,4.1,5.0,2.0,4.0,3.0,17.0,0.0};
		String[] test3 = {"zebra", "tortilla", "abba", "foo", "bar", "aba"};
	
		long start = System.nanoTime();
		insertionSort(test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Test1 took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(test1));
		
		start = System.nanoTime();
		selectionSort(test2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test2 took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(test2));
		
		start = System.nanoTime();
		bubbleSort(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test3 took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(test3));
	
	}
		
	
	//Insertion Sort
	public static void insertionSort(int [] list1) {
		for(int i = 0; i < list1.length-1; i++) {
			for(int j =0; j<list1.length-i-1; j++) {
				if(list1[j] > list1[j+1]) {
					swap(list1,  j, j+1);
					}
				}
					
			}
		}
	



	//Selection Sort 
	public static void selectionSort(double [] list1) 
	{	
		int x = 0;
		while(x>0) {
		for(int i = 0; i < list1.length-1; i++)
		{
			int min = i;
			double pos = list1[i];
	
			for (int j = i+1; j < list1.length; j++) 
			{
				if(list1[j] < pos)
				{ 
				min = j;
				pos = list1[j];
				}
			}
				selectionSwap(list1,  min, i);
			}
			}
		}

		/* self note
		 * 
		 * while loop is running
		 * first value loop = min value
		 * min gets cycled through loop
		 * if min is greater than a number min swaps
		 * new number becomes min
		 * 
		 */
		
			
	
	
	//Bubble Sort
	//loops through to find a number that is less than and swaps; greater number checks again
	public static void bubbleSort(String [] list1) {
		
		for(int i = 0; i < list1.length-1; i++) {
			for(int j =0; j <list1.length-i-1; j++)	{
			if(list1[j].compareTo(list1[j+1])>0) {
					bubbleSwap(list1, j, j+1);
				}
				}
		}
	}
		/*bubble sort example for use
		 * first loop:
		 *  3|2|1  --> 2|3|1 --> 2|1|3
		 */
		
	
	
	public static void swap(int []arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static void bubbleSwap(String []arr, int index1, int index2) {
		String temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static void selectionSwap(double []arr, int index1, int index2) {
		double temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
	






