package aula2.arraySomaEquilibrada;

public class Main {

	public static void main(String[] args) {
		int[] array = {1,1,1,1,5,4,5};
		
		System.out.println(somaEquilibrada(array));
	}

	static boolean somaEquilibrada(int[] array) {
		int soma = 0;
		
		//percorre o array e soma todos os elementos
		for(int elem : array)
			soma += elem;
		
		int segundaSoma = 0;
		
		//percorre novamente e vai somando e checando gradativamente se esta segundaSoma já é equivalente
		//à metade da soma total, se isto for verdade, o array tem soma equilibrada e retorna true
		//caso contrário, após a busca, restorna false
		for(int elem : array){
			segundaSoma += elem;
			if(segundaSoma == soma/2)
				return true;		
		}
		
		return false;
	}

}
