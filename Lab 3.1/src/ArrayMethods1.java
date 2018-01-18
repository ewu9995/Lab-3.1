
public class ArrayMethods1 {
	
	public static void main(String[] args) {
		int[] list1 = {2,4,6,7,8,3,1};
		bubbleSort(args);
		Systen.out.println
	}
		
	
	
	
	public static void insertionSort(int [] list1) {
		
	}
	
	
	public static void selectionSort(double []list1) {
		
	}
	
	
	public static void bubbleSort(String [] list1) {
		
		for(int i = 0; i < list1.length-1; i++) {
			int a = Integer.parseInt(list1[i]);  
			int b = Integer.parseInt(list1[i+1]);	
			boolean c = a>b;
			if(c) {
				bubbleSwap(list1, a, b);
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







