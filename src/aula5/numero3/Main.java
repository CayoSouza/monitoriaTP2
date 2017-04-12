package aula5.numero3;

public class Main {

	public static void main(String[] args) {
		InstanteDeTempo instante = new InstanteDeTempo();
		
		int dias = 5;
		int segundos = 200000;
		
		System.out.println("(Setando "+dias+" dias.)");
		instante.setDias(dias);
		instante.imprimeInstante();
		
		System.out.println("(Setando "+segundos+" segundos.)");
		instante.setSegundos(segundos);
		instante.imprimeInstante();
	
		dias = 3;
		System.out.println("(Incrementando "+dias+" dias.)");
		instante.incrementaDias(dias);
		instante.imprimeInstante();
		
		segundos = 86400;
		System.out.println("(Incrementando "+segundos+" segundos.)");
		instante.incrementaSegundos(segundos);
		instante.imprimeInstante();
		
		segundos = 500000;
		System.out.println("(Decrementando "+segundos+" segundos.)");
		instante.decrementaSegundos(segundos);
		instante.imprimeInstante();
		
		// lembrando segundos continua 500000, vamos tentar decrementar novamente o que resultaria em negativo
		System.out.println("(Decrementando "+segundos+" segundos.)");
		instante.decrementaSegundos(segundos);
		instante.imprimeInstante();
		
		dias = 1;
		System.out.println("(Decrementando "+dias+" dias.)");
		instante.decrementaDias(dias);
		instante.imprimeInstante();

		
		// lembrando dias continua 1, vamos tentar decrementar novamente o que resultaria em negativo
		System.out.println("(Decrementando "+dias+" dias.)");
		instante.decrementaDias(dias);
		instante.imprimeInstante();
	}

}
