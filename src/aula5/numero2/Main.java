package aula5.numero2;

public class Main {

	public static void main(String[] args) {
		VetorR3 v1 = new VetorR3();
		v1.x = 2;
		v1.y = 3;
		v1.z = 4;
		
		VetorR3 v2 = new VetorR3();
		v2.x = 5;
		v2.y = 7;
		v2.z = 2;
		
		
		//os métodos somar e subtrair retornam um VetorR3
		//por este motivo criamos estes dois objetos
		VetorR3 resultSoma = v1.somar(v2);
		VetorR3 resultSubtracao = v1.subtrair(v2);
		
		//com os dois objetos, só temos que imprimir cada atributo deles
		System.out.println("v1 + v2 = (" + resultSoma.x +", " + resultSoma.y + ", " + resultSoma.z + ")" );
		System.out.println("v1 - v2 = (" + resultSubtracao.x +", " + resultSubtracao.y + ", " + resultSubtracao.z + ")" );
		
		System.out.println("Norma de Manhattan de v1 =  "+ v1.manhattan());
		System.out.println("Norma Euclideana de v1 =  "+ v1.euclides());
		System.out.println("Norma de Chebyshev de v1 =  "+ v1.chebyshev());
		System.out.println("Produto interno de v1 x v2 =  "+ v1.produtoInterno(v2));
		

	}

}
