package tests;

import org.junit.jupiter.api.Test;
import rozszerzenie.budowniczy.BDokument;

public class TestBudowniczego {

    @Test
    public void drukowanieZawartości(){
        BDokument dokument = BDokument.builder()
                .nagłówek("Zbudowany nagłówek")
                .stopka("Zbudowana stopka")
                .build();

        System.out.println("Nagłówek: " + dokument.getNagłówek() + ", stopka: " + dokument.getStopka());
    }
}
