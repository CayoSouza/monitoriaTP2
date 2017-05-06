package lista1.numero1;

public class Potencia {
    
    public static int potenciaRecursiva(int n, int k){
        if(k == 0)
            return 1;
        
        return n * potenciaRecursiva(n, k-1);
    }
    
    public static int potenciaIterativa(int n, int k){
         if(k==0)
            return 1;
        
        int potencia = 1;
        
        for(int i = 1; i <= k; i++)
            potencia = potencia * n;
        
        return potencia;
    }
    
    public static void main(String[] args){
        System.out.println(potenciaRecursiva(3, 4));
        System.out.println(potenciaIterativa(3, 4));
    }
	}

