package rozszerzenie.interfejs;

public class IDokumentFirmowy implements IDokument {

    String nagłówek1;
    String nagłówek2;

    String stopka;

    @Override
    public void dodajNagłówek() {
        this.nagłówek1 = "Nagłówek 1 dla dokumentu firmowego";
        this.nagłówek2 = "Nagłówek 2 dla dokumentu firmowego";
    }

    @Override
    public void dodajStopkę() {
        this.stopka = "Stopka dla dokumentu firmowego";
    }

    @Override
    public void wydrukuj() {
        System.out.println("nagłówek 1: " + nagłówek1 + ", nagłówek 2: " + nagłówek2 + ", stopka: " + stopka);
    }
}
