package zadania.zad5;

import zadania.zad5.model.MebelB;
import zadania.zad5.model.SzafkaB;

public class ProducentSzafek implements FabrykaMebli {

    @Override
    public MebelB superMebelB() {
        return SzafkaB.builder()
                .ilośćNóg(3)
                .ilośćPółek(2)
                .materiał("szkło")
                .build();
    }

    @Override
    public MebelB standardMebelB() {
        return SzafkaB.builder()
                .ilośćNóg(4)
                .ilośćPółek(4)
                .materiał("drewno")
                .build();
    }
}
