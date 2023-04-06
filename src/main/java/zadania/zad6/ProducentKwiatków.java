package zadania.zad6;

import zadania.zad6.model.KwiatekDoniczkowyB;
import zadania.zad6.model.RoślinaB;

public class ProducentKwiatków implements FabrykaRoślin {
    @Override
    public RoślinaB małaRoślina() {
        return KwiatekDoniczkowyB.builder()
                .nazwa("Grubosz")
                .producentDonicy("Donice.pl")
                .rodzajZiemii("ziemia dla sukulentów")
                .build();
    }

    @Override
    public RoślinaB dużaRoślina() {
        return KwiatekDoniczkowyB.builder()
                .nazwa("Monstera")
                .producentDonicy("Castorama")
                .rodzajZiemii("specjalna mieszanka")
                .build();
    }
}
