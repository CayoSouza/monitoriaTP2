package lista1.numero2;

import java.util.Arrays;
import java.util.Collections;

public class Avaliacoes {
    
    public static float calculaMOS(int[] avaliacoes){
        int soma = 0;
        
        for(int i : avaliacoes)
            soma += i;
        
        float MOS = soma / avaliacoes.length;
        
        return MOS;
    }
    
    public static float calculaGTS(int[] avaliacoes){
        int quantAvaliacaoBoa = 0;
        
        for(int i : avaliacoes)
            if(i == 4 || i == 5)
                quantAvaliacaoBoa++;
        
        float GTS = (float) quantAvaliacaoBoa / avaliacoes.length;
        
        return GTS;
    }
    
    public static int[] geraOpinioes(int tamanho){
        int[] vetor = new int[tamanho];
        
        /*como o tamanho � sempre par e um dos elementos � sempre 4 ou 5
        eu posso inserir 4 ou 5 aleatoriamente
        e o outro numero pode ser qualquer numero que
        a media com este meu numero escolhido seja 3 ou menor
        */
        double random = 0;
        
        /*percorre o vetor de 2 em 2 posi��es, j� que o tamanho � sempre par 
          e em cada itera��o n�s populamos o array atual "i" e o seu seguinte "i+1"
          como pode ser visto nas linhas 54, 55, 58 e 61/63 */
        for(int i = 0; i<vetor.length; i+=2){
        	random = Math.random();
        	/*gera um 0 <= random <= 1
        	 * se o resultado for maior ou igual a 0.5, o valor escolhido para o vetor atual ser� o 5
        	 * 		neste caso, o pr�ximo vetor a ser preenchido DEVE ser com o valor 1, para resultar no MOS menor ou igual a 3
        	 * caso contr�rio o valor escolhido para o vetor atual ser� o 4
        	 * 		neste caso, o valor do pr�ximo vetor pode ser tanto 1 quanto 2 que ser�o gerados aleatoriamente novamente.
        	 */
        	if(random >= 0.5){
        		vetor[i] = 5;
        		vetor[i+1] = 1;
        	}
        	else {
        		vetor[i] = 4;
        		random = Math.random();
        		if(random >= 0.5)
        			vetor[i+1] = 1;
        		else
        			vetor[i+1] = 2;
        	}
        }
        
        //ordena o vetor em ordem crescente s� pra dar uma cara mais bonita na ordena��o
        Arrays.sort(vetor);
        return vetor;
    }
    
    public static void main(String[] args){
    	//par�metro deve ser par(segundo o enunciado)
        int[] ava = geraOpinioes(10);
        
        String output = "";
        for(int i : ava){
        	output += i + " ";
        }
        System.out.println("Opini�o gerada: "+ output);
        
        System.out.println("MOS = "+calculaMOS(ava));
        System.out.println("GTS = "+calculaGTS(ava));
    }
	}
