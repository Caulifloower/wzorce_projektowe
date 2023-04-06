package zadania.zad5;

import zadania.zad5.model.MebelB;
import zadania.zad5.model.StółB;

public class ProducentStołów implements FabrykaMebli {
    @Override
    public MebelB superMebelB() {
        return StółB.builder()
                .ilośćNóg(1)
                .materiałBlatu("szkło")
                .materiałNózek("metal")
                .build();
    }

    @Override
    public MebelB standardMebelB() {
        return StółB.builder()
                .ilośćNóg(4)
                .materiałBlatu("drewno")
                .materiałNózek("drewno")
                .build();
    }
}
