package lista1.numero3;

import java.util.ArrayList;

public class TrianguloDePascal {
	
	
	public static int [] linhaPascal (int n){
		int[] linha = new int[n];
		
		for (int i = 0; i < n; i++) 
			linha[i] = coefBinomial(n-1, i);
		
		return linha;
	}
	
	public static int coefBinomial(int n, int k){
		if(k == 0 || k == n){
			return 1;
		}
		else return coefBinomial(n-1, k-1) + coefBinomial(n-1, k);
	}
	
	public static void letraC(){
		for(int j = 1; j <= 4; j++){
			int[] vetor = linhaPascal(5*j);
			int soma = 0;
			for(int i: vetor){
				System.out.print(i + " ");
				soma += i;
			}
			System.out.print("| Soma = " + soma + " ");
			System.out.print("| É uma potência de 2? " + (checaPotenciaDe2(soma)? "SIM" : "NÃO"));
			System.out.println();
		}
	}
	
	public static boolean checaPotenciaDe2(int n){
		if(n == 2)
			return true;
		
		else if (((n/2) % 2) == 0)
			return checaPotenciaDe2(n/2);
		
		else
			return false;

	}

	public static void main(String[] args) {
		//System.out.println(coefBinomial(1,1));
		
//		int[] vetor = linhaPascal(6);
//		
//		for(int i: vetor)
//			System.out.print(i + " ");
		
		letraC();
		
//		System.out.println(checaPotenciaDe2(16));

	}

}
