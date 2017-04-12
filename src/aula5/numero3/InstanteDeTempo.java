package aula5.numero3;

public class InstanteDeTempo {
	private float dias;
	private float segundos;
	
	//um dia tem 86400 segundos
	/*
	 * escolhi usar o método "set" e os atributos privados para impedir que fosse possível acessar 
	 * os atributos diretamente, já que os dias e segundos estão associados, não gostaria que alguém
	 * editasse um ou outro sem alterar os dois ao mesmo tempo, e é basicamente isto que o método "set" faz.
	 * Ele controla a entrada de valor aos atributos visto que um está em função do outro, deste modo se alguém adiciona X dias
	 * Y segundos serão calculados e adicionados automaticamente. O mesmo serve para os segundos.
	 * TL;DR: O método set é usado para impedir que seja possível alterar os atributos sem o controle de quem projetou a classe.
	 */
	
	//neste método por exemplo eu digo: coloque X dias na variável dias
	//e após isso calcule os segundos equivalentes a X dias e coloque na variável segundos.
	public void setDias(float dias){
		this.dias = dias;
		
		this.segundos = dias * 86400;
	}
	
	public void setSegundos(float segundos){
		this.segundos = segundos;
		
		this.dias = segundos / 86400;
	}
	
	public void incrementaDias(float dias){
		this.dias += dias;
		
		//após o método comum de incremento de dia, estamos preocupados e manter a equivalência em segundos
		//então calculamos e os incrementamos também.
		this.segundos += dias * 86400;
	}
	
	public void decrementaDias(float dias){
		//verifica se o decremento de dias não é maior do que os dias do estado atual do objeto
		if(this.dias > dias){
			this.dias -= dias;
			this.segundos -= dias * 86400;	
		}
		else
			System.out.println("Número de dias a decrementar não pode"
					+ " ser maior que o número de dias atual.");
						
	}
	
	public void incrementaSegundos(float segundos){
		this.segundos += segundos;
		
		this.dias += segundos / 86400;
	}
	
	public void decrementaSegundos(float segundos){
		if(this.segundos > segundos){
			this.segundos -= segundos;
			this.dias -= segundos / 86400;			
		}
		else
			System.out.println("Número de segundos a decrementar não pode"
					+ " ser maior que o número de segundos atual.");
						
	}
	
	public void imprimeInstante(){
		System.out.println("O número de dias é: " + String.format("%.2f", this.dias));
		System.out.println("O número de segundos é: " + String.format("%.2f", this.segundos));
	}
}
