package rozszerzenie.klasaAbstrakcyjna;

public class DokumentSkarbowy extends Dokument {

    @Override
    public void dodajNagłówek() {
        this.naglowek = "Nagłówek dla dokumentu skarbowego";
    }
}
