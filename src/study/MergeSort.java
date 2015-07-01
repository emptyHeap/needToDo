package study;

public class MergeSort extends Sort{

	static Comparable[] buffer;
	
	public static void main(String[] args){
		Comparable[] array = Randomizer.getArray(100);
		sort(array);
		print(array);
		System.out.println(isSort(array));
	}
	
	
	/**
	 * Слияние части массива
	 * !порядок индексов не проверяется
	 * (возможен цикл с nullPointer при <a> low mid high)
	 * 
	 * @param array начальный массив
	 * @param low нижний индекс
	 * @param mid средний индекс
	 * @param high верхний индекс
	 */
	public static void merge(Comparable[] array, int low, int mid, int high){

		int firstIndex = low;
		int secondIndex = mid+1;
		for (int k = low; k <= high; k++){
			buffer[k] = array[k];
		}
		for (int k = low; k <= high; k++){
			if (firstIndex > mid)			array[k] = buffer[secondIndex++];
			else if (secondIndex > high)	array[k] = buffer[firstIndex++];
			else if (less(buffer, secondIndex, firstIndex))	array[k] = buffer[secondIndex++];
			else 							array[k] = buffer[firstIndex++];
		}
	}
	/**
	 * Сортировка массива
	 * 
	 * @param array
	 */
	public static void sort(Comparable[] array){
		buffer = new Comparable[array.length];
		sort(array, 0, array.length - 1);
	}
	/**
	 * Частичная сортировка массива
	 * 
	 * @param array
	 * @param low
	 * @param high
	 */
	public static void sort(Comparable[] array, int low, int high){
		if (high <= low) return;
		int mid = low + (high - low) / 2;
		sort(array, low, mid);
		sort(array, mid + 1, high);
		merge(array, low, mid, high);
		
	}
}
