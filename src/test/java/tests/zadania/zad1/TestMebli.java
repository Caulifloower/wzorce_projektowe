package tests.zadania.zad1;

import org.junit.jupiter.api.Test;
import zadania.zad1.ProducentStołów;
import zadania.zad1.ProducentSzafek;
import zadania.zad1.model.Mebel;

public class TestMebli {

    /**
     * Zaprojektować fabrykę mebli, która będzie produkowała szafki i stoliki.
     * Każdy mebel będzie posiadał informację o ilości nóżek, szafka będzie posiadała informację
     * o ilości półek i materiale, z którego jest zrobiona, stolik będzie posiadał informację o materiale,
     * z którego wykonany jest blat i nóżki (mogą być różne). Zaimplementować metodę, która wydrukuje opis mebla
     * (w dowolny sposób, podając wszystkie jego parametry)
     */

    private final ProducentStołów producentStołów = new ProducentStołów();
    private final ProducentSzafek producentSzafek = new ProducentSzafek();

    @Test
    public void test1() {
        Mebel szafka1 = producentSzafek.standardMebel();
        Mebel szafka2 = producentSzafek.superMebel();
        Mebel stół1 = producentStołów.standardMebel();
        Mebel stół2 = producentStołów.superMebel();

        stół1.wydrukujOpis();
        stół2.wydrukujOpis();
        szafka1.wydrukujOpis();
        szafka2.wydrukujOpis();
    }
}
