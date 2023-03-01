package tests;

import org.junit.jupiter.api.Test;
import rozszerzenie.klasaAbstrakcyjna.Dokument;
import rozszerzenie.klasaAbstrakcyjna.DokumentFirmowy;
import rozszerzenie.klasaAbstrakcyjna.DokumentSkarbowy;

public class TestKlasyAbstrakcyjnej {

    Dokument dokumentSkarbowy = new DokumentSkarbowy();
    Dokument dokumentFirmowy = new DokumentFirmowy();

    @Test
    public void drukowanieZawartości() {
        dokumentSkarbowy.dodajNagłówek();
        dokumentSkarbowy.dodajStopkę();

        dokumentFirmowy.dodajNagłówek();
        dokumentFirmowy.dodajStopkę();

        dokumentSkarbowy.wydrukuj();
        dokumentFirmowy.wydrukuj();
    }
}
