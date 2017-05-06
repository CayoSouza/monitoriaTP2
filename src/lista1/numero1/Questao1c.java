package lista1.numero1;

import java.util.ArrayList;

public class Questao1c {
	
	public static int buscaElementoRecursivo(int buscado, ArrayList<Integer> lista){
		if(lista.size() == 0)
			return -1;
		else if(buscado != lista.get(lista.size() - 1)){
			lista.remove(lista.size() - 1);
			return buscaElementoRecursivo(buscado, lista);
		}
		else{
			return lista.size()-1;
		}
	}

	public static void main(String[] args) {
		
//		int[] intList = new int [TAM];
//		
//		for(int pos = 0; pos < TAM; pos++){
//			intList[pos] = pos;
//		}
		
		int TAM = 4000;
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int pos = 0; pos < TAM; pos++){
		list.add(pos);
	}
		
		System.out.println(buscaElementoRecursivo(2678, list));

	}

}
