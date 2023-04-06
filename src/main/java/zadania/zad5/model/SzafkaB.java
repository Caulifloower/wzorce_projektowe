package zadania.zad5.model;


import com.google.gson.Gson;
import lombok.Builder;

@Builder
public class SzafkaB extends MebelB {

    private final int ilośćPółek;
    private final String materiał;
    private final int ilośćNóg;

    @Override
    public void wydrukujOpis() {
        System.out.println("Szafka o parametrach: \n" + new Gson().toJson(this));
    }
}
