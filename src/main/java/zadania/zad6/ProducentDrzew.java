package zadania.zad6;

import zadania.zad6.model.DrzewoB;
import zadania.zad6.model.RoślinaB;

public class ProducentDrzew implements FabrykaRoślin {

    @Override
    public RoślinaB małaRoślina() {
        return DrzewoB.builder()
                .nazwa("Awokado")
                .jadalneOwoce(true)
                .build();
    }

    @Override
    public RoślinaB dużaRoślina() {
        return DrzewoB.builder()
                .nazwa("Dąb")
                .jadalneOwoce(false)
                .build();
    }
}
