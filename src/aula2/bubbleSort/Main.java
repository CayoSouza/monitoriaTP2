package aula2.bubbleSort;

public class Main {
	
	public static void bubbleSort(int[] array){
		for(int i = 0; i<array.length-2; i++)
			for(int j = 0; j<array.length-1-i; j++){
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
	}

	public static void main(String[] args) {
		int[] array = {9,8,7,6};
		bubbleSort(array);
		
		for(int i : array)
			System.out.print(i + " ");
	}

}
