package controller;

public class LowerValueController {
	
	public LowerValueController() {
		super();
	}
	
	public int lowerValue(int array[], int size, int lower) {
//		Quando 'tamanho' = 0, significa que o vetor foi percorrido completamente
		if(size == 0) {
			return lower;
		} else {
			if(array[size - 1] < lower) {
				lower = array[size - 1];
			}
//		O metodo e chamado de forma que seja executado na posicao anterior do vetor
			return lowerValue(array, size - 1, lower);
		}
	}
}
