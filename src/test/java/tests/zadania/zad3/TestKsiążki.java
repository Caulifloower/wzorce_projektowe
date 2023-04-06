package tests.zadania.zad3;

import org.junit.jupiter.api.Test;
import zadania.zad3.KsiążkaB;

public class TestKsiążki {

    /**
     * Zaprojektować model książki z wykorzystaniem wzorca „budowniczy”, który będzie mógł posiadać informację
     * o tytule, autorze, roku wydania, nazwie wydawnictwa i numerze ISBN. Zaprojektować test, w którym zostaną
     * stworzone przynajmniej 2 książki, spośród których jedna nie została wydana w wersji papierowej,
     * a więc nie posiada nazwy wydawnictwa ani numeru ISBN. W teście wydrukować do konsoli wszystkie parametry książek.
     */

    @Test
    public void drukujZGetterem() {
        KsiążkaB książkaPapierowa = KsiążkaB.builder()
                .autor("Autor1")
                .tytuł("Tytuł1")
                .rokWydania("2002")
                .wydawnictwo("ARKA")
                .isbn("ISBN67898765")
                .build();

        KsiążkaB eBook = KsiążkaB.builder()
                .autor("Autor2")
                .tytuł("Tytuł2")
                .rokWydania("2023")
                .build();

        drukujOpis(książkaPapierowa);
        System.out.println("----");
        drukujOpis(eBook);
    }

    private void drukujOpis(KsiążkaB książkaB) {
        System.out.println("Książka papierowa: \n" +
                "Autor: " + książkaB.getAutor() + "\n" +
                "Tytuł: " + książkaB.getTytuł() + "\n" +
                "Wydawnictwo: " + książkaB.getWydawnictwo() + "\n" +
                "Rok wydania: " + książkaB.getRokWydania() + "\n" +
                "ISBN: " + książkaB.getIsbn());
    }
}
