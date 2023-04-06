package tests.zadania.zad5;

import org.junit.jupiter.api.Test;
import zadania.zad5.ProducentStołów;
import zadania.zad5.ProducentSzafek;
import zadania.zad5.model.MebelB;

public class TestMebliB {

    /**
     * Zaprojektować Fabrykę z zadania 1 w taki sposób, aby szafka i stolik były builderami
     */

    @Test
    public void test1() {
        MebelB szafka1 = new ProducentSzafek().standardMebelB();
        MebelB szafka2 = new ProducentSzafek().superMebelB();
        MebelB stół1 = new ProducentStołów().standardMebelB();
        MebelB stół2 = new ProducentStołów().superMebelB();

        stół1.wydrukujOpis();
        stół2.wydrukujOpis();
        szafka1.wydrukujOpis();
        szafka2.wydrukujOpis();
    }
}
