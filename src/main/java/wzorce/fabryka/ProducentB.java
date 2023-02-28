package wzorce.fabryka;

import wzorce.fabryka.model.Przedmiot;
import wzorce.fabryka.model.PrzedmiotB;

public class ProducentB implements FabrykaPrzedmiotów {

    @Override
    public Przedmiot stwórzPrzedmiot() {
        PrzedmiotB przedmiotB = new PrzedmiotB();
        return przedmiotB;
    }
}
