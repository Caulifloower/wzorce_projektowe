package tests;

import org.junit.jupiter.api.Test;
import rozszerzenie.interfejs.IDokument;
import rozszerzenie.interfejs.IDokumentFirmowy;
import rozszerzenie.interfejs.IDokumentSkarbowy;

public class TestInterfejsu {

    IDokument dokumentFirmowy = new IDokumentFirmowy();
    IDokument dokumentSkarbowy = new IDokumentSkarbowy();

    @Test
    public void drukowanieZawartości(){
        dokumentFirmowy.dodajNagłówek();
        dokumentFirmowy.dodajStopkę();

        dokumentSkarbowy.dodajNagłówek();
        dokumentSkarbowy.dodajStopkę();

        dokumentFirmowy.wydrukuj();
        dokumentSkarbowy.wydrukuj();
    }
}
