package zadania.zad1;

import zadania.zad1.model.Mebel;
import zadania.zad1.model.Szafka;

public class ProducentSzafek implements FabrykaMebli {

    @Override
    public Mebel superMebel() {
        Szafka szafkaFancy = new Szafka();
        szafkaFancy.setMateriał("szkło");
        szafkaFancy.setIlośćPółek(2);
        szafkaFancy.setIlośćNóg(3);
        return szafkaFancy;
    }

    @Override
    public Mebel standardMebel() {
        Szafka szafkaStandard = new Szafka();
        szafkaStandard.setMateriał("drewno");
        szafkaStandard.setIlośćPółek(4);
        szafkaStandard.setIlośćNóg(4);
        return szafkaStandard;
    }
}
