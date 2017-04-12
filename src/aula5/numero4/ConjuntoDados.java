package aula5.numero4;

import java.util.ArrayList;

public class ConjuntoDados {
	public ArrayList<Float> numeros;

	//ao criar o objeto ConjuntoDados, instancia o arraylist e atribui � vari�vel numeros
	public ConjuntoDados() {
		numeros = new ArrayList<Float>();
	}

	//recebe um numero e adiciona ao ArrayList
	public void adicionarValor(float numero) {
		this.numeros.add(numero);
	}

	public float minimo() {
		//testa se existem elementos no array
		if (this.numeros.size() > 0) {
			
			//atribui ao "menor" o maior valor poss�vel para posteriormente ser comparado
			//pois qualquer outro n�mero � menor que este valor, menos ele mesmo. Logo,
			//no pior dos casos, existir� um elemento que ser� o maior valor em float 
			//e ele ser� retornado no final.
			float menor = Float.MAX_VALUE;
			
			//percorre o array de numeros comparando cada elemento com o "menor" definido acima
			//se achar algum elemento menor do que o "menor", o "menor" recebe o elemento em quest�o
			//e continua testando para todos os elementos
			for (float elem : this.numeros) {
				if (elem < menor)
					menor = elem;
			}
			
			//ap�s testar todos os elementos, retorna o "menor"
			return menor;
		} else
			return 0.000f;
	}
	
	//an�logo ao m�nimo, por�m usando o outro extremo, m�ximo
	public float maximo() {
		if (this.numeros.size() > 0) {
			
			//inicializa a vari�vel com o menor valor poss�vel de float
			float maior = Float.MIN_VALUE;
			
			//testa se existe algum elemento maior do que o "maior"
			for (float elem : this.numeros) {
				if (elem > maior)
					maior = elem;
			}
			return maior;
		} else
			return 0.000f;
	}

	public float media() {
		int quantidadeDeElementos = this.numeros.size();
		if (quantidadeDeElementos > 0) {
			float soma = 0;
			
			//percorre o array somando todos os elementos
			for (float elem : this.numeros)
				soma += elem;
			
			//divide pela quantidade de elementos do arraylist numeros
			float media = soma / quantidadeDeElementos;
			return media;
		} else
			return 0.000f;
	}

	public float desvioPadrao() {
		//cria a variavel local media recebendo o valor da media do arraylist numeros
		float media = this.media();
		float result = 0;
		
		//percorre o array somando os quadrados das diferen�as dos elementos e m�dia
		for (float elem : this.numeros)
			result += Math.pow((elem - media), 2);
		
		float quantidadeDeElementos = this.numeros.size();
		
		//calcula a vari�ncia dividindo o resultado do algoritmo acima pela
		//quantidade de elementos do arraylist numeros
		float variancia = result / quantidadeDeElementos;
		
		//calcula o desvio padr�o tirando a raiz quadrada da variancia
		float desvioPadrao = (float) Math.sqrt(variancia);
		
		return desvioPadrao;
	}
}
