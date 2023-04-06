package zadania.zad1;

import zadania.zad1.model.Mebel;
import zadania.zad1.model.Stół;

public class ProducentStołów  implements FabrykaMebli{
    @Override
    public Mebel superMebel() {
        Stół superStół = new Stół();
        superStół.setIlośćNóg(1);
        superStół.setMateriałBlatu("szkło");
        superStół.setMateriałNózek("metal");
        return superStół;
    }

    @Override
    public Mebel standardMebel() {
        Stół standardStół = new Stół();
        standardStół.setIlośćNóg(4);
        standardStół.setMateriałBlatu("drewno");
        standardStół.setMateriałNózek("drewno");
        return standardStół;
    }
}
