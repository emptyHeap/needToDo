package study;

import java.util.Random;

public class Randomizer {
	static double num;
	static Random R = new java.util.Random();
	
	public static double getDouble(){
		return R.nextDouble();
	}
	
	public static Comparable[] getArray(int length){
		Comparable[] result = new Comparable[length];
		for (int i = 0; i < length; i++){
			result[i] = R.nextDouble();
		}
		return result;
	}
}
