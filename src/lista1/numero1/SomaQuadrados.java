package lista1.numero1;

public class SomaQuadrados {
    public static int somaDeQuadradosRecursiva(int n){
        int quadrado = n*n;
        
        if(n > 0)
            return quadrado + somaDeQuadradosRecursiva(n-1);
        
        return 0;
    }
    
    public static int somaDeQuadradosIterativa(int n){
        int soma = 0;
        
        for(int i=1; i<=n; i++)
            soma += i*i;
        
        return soma;
    }
    
    public static void main(String[] args) {
        System.out.println(somaDeQuadradosRecursiva(3));
        System.out.println(somaDeQuadradosIterativa(3));
    } 
	}
