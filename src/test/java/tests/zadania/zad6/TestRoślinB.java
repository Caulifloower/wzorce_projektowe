package tests.zadania.zad6;

import org.junit.jupiter.api.Test;
import zadania.zad6.ProducentDrzew;
import zadania.zad6.ProducentKwiatków;
import zadania.zad6.model.RoślinaB;

public class TestRoślinB {

    /**
     * Zaprojektować Fabrykę z zadania 2 w taki sposób, aby kwiatki doniczkowe i drzewa były builderami
     */

    private final ProducentKwiatków producentKwiatków = new ProducentKwiatków();
    private final ProducentDrzew producentDrzew = new ProducentDrzew();

    @Test
    public void test1() {
        RoślinaB kwiatek1 = producentKwiatków.małaRoślina();
        RoślinaB kwiatek2 = producentKwiatków.dużaRoślina();
        RoślinaB drzewo1 = producentDrzew.małaRoślina();
        RoślinaB drzewo2 = producentDrzew.dużaRoślina();

        kwiatek1.drukujOpisWKlasieAbstrakcyjnej();
        kwiatek2.drukujOpisWKlasieAbstrakcyjnej();
        drzewo1.drukujOpisWKlasieAbstrakcyjnej();
        drzewo2.drukujOpisWKlasieAbstrakcyjnej();
    }
}
