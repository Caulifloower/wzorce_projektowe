package tests;

import org.junit.jupiter.api.Test;
import rozszerzenie.fabryka.naInterfejsie.IDrukFirmowy;
import rozszerzenie.fabryka.naInterfejsie.IDrukSkarbowy;
import rozszerzenie.fabryka.naKlasieAbstrakcyjnej.DrukFirmowy;
import rozszerzenie.fabryka.naKlasieAbstrakcyjnej.DrukSkarbowy;
import rozszerzenie.interfejs.IDokument;
import rozszerzenie.klasaAbstrakcyjna.Dokument;

public class TestFabryki {

    /**
     * identyczny kod testu - inne rezultaty ze względu na wykorzystanie innych modeli
     */

    // z modelem w klasie abstrakcyjnej
    @Test
    public void drukowanieZawartości(){
        Dokument drukFirmowy = new DrukFirmowy().stwórzDokument();
        Dokument drukSkarbowy = new DrukSkarbowy().stwórzDokument();

        drukFirmowy.wydrukuj();
        drukSkarbowy.wydrukuj();
    }

    // z modelem na podstawie interfejsu
    @Test
    public void drukowanieZawartości2(){
        IDokument drukFirmowy = new IDrukFirmowy().stwórzDokument();
        IDokument drukSkarbowy = new IDrukSkarbowy().stwórzDokument();

        drukFirmowy.wydrukuj();
        drukSkarbowy.wydrukuj();
    }
}
