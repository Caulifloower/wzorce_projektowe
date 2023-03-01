package rozszerzenie.fabryka.naInterfejsie;

import rozszerzenie.interfejs.IDokument;
import rozszerzenie.interfejs.IDokumentFirmowy;
import rozszerzenie.klasaAbstrakcyjna.Dokument;
import rozszerzenie.klasaAbstrakcyjna.DokumentFirmowy;

public class IDrukFirmowy implements IDrukarka {

    @Override
    public IDokument stwórzDokument() {
        IDokumentFirmowy dokumentFirmowy = new IDokumentFirmowy();
        dokumentFirmowy.dodajNagłówek();
        dokumentFirmowy.dodajStopkę();
        return dokumentFirmowy;
    }

    @Override
    public void wydrukuj(IDokument dokument) {
        dokument.wydrukuj();
    }
}
