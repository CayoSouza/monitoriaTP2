package lista1.arrayMediaDesvioPadrao;

public class Main {
	
	static double calculaMedia(double[] array){
		double soma = 0;
		
		//percorre o array somando cada um dos seus elementos e incrementando a variável soma
		for(double elem : array)
			soma += elem;
		
		double numeroDeElementos = array.length;
		double media = soma / numeroDeElementos;
		
		return media;
	}
	
	static double calculaVariancia(double[] array){
		double media = calculaMedia(array);
		double result = 0;
		
		//percorre o array calculando o resultado de cada elemento subtraído da média, tudo isso ao quadrado utilizando o Math.pow(numero, potencia)
		for(double elem : array)
			result += Math.pow((elem-media),2);
		
		//calcula a variancia dividindo a soma dos quadrados da diferença dos elementos e média, dividido pelo número de elementos
		double variancia = result / array.length;
		
		return variancia ;
	}
	
	static double calculaDesvioPadrao(double[] array){
		double variancia = calculaVariancia(array);
		
		//calcula a raíz quadrada da variancia através do método square root
		double desvioPadrao = (double) Math.sqrt(variancia);
		
		return desvioPadrao;
	}

	public static void main(String[] args) {
		double[] array = {1, 2, 3, 4.3, 5, 6.2, 7, 8.3, 9};
		
		//aplica a formatação de 2 casas decimais
		String media = String.format("%.2f", calculaMedia(array));
		String variancia = String.format("%.2f", calculaVariancia(array));
		String desvioPadrao = String.format("%.2f", calculaDesvioPadrao(array));
		
		
		
		System.out.println("A média é "+ media);
		System.out.println("A variância é "+ variancia);
		System.out.println("O desvio padrão é "+ desvioPadrao);
	}

}
