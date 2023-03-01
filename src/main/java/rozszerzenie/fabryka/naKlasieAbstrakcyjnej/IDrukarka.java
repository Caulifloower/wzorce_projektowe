package rozszerzenie.fabryka.naKlasieAbstrakcyjnej;

import rozszerzenie.klasaAbstrakcyjna.Dokument;

public interface IDrukarka {

    /**
     * Wykorzystany model dokumentu z pakietu klasaAbstrakcyjna
     */

    Dokument stwórzDokument();
    void wydrukuj(Dokument dokument);
}
