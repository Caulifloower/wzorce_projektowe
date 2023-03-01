package rozszerzenie.fabryka.naKlasieAbstrakcyjnej;

import rozszerzenie.klasaAbstrakcyjna.Dokument;
import rozszerzenie.klasaAbstrakcyjna.DokumentFirmowy;

public class DrukFirmowy implements IDrukarka {

    @Override
    public Dokument stwórzDokument() {
        DokumentFirmowy dokumentFirmowy = new DokumentFirmowy();
        dokumentFirmowy.dodajNagłówek();
        dokumentFirmowy.dodajStopkę();
        return dokumentFirmowy;
    }
}
