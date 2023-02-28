package wzorce.fabryka;

import wzorce.fabryka.model.Przedmiot;
import wzorce.fabryka.model.PrzedmiotA;

public class ProducentA implements FabrykaPrzedmiotów {

    @Override
    public Przedmiot stwórzPrzedmiot() {
        PrzedmiotA przedmiotA = new PrzedmiotA();
        return przedmiotA;
    }
}
