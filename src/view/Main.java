package view;

import controller.LowerValueController;

public class Main {

	public static void main(String[] args) {
		
		LowerValueController lv = new LowerValueController();
		
		int[] array = {7,5,-4,2,1,6,40,17};
		
		System.out.println(lv.lowerValue(array, array.length, array[array.length-1]));
	}

}
