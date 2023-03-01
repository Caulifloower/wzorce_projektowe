package rozszerzenie.fabryka.naInterfejsie;

import rozszerzenie.interfejs.IDokument;

public interface IDrukarka {

    /**
     * Wykorzystany model dokumentu z pakietu interfejs
     */

    IDokument stwórzDokument();
    void wydrukuj(IDokument dokument);
}
