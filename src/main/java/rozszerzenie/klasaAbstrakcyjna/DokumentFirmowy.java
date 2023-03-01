package rozszerzenie.klasaAbstrakcyjna;

public class DokumentFirmowy extends Dokument {

    @Override
    public void dodajNagłówek() {
        this.naglowek = "Nagłówek dla dokumentu firmowego";
    }
}
