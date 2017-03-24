package lista1.array.soma.equilibrada;

public class Main {

	public static void main(String[] args) {
		int[] array = {1,1,1,1,5,4,5};
		
		System.out.println(somaEquilibrada(array));
	}

	static boolean somaEquilibrada(int[] array) {
		int soma = 0;
		for(int elem : array)
			soma += elem;
		
		int segundaSoma = 0;
		for(int elem : array){
			segundaSoma += elem;
			if(segundaSoma == soma/2)
				return true;		
		}
		
		return false;
	}

}
