package aula2.arrayContainsIndexOf;

public class Main {
	
	static boolean contains(int procurado, int[] array){
		//percorre o array comparando cada elemento com o X fornecido, no primeiro que achar, a fun��o retorna true
		for(int i : array)
			if(i==procurado)
				return true;
		
		return false;
	}
	
	static int indexOf(int procurado, int[] array){
		//percorre o array comparando cada elemento com o elemento que est� sendo procurado. 
		//Se achar, � devolvido a posi��o daquele elemento, caso contr�rio retorna -1(implementa��o padr�o);
		for(int i=0; i<array.length; i++)
			if(array[i]==procurado)
				return i;
		
		return -1;
	}

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		
		System.out.println(contains(5, array));
		System.out.println(indexOf(5, array));
	}

}
