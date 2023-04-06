package zadania.zad5.model;

import com.google.gson.Gson;
import lombok.Builder;

@Builder
public class StółB extends MebelB {

    private final String materiałBlatu;
    private final String materiałNózek;
    private final int ilośćNóg;

    @Override
    public void wydrukujOpis() {
        System.out.println("Stół o parametrach: \n" + new Gson().toJson(this));
    }
}
