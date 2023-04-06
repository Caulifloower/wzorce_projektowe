package zadania.zad2;

import zadania.zad2.model.Drzewo;
import zadania.zad2.model.Roślina;

public class ProducentDrzew implements FabrykaRoślin {


    @Override
    public Roślina małaRoślina() {
        Drzewo małeDrzewo = new Drzewo();
        małeDrzewo.setNazwa("Awokado");
        małeDrzewo.setJadalneOwoce(true);
        return małeDrzewo;
    }

    @Override
    public Roślina dużaRoślina() {
        Drzewo dużeDrzewo = new Drzewo();
        dużeDrzewo.setNazwa("Dąb");
        dużeDrzewo.setJadalneOwoce(false);
        return dużeDrzewo;
    }
}
