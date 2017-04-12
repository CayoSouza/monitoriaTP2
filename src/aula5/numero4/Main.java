package aula5.numero4;

public class Main {
	public static void main(String[] args){
		ConjuntoDados c = new ConjuntoDados();
		
		c.adicionarValor(1.2f);
		c.adicionarValor(2.5f);
		c.adicionarValor(4.1f);
		c.adicionarValor(-2.2f);
		
		System.out.println("O maior n�mero do conjunto �: " + c.maximo());
		System.out.println("O menor n�mero do conjunto �: " + c.minimo());
		System.out.println("A m�dia do conjunto �: " + String.format("%.2f",c.media()));
		System.out.println("O desvio padr�o do conjunto �: " + String.format("%.2f",c.desvioPadrao()));
	}
}
