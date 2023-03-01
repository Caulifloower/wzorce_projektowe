package rozszerzenie.fabryka.naKlasieAbstrakcyjnej;

import rozszerzenie.klasaAbstrakcyjna.Dokument;
import rozszerzenie.klasaAbstrakcyjna.DokumentSkarbowy;

public class DrukSkarbowy implements IDrukarka {

    @Override
    public Dokument stwórzDokument() {
        DokumentSkarbowy dokumentSkarbowy = new DokumentSkarbowy();
        dokumentSkarbowy.dodajNagłówek();
        dokumentSkarbowy.dodajStopkę();
        return dokumentSkarbowy;
    }
}
