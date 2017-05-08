package lista1.numero2;

import java.util.Arrays;
import java.util.Collections;

public class Avaliacoes {
    
    public static float calculaMOS(int[] avaliacoes){
        int soma = 0;
        
      	//soma o valor de cada avaliacao
        for(int i : avaliacoes)
            soma += i;
        
      	/*calcula o MOS através da soma divido pela quantidade de avaliacoes
      		o cast de (float) serve para tornar a soma float, deste modo o resultado vai devolver os decimais corretamente
      		sem o cast, mesmo que retorne um float, só será levado em conta a parte inteira, por exemplo: 2.0 quando na 
          verdade o resultado deveria ser 2.8 */
        float MOS = (float) soma / avaliacoes.length;
        
        return MOS;
    }
    
    public static float calculaGTS(int[] avaliacoes){
        int quantAvaliacaoBoa = 0;
        
      	//conta quantas avaliacoes 4 ou 5 existem
        for(int i : avaliacoes)
            if(i == 4 || i == 5)
                quantAvaliacaoBoa++;
        
        //calcula o GTS através da quantidade de 4's ou 5's divido pela quantidade de avaliacoes 
        float GTS = (float) quantAvaliacaoBoa / avaliacoes.length;
        
        return GTS;
    }
    
    public static int[] geraOpinioes(int tamanho){
        int[] vetor = new int[tamanho];
        
        /*como o tamanho é sempre par e um dos elementos é sempre 4 ou 5
        eu posso inserir 4 ou 5 aleatoriamente
        e o outro numero pode ser qualquer numero que
        a media com este meu numero escolhido seja 3 ou menor
        */
        double random = 0;
        
        /*percorre o vetor de 2 em 2 posições, já que o tamanho é sempre par 
          e em cada iteração nós populamos o array atual "i" e o seu seguinte "i+1"
          como pode ser visto nas linhas 60, 61, 64 e 67/69 */
        for(int i = 0; i<vetor.length; i+=2){
        	random = Math.random();
        	/*gera um 0 <= random <= 1
        	 * se o resultado for maior ou igual a 0.5, o valor escolhido para o vetor atual será o 5
        	 * 		neste caso, o próximo vetor a ser preenchido DEVE ser com o valor 1, para resultar no MOS menor ou igual a 3
        	 * caso contrário o valor escolhido para o vetor atual será o 4
        	 * 		neste caso, o valor do próximo vetor pode ser tanto 1 quanto 2 que serão gerados aleatoriamente novamente.
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
        
        //ordena o vetor em ordem crescente só pra dar uma cara mais bonita na ordenação
        Arrays.sort(vetor);
        return vetor;
    }
    
    public static void main(String[] args){
    	  //parâmetro deve ser par(segundo o enunciado)
        int[] ava = geraOpinioes(10);
        
        String output = "";
        for(int i : ava)
        	output += i + " ";
        
        System.out.println("Opinião gerada: "+ output);
        System.out.println("MOS = "+calculaMOS(ava));
        System.out.println("GTS = "+calculaGTS(ava));
    }
}
