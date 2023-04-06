package zadania.zad7;

public class KartaPracownika {

    private static KartaPracownika kartaPracownika = null;
    private int godziny = 0;

    private KartaPracownika() {
        if (kartaPracownika != null) {
            throw new RuntimeException("Karta już istnieje!");
        }
    }

    public static KartaPracownika getInstance() {
        if (kartaPracownika == null) {
            kartaPracownika = new KartaPracownika();
        }
        return kartaPracownika;
    }

    public void zaraportujGodziny(int godziny) {
        this.godziny += godziny;
    }

    public int sprawdźGodziny() {
        return this.godziny;
    }
}
