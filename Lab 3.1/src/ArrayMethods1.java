import java.util.Arrays;

public class ArrayMethods1 {
	
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
		
	
	
	
	public static void insertionSort(int [] list1) {
		for(int i = 0; i < list1.length-1; i++) {
			int swap1 =0;
			boolean swap2 = swap1 > list1[i];
			if(list1[i] < list1[i+1]) {
				swap(list1, i, i+1);
				swap1 = list1[i];
			}
			if(swap2) {
				swap(list1, swap1, i);
			}
		}
	}
	
	
	public static void selectionSort(double [] list1) {
		
		for(int i = 0; i < list1.length-1; i++) {
			int min = 0;
			if(list1[i] < list1[min]) {
				selectionSwap(list1,  min, i);
				min = i;
			}
		
			if(min > list1[i]) {
				selectionSwap(list1,  min, i);
				min = i;
			}
		}
	}
	
	
	public static void bubbleSort(String [] list1) {
		
		for(int i = 0; i < list1.length-1; i++) {
				if(list1[i].compareTo(list1[i+1])>0) {
					bubbleSwap(list1, i, i+1);
				}
			}
	}
			
		
	
	
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







