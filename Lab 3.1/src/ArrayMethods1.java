import java.util.Arrays;

/*
 * Evan Wu
 * Period 2 AP CSA
 * Lab 3.1
 */

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
		for(int i = 0; i < list1.length-1; i++) { //outer loop looking for an array smaller than the initial array
		//i is the value being sorted up the array
			for(int j= i+1 ; j  > 0 ; j--) { //j is the right value , j-1 is i
				//j counts down
				//j cant be less than or equal to zero as negative numbers return error
				if(list1[j] < list1[j-1]) { //if right value is less than value being sorted, they swap
					swap(list1,  j, j-1);
					}
			}
		}
		}
	//all items to left is smaller
	//when value right < value being sorted
	//right value gets sorted down; it goes towards the left until it reaches correct position


	//video used to understand how insertion sort works: https://www.youtube.com/watch?v=lCDZ0IprFw4
	//reference/parts of code derived from: http://www.java2novice.com/java-sorting-algorithms/insertion-sort/
	
	
	/*
	 * This also works?
	public static void insertionSort(int [] list1) {
		for(int i = 0; i < list1.length-1; i++) {
			for(int j =0; j<list1.length-i-1; j++) {
				if(list1[j] > list1[j+1]) {
					swap(list1,  j, j+1);
					}
				}
					
			}
		}
	
	*/



	
	//Selection Sort 
	public static void selectionSort(double [] list1) 
	{	
		for(int i = 0; i < list1.length; i++) //loop that finds the first value
		{
			//first value it finds becomes the minimum value
			int min = i;
			double pos = list1[i];
			
			for (int j = i+1; j < list1.length; j++) //loops through all values that come after i; j is value designation
			{
				if(list1[j] < pos) //compares values after i with j
				{ 
				//if j is less than current min, which is i, j becomes the new min
				min = j;  
				pos = list1[j];
				}
			}
				selectionSwap(list1,  min, i); //min(j) is swapped with i
			}
		}
	
	//video used as a guide: https://www.youtube.com/watch?v=cqh8nQwuKNE
	
			
	
	
	//Bubble Sort
	//loops through to find a number that is less than and swaps; greater number checks again
	//stops when everything is sorted
	public static void bubbleSort(String [] list1) {
	boolean swap = true;
	while(swap) { //while loop is used as there is a limited number of loops before everything gets sorted
		swap=false;
		for(int i = 0; i < list1.length-1; i++) { //loops through the loop; first value becomes current value i
			if(list1[i].compareTo(list1[i+1])>0) { // if the value to the right of a value is less than the current value
					bubbleSwap(list1, i, i+1);     // the values swap
					swap = true; //swap is counted
				}
				}
		}
	}
	
	
	//video used as guide: https://www.youtube.com/watch?v=F13_wsHDIG4
	
	//swap methods
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
	






