package aula5.numero3;

public class InstanteDeTempo {
    private int ano;
    private int mes;
    private int dia;
    private int hora;
    private int minuto;
    private int segundo; // não queremos precisão maior do que segundo

    static int MESES_POR_ANO = 12;
    static int [] DIAS_POR_MES = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static int HORAS_POR_DIA = 24;
    static int MINUTOS_POR_HORA = 60;
    static int SEGUNDOS_POR_MINUTO = 60;
    // a i-ésima posição deste vetor diz quantos dias tem o mês (i+1)
    
    static String [] NOMES_MESES = {"Janeiro", "Fevereiro", "Março","Abril",
                                    "Maio", "Junho", "Julho", "Agosto",
                                    "Setembro", "Outubro", "Novembro", "Dezembro" };
    // 1 = Janeiro, 2 = Fevereiro, ..., 12 = Dezembro

    // por ora, estamos ignorando anos bissextos - até porque a fórmula na
    // realidade é mais complicada do que "fevereiro tem 29 a cada 4 anos"

    InstanteDeTempo( int ano, int mes, int dia, int hora, int minuto, int segundo )
    {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // somente funciona se o incremento for um número positivo
    public void incrementaDias( int incremento ) {
        dia += incremento;
        while (dia > DIAS_POR_MES[mes-1]) {
            dia -= DIAS_POR_MES[mes-1];
            mes++;
            if( mes == MESES_POR_ANO + 1 ) {
                mes = 1;
                ano++;
            }
        }
    }

    // somente funciona se o incremento for um número positivo
    public void incrementaSegundos( int incremento ) {
        segundo += incremento;
        if (segundo >= SEGUNDOS_POR_MINUTO) {
            minuto += segundo/SEGUNDOS_POR_MINUTO;
            segundo %= SEGUNDOS_POR_MINUTO;
        }
        if (minuto >= MINUTOS_POR_HORA) {
            hora += minuto/MINUTOS_POR_HORA;
            minuto %= MINUTOS_POR_HORA;
        }
        if (hora >= HORAS_POR_DIA) {
            incrementaDias( hora/HORAS_POR_DIA );
            hora %= HORAS_POR_DIA;
        }
    }

    // somente funciona se o decremento for um número positivo
    public void decrementaDias( int decremento ) {
        dia -= decremento;
        while (dia <= 0) {
            mes--;
            if( mes == 0 ) {
                mes = MESES_POR_ANO;
                ano--;
            }
            dia += DIAS_POR_MES[mes-1];
        }
    }

    // somente funciona se o decremento for um número positivo
    public void decrementaSegundos( int decremento ) {
        segundo -= decremento;
        if (segundo < 0) {
            minuto += (segundo/SEGUNDOS_POR_MINUTO - 1);
            segundo = segundo%SEGUNDOS_POR_MINUTO + SEGUNDOS_POR_MINUTO;
        }
        if (minuto < 0) {
            hora += (minuto/MINUTOS_POR_HORA - 1);
            minuto = minuto%MINUTOS_POR_HORA + MINUTOS_POR_HORA;
        }
        if (hora < 0) {
            decrementaDias( -hora/HORAS_POR_DIA + 1 );
            hora = hora%HORAS_POR_DIA + HORAS_POR_DIA;
        }
    }
    
    public void imprimeCurto() {
        System.out.println( dia + "/" + mes + "/" + ano + " " + 
                            hora + ":" + minuto + ":" + segundo );
    }
    
    public void imprimeLongo() {
        System.out.println(
                  dia + " de " + NOMES_MESES[mes-1] + " de " + ano + ", "
               + hora + " hora" + (hora > 1 ? "s" : "") + ", "
             + minuto + " minuto" + (minuto != 1 ? "s" : "") + " e "
            + segundo + " segundo" + (segundo != 1 ? "s" : "") );
    }
}
