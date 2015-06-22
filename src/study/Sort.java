package study;

public abstract class Sort {
	/**
	 * потомок должен проверятся!
	 * 
	 * @param args массив в строковом виде (если не приводится к int то используется лексикографическиая сортиворка)
	 */
	public static void main(String[] args){
		Comparable[] array = new Comparable[args.length];
		for (int i = 0; i < args.length; i++){
			try{
				array[i] = Integer.parseInt(args[i]);
			}catch(NumberFormatException e){
				array = args;
				break;
			}
		}
		print(array);
		sort(array);
		print(array);
		System.out.println("array is sorted: " + isSort(array));
	}
	public static boolean isSort(Comparable[] array){
		for (int i = 0; i < array.length-1; i++){
			if (less(array,i,i+1)) return false;
		}
		return true;
	}
	/**
	 * элемент с первым индексом меньше элемента со вторым?
	 * 
	 * @param array массив в котором сравниваются элементы
	 * @param firstIndex первый индекс
	 * @param secondIndex второй индекс 
	 * @return результат
	 */
	public static boolean less(Comparable[] array, int firstIndex, int secondIndex){
		return array[firstIndex].compareTo(array[secondIndex]) < 0;
	}
	/**
	 * первый элемент меньше второго?
	 * 
	 * @param first первый элемент
	 * @param second второй элемент
	 * @return результат
	 */
	public static boolean less(Comparable first, Comparable second){
		return first.compareTo(second) < 0;
	}
	/**
	 * Меняет элементы массива местами
	 * 
	 * @param array массив
	 * @param i индекс первого элемента
	 * @param j индекс второго элемента
	 */
	public static void exch(Comparable[] array, int i, int j){
		Comparable buffer = array[i];
		array[i] = array[j];
		array[j] = array[i];
	}
	/**
	 * Отобразить элементы массива в консоли
	 * 
	 * @param array массив
	 * @oaran delimiter разделитель
	 */
	public static void print(Comparable[] array, String delimiter){
		for (Comparable element: array){
			System.out.println(element);
		}
	}
	/**
	 * Отобразить элементы массива в консоли(стандартный разделитель)
	 * 
	 * @param array массив
	 */
	public static void print(Comparable[] array){
		print(array, "\n");
	}
	/**
	 * Сортировка должна уметь сортировать!
	 * Здесь сортировки нет!
	 * 
	 * @param array массив, который требуется отсортировать
	 */
	public static void sort(Comparable[] array) {
	}
}
