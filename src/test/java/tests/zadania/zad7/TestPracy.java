package tests.zadania.zad7;

import org.junit.jupiter.api.Test;
import zadania.zad7.KartaPracownika;

public class TestPracy {

    /**
     * Stworzyć kartę pracownika (obiekt jednej instancji), która będzie posiadała możliwość zliczania
     * godzin pracy i sprawdzania ile godzin pracownik przepracował (metody „zaraportujGodziny” i „sprawdźGodziny”).
     * Stworzyć klasę testową, w której znajdą się 3 testy (trochę sztuczny twór niezgodny z założeniem, ale wygodny).
     * 2 pierwsze testy będą dodawały godziny pracy (będą odpowiadały dniom pracy) ostatni test będzie sprawdzał
     * ile godzin przepracował pracownik i drukował tę wartość do konsoli. Każdy test będzie tworzył obiekt KartaPracownika
     * (w klasie testowej nie będzie pól globalnych) – cel: mimo operowania na „nowej” instancji klasy, wciąż jesteśmy
     * w tym samym obiekcie, w związku z czym przy puszczaniu testów wspólnie, godziny będą się sumować.
     */

    @Test
    public void dzień1() {
        KartaPracownika kartaPracownika = KartaPracownika.getInstance();
        kartaPracownika.zaraportujGodziny(5);
        System.out.println("zalogowano godziny: 5");
    }

    @Test
    public void dzień2() {
        KartaPracownika kartaPracownika = KartaPracownika.getInstance();
        kartaPracownika.zaraportujGodziny(3);
        System.out.println("zalogowano odziny: 3");
    }

    @Test
    public void sprawdźGodziny() {
        KartaPracownika kartaPracownika = KartaPracownika.getInstance();
        System.out.println(kartaPracownika.sprawdźGodziny());
    }
}
