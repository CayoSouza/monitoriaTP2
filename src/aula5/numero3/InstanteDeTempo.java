package aula5.numero3;

public class InstanteDeTempo {
	private float dias;
	private float segundos;
	
	//um dia tem 86400 segundos
	/*
	 * escolhi usar o m�todo "set" e os atributos privados para impedir que fosse poss�vel acessar 
	 * os atributos diretamente, j� que os dias e segundos est�o associados, n�o gostaria que algu�m
	 * editasse um ou outro sem alterar os dois ao mesmo tempo, e � basicamente isto que o m�todo "set" faz.
	 * Ele controla a entrada de valor aos atributos visto que um est� em fun��o do outro, deste modo se algu�m adiciona X dias
	 * Y segundos ser�o calculados e adicionados automaticamente. O mesmo serve para os segundos.
	 * TL;DR: O m�todo set � usado para impedir que seja poss�vel alterar os atributos sem o controle de quem projetou a classe.
	 */
	
	//neste m�todo por exemplo eu digo: coloque X dias na vari�vel dias
	//e ap�s isso calcule os segundos equivalentes a X dias e coloque na vari�vel segundos.
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
		
		//ap�s o m�todo comum de incremento de dia, estamos preocupados e manter a equival�ncia em segundos
		//ent�o calculamos e os incrementamos tamb�m.
		this.segundos += dias * 86400;
	}
	
	public void decrementaDias(float dias){
		//verifica se o decremento de dias n�o � maior do que os dias do estado atual do objeto
		if(this.dias > dias){
			this.dias -= dias;
			this.segundos -= dias * 86400;	
		}
		else
			System.out.println("N�mero de dias a decrementar n�o pode"
					+ " ser maior que o n�mero de dias atual.");
						
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
			System.out.println("N�mero de segundos a decrementar n�o pode"
					+ " ser maior que o n�mero de segundos atual.");
						
	}
	
	public void imprimeInstante(){
		System.out.println("O n�mero de dias �: " + String.format("%.2f", this.dias));
		System.out.println("O n�mero de segundos �: " + String.format("%.2f", this.segundos));
	}
}
