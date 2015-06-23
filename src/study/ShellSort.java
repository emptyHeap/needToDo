package study;

public class ShellSort extends Sort{
	private static int multiplier = 3;
	
	/**
	 * меняет множитель шага
	 * =(
	 * 
	 * @param multiplier новый множитель шага
	 */
	private static void changeMultiplier(int multiplier){
		ShellSort.multiplier = multiplier;
	}
	
	public static void main(String[] args){
		Comparable[] array = Randomizer.getArray(100);
		sort(array);
		print(array);
		System.out.println(isSort(array));
	}
	
	public static void sort(Comparable[] array){
		int N = array.length;
		int h = 1;
		while (h < N/multiplier){h = multiplier*h + 1;}

		while (h >= 1){
			for (int i = h; i < N; i++){
				for (int j = i; j>=h && less(array, j, j-h); j-=h ){
					exch(array, j, j-h);
				}
			}
			h /= 3;
		}
		
	}
}
