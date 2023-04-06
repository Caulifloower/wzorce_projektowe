package zadania.zad2;

import zadania.zad2.model.KwiatekDoniczkowy;
import zadania.zad2.model.Roślina;

public class ProducentKwiatków implements FabrykaRoślin{
    @Override
    public Roślina małaRoślina() {
        KwiatekDoniczkowy małyKwiatek = new KwiatekDoniczkowy();
        małyKwiatek.setNazwa("Grubosz");
        małyKwiatek.setProducentDonicy("Donice.pl");
        małyKwiatek.setRodzajZiemii("ziemia dla sukulentów");
        return małyKwiatek;
    }

    @Override
    public Roślina dużaRoślina() {
        KwiatekDoniczkowy dużyKwiatek = new KwiatekDoniczkowy();
        dużyKwiatek.setNazwa("Monstera");
        dużyKwiatek.setProducentDonicy("Castorama");
        dużyKwiatek.setRodzajZiemii("specjalna mieszanka");
        return dużyKwiatek;
    }
}
