package aula5.numero2;

public class VetorR3 {
	public int x, y, z;
	
	public int manhattan(){
		//Math.abs retorna o valor absoluto do n�mero
		return Math.abs(x)
			+ Math.abs(y)
			+ Math.abs(z);
	}
	
	public double euclides(){
		//Math.sqrt() tira o "square root"(raiz quadrada)
		//Math.pow(a,b) ele a � pot�ncia b
		return Math.sqrt(Math.pow(x, 2)
							+ Math.pow(y, 2)
							+ Math.pow(z, 2));
	}
	
	public int chebyshev(){
		int absX = Math.abs(x);
		int absY = Math.abs(y);
		int absZ = Math.abs(z);
		
		//usamos o Math.max duas vezes pois este m�todo retorna o maior de
		//dois n�meros, ent�o primeiro pegamos o maior entre X e Y
		//e depois o maior entre (x, y) e z
		return Math.max(Math.max(absX, absY), absZ);
	}
	
	public int produtoInterno(VetorR3 segundoVetor){
		//criamos variaves para auxiliar e deixar a conta de retorno
		//mais sem�ntica
		int xLinha = segundoVetor.x;
		int yLinha = segundoVetor.y;
		int zLinha = segundoVetor.z;
		
		//efetuamos a aritm�tica do produto interno  
		return x * xLinha 
				+ y * yLinha
				+ z * zLinha;
	}
	
	public VetorR3 somar(VetorR3 segundoVetor){
		//criamos um vetor auxiliar
		VetorR3 soma = new VetorR3();
		
		/* 
		o this serve para indicar que estamos falando de algum recurso
		deste mesmo objeto. Neste caso em espec�fico n�o faria diferen�a
		usar o this ou n�o, mas pela sem�ntica eu optei por usar.
		No entanto em caso de recursos com mesmo nome, o this � essencial
		para diferenciar
		 */
		soma.x = this.x + segundoVetor.x;
		soma.y = this.y + segundoVetor.y;
		soma.z = this.z + segundoVetor.z;
		return soma;
	}
	
	public VetorR3 subtrair(VetorR3 segundoVetor){
		VetorR3 subtracao = new VetorR3();
		
		subtracao.x = this.x - segundoVetor.x;
		subtracao.y = this.y - segundoVetor.y;
		subtracao.z = this.z - segundoVetor.z;
		
		return subtracao;
	}
}
