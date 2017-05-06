package aula5.numero3;

public class Main {

	public static void main(String[] args) {
		InstanteDeTempo instante = new InstanteDeTempo(2017, 1, 1, 15, 0, 0);
		
		instante.imprimeCurto();
		instante.imprimeLongo();
		
		instante.incrementaDias(40);
		
		instante.imprimeCurto();
		instante.imprimeLongo();
		
		instante.incrementaSegundos(100000);
		
		instante.imprimeCurto();
		instante.imprimeLongo();
		
		instante.decrementaDias(60);
		
		instante.imprimeCurto();
		instante.imprimeLongo();
		
		instante.decrementaSegundos(100000);
		
		instante.imprimeCurto();
		instante.imprimeLongo();
	}

}
