package lista1.numero1;

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
        
        /*como o tamanho é sempre par e um dos elementos é sempre 4 ou 5
        eu posso inserir 4 ou 5 aleatoriamente
        e o outro numero pode ser qualquer numero que
        a media com este meu numero escolhido seja 3 ou menor
        */
        double random = 0;
        for(int i = 0; i<vetor.length; i+=2){
        	random = Math.random();
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
        int[] ava = geraOpinioes(14);
        
        String output = "";
        for(int i : ava){
        	output += i + " ";
        }
        System.out.println("Opinião gerada: "+ output);
        
        System.out.println("MOS = "+calculaMOS(ava));
        System.out.println("GTS = "+calculaGTS(ava));
    }
	}
