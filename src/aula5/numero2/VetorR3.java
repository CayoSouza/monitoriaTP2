package aula5.numero2;

/**
 * Classe que representa um vetor em R3 com suas três coordenadas x, y, z
 *
 */
public class VetorR3 {
	public int x, y, z;
	
	
	/**
	 * Soma os valores absolutos das coordenadas
	 * @return int
	 */
	public int manhattan(){
		return Math.abs(x)
			+ Math.abs(y)
			+ Math.abs(z);
	}
	
	/**
	 * Raiz quadrada da soma dos quadrados das coordenadas
	 * @return double
	 */
	public double euclides(){
		/* Math.sqrt() significa "square root"(raiz quadrada)
		Math.pow(a,b) eleva "a" à potência "b" */
		return Math.sqrt(Math.pow(x, 2)
							+ Math.pow(y, 2)
							+ Math.pow(z, 2));
	}
	
	/**
	 * Retorna o maior valor absoluto entre as coordenadas
	 * @return int
	 */
	public int chebyshev(){
		int absX = Math.abs(x);
		int absY = Math.abs(y);
		int absZ = Math.abs(z);
		
		/* usamos o Math.max duas vezes pois este método retorna o maior de
		dois números. Então primeiro pegamos o maior entre X e Y
		e depois o maior entre o maior dos dois e Z */
		return Math.max(Math.max(absX, absY), absZ);
	}
	
	/**
	 * Realiza o produto interno entre dois vetores
	 * @param segundoVetor
	 * @return int
	 */
	public int produtoInterno(VetorR3 segundoVetor){
		/* criamos variaves para auxiliar e deixar a conta de retorno
		mais semântica */
		int xLinha = segundoVetor.x;
		int yLinha = segundoVetor.y;
		int zLinha = segundoVetor.z;
		
		//efetuamos a aritmética do produto interno  
		return x * xLinha +
				y * yLinha +
				z * zLinha;
	}
	
	/**
	 * Soma o primeiro com o segundo vetor fornecido por parâmetro
	 * @param segundoVetor
	 * @return VetorR3
	 */
	public VetorR3 somar(VetorR3 segundoVetor){
		//criamos um vetor auxiliar
		VetorR3 soma = new VetorR3();
		
		/* 
		o this serve para indicar que estamos falando de algum recurso
		deste mesmo objeto. Neste caso em específico não faria diferença
		usar o this ou não, mas pela semântica eu optei por usar.
		No entanto em caso de recursos com mesmo nome, o this é essencial
		para diferenciar
		 */
		soma.x = this.x + segundoVetor.x;
		soma.y = this.y + segundoVetor.y;
		soma.z = this.z + segundoVetor.z;
		return soma;
	}
	
	
	/**
	 * Subtrai o primeiro pelo segundo vetor fornecido por parâmetro
	 * @param segundoVetor
	 * @return VetorR3
	 */
	public VetorR3 subtrair(VetorR3 segundoVetor){
		VetorR3 subtracao = new VetorR3();
		
		subtracao.x = this.x - segundoVetor.x;
		subtracao.y = this.y - segundoVetor.y;
		subtracao.z = this.z - segundoVetor.z;
		
		return subtracao;
	}
}
