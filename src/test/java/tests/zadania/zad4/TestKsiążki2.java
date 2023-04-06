package tests.zadania.zad4;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import zadania.zad4.KsiążkaB2;

public class TestKsiążki2 {

    /**
     * wykonać zadanie 3 bez korzystania z adnotacji @Getter w modelu buildera w taki sposób,
     * aby parametry książki wydrukowały się poprawnie
     */

    @Test
    public void drukujBezGettera() {
        KsiążkaB2 książkaPapierowa = KsiążkaB2.builder()
                .autor("Autor1")
                .tytuł("Tytuł1")
                .rokWydania("2002")
                .wydawnictwo("ARKA")
                .isbn("ISBN67898765")
                .build();

        KsiążkaB2 eBook = KsiążkaB2.builder()
                .autor("Autor2")
                .tytuł("Tytuł2")
                .rokWydania("2023")
                .build();

        System.out.println("Książka papierowa: \n" + new Gson().toJson(książkaPapierowa));
        System.out.println("eBook: \n" + new Gson().toJson(eBook));
    }
}
