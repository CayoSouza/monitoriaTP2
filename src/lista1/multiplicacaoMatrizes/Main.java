package lista1.multiplicacaoMatrizes;

public class Main {
	
	static int[][] multMatriz(int[][] m1, int[][] m2){
		//formula da multiplicação de matrizes: Am.n x Bp.q = Cm.q | n = p
		int m, n, p, q;
		
		m = m1.length;
		n = m1[0].length;
		p = m2.length;
		q = m2[0].length;
		
		//checa se as matrizes são compatíveis e retorna 0 se não forem
		if(n != p)
			return new int[][]{{0}};
			
		//sabemos que matriz resultante = Cm.q, então já podemos criar com o tamanho exato
		int[][] matrizResultante = new int[m][q];
		
		//percorre cada elemento da matriz, e multiplica cada elemento correspondente à mesma posição k
		//referente às linhas e colunas das respectivas matrizes m1 e m2
		//o resultado é somado e atribuído à posição da matriz referente à [linha][coluna] verificada
		for(int linha=0; linha < m; linha++)
			for(int coluna=0; coluna < q; coluna++)
				for(int i=0; i < n; i++)
					matrizResultante[linha][coluna] +=  m1[linha][i] * m2[i][coluna];
			
		return matrizResultante;
	}

	public static void main(String[] args) {
		int[][] m1 = new int[][]{
				{1, 2, 1, 4},
				{3, 4, 1, 4}
		};
		
		int[][] m2 = new int[][]{
			{4, 3, 2},
			{2, 1, 4},
			{1, 1, 1},
			{2, 2, 2}
		};
		
		// Am.n x Bp.q = Cm.q | n = p
		int n, q;
		
		n = m1[0].length;
		q = m2[0].length;
	
		int[][] result = multMatriz(m1, m2);
		
		//percorre o array de resultado imprimindo cada elemento. Como não precisamos saber o index da linha, usamos o for each
		//e como precisamos saber o índice da coluna somente por motivos de formatação, usamos o for convencional
		for(int[] linha : result)
			for(int coluna=0; coluna < q; coluna++){
				System.out.print(linha[coluna] + " ");
				//logica de formatacao (pular linha) para facilitar a leitura
				if(coluna == q-1)
					pulaLinha();
			}
		

	}

	static void pulaLinha() {
		System.out.print("\n");
	}

}
