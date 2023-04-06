package tests.zadania.zad2;

import org.junit.jupiter.api.Test;
import zadania.zad2.ProducentDrzew;
import zadania.zad2.ProducentKwiatków;
import zadania.zad2.model.Roślina;

public class TestRoślin {

    /**
     * Zaprojektować fabrykę roślin, która będzie produkowała kwiatki doniczkowe i drzewa.
     * Każda roślina będzie miała swoją nazwę, każdy kwiatek doniczkowy będzie posiadał informację na temat
     * rodzaju ziemi, w której jest zasadzony oraz nazwę producenta donicy, każde drzewo będzie posiadało
     * informację na temat tego czy daje owoce jadalne, czy nie. Zaimplementować metodę, która wydrukuje opis rośliny
     * (w dowolny sposób, podając wszystkie jej parametry)
     */

    private final ProducentKwiatków producentKwiatków = new ProducentKwiatków();
    private final ProducentDrzew producentDrzew = new ProducentDrzew();

    @Test
    public void test1() {
        Roślina kwiatek1 = producentKwiatków.małaRoślina();
        Roślina kwiatek2 = producentKwiatków.dużaRoślina();
        Roślina drzewo1 = producentDrzew.małaRoślina();
        Roślina drzewo2 = producentDrzew.dużaRoślina();

        kwiatek1.drukujOpisWKlasieAbstrakcyjnej();
        kwiatek2.drukujOpisWKlasieAbstrakcyjnej();
        drzewo1.drukujOpisWKlasieAbstrakcyjnej();
        drzewo2.drukujOpisWKlasieAbstrakcyjnej();
    }
}
