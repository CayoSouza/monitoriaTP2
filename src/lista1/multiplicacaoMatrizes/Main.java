package lista1.multiplicacaoMatrizes;

public class Main {
	
	static int[][] multMatriz(int[][] m1, int[][] m2){
		// Am.n x Bp.q = Cm.q => n = p
		int m, n, p, q;
		
		m = m1.length;
		n = m1[0].length;
		p = m2.length;
		q = m2[0].length;
		
		//checa se as matrizes são compatíveis e retorna 0 se não forem
		if(n != p)
			return new int[][]{{0}};
			
		//matriz resultante = Cm.q
		int[][] result = new int[m][q];
		
		for(int i=0; i<m; i++)
			for(int j=0; j<q; j++)
				for(int k=0; k<n; k++)
					result[i][j] +=  m1[i][k] * m2[k][j];
			
		return result;
	}

	public static void main(String[] args) {
		int[][] m1 = new int[][]{
				{1, 2},
				{3, 4},
				{5, 6},
				{2, 3}
		};
		
		int[][] m2 = new int[][]{
			{4, 3, 2},
			{2, 1, 4}
		};
		// Am.n x Bp.q = Cm.q => n = p
		int n, q;
		
		n = m1[0].length;
		q = m2[0].length;
	
		int[][] result = multMatriz(m1, m2);
		
		for(int[] linha : result)
			for(int col=0; col<linha.length; col++){
				System.out.print(linha[col] + " ");
				//daqui pra baixo logica de formatacao (pular linha)
				if(n > q){
					if(col == n-1)
						pulaLinha();	
				}
				else if(col == q-1)
					pulaLinha();
			}
		

	}

	static void pulaLinha() {
		System.out.print("\n");
	}

}
