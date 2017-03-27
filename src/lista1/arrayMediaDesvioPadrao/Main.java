package lista1.arrayMediaDesvioPadrao;

public class Main {
	
	static double calculaMedia(double[] array){
		double soma = 0;
		
		//percorre o array somando cada um dos seus elementos e incrementando a vari�vel soma
		for(double elem : array)
			soma += elem;
		
		double numeroDeElementos = array.length;
		double media = soma / numeroDeElementos;
		
		return media;
	}
	
	static double calculaVariancia(double[] array){
		double media = calculaMedia(array);
		double result = 0;
		
		//percorre o array calculando o resultado de cada elemento subtra�do da m�dia, tudo isso ao quadrado utilizando o Math.pow(numero, potencia)
		for(double elem : array)
			result += Math.pow((elem-media),2);
		
		//calcula a variancia dividindo a soma dos quadrados da diferen�a dos elementos e m�dia, dividido pelo n�mero de elementos
		double variancia = result / array.length;
		
		return variancia ;
	}
	
	static double calculaDesvioPadrao(double[] array){
		double variancia = calculaVariancia(array);
		
		//calcula a ra�z quadrada da variancia atrav�s do m�todo square root
		double desvioPadrao = (double) Math.sqrt(variancia);
		
		return desvioPadrao;
	}

	public static void main(String[] args) {
		double[] array = {1, 2, 3, 4.3, 5, 6.2, 7, 8.3, 9};
		
		//aplica a formata��o de 2 casas decimais
		String media = String.format("%.2f", calculaMedia(array));
		String variancia = String.format("%.2f", calculaVariancia(array));
		String desvioPadrao = String.format("%.2f", calculaDesvioPadrao(array));
		
		
		
		System.out.println("A m�dia � "+ media);
		System.out.println("A vari�ncia � "+ variancia);
		System.out.println("O desvio padr�o � "+ desvioPadrao);
	}

}
