package rozszerzenie.interfejs;

public class IDokumentSkarbowy implements IDokument{

    String nagłówek;
    String stopka;

    @Override
    public void dodajNagłówek() {
        this.nagłówek = "Nagłówek dla dokumentu skarbowego";
    }

    @Override
    public void dodajStopkę() {
        this.stopka = "Stopka dla dokumentu skarbowego";
    }

    @Override
    public void wydrukuj() {
        System.out.println("nagłówek: " + nagłówek + ", stopka: " + stopka);
    }
}
