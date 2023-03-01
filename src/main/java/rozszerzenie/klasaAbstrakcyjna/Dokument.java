package rozszerzenie.klasaAbstrakcyjna;

public abstract class Dokument {

    private String stopka;
    protected String naglowek;

    public void dodajStopkę() {
        this.stopka = "Stopka dodana przez klasę abstrakcyjną";
    }

    public abstract void dodajNagłówek();

    public void wydrukuj() {
        System.out.println("nagłówek: " + this.naglowek + ", stopka: " + this.stopka);
    }
}
