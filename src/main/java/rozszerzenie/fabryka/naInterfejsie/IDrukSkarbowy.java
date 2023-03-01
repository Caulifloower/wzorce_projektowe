package rozszerzenie.fabryka.naInterfejsie;

import rozszerzenie.interfejs.IDokument;
import rozszerzenie.interfejs.IDokumentSkarbowy;
import rozszerzenie.klasaAbstrakcyjna.Dokument;
import rozszerzenie.klasaAbstrakcyjna.DokumentSkarbowy;

public class IDrukSkarbowy implements IDrukarka {

    @Override
    public IDokument stwórzDokument() {
        IDokumentSkarbowy dokumentSkarbowy = new IDokumentSkarbowy();
        dokumentSkarbowy.dodajNagłówek();
        dokumentSkarbowy.dodajStopkę();
        return dokumentSkarbowy;
    }

    @Override
    public void wydrukuj(IDokument dokument) {
        dokument.wydrukuj();
    }
}
