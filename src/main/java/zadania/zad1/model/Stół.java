package zadania.zad1.model;

import com.google.gson.Gson;
import lombok.Setter;

@Setter
public class Stół extends Mebel {

    private String materiałBlatu;
    private String materiałNózek;

    @Override
    public void wydrukujOpis() {
        System.out.println("Stół o parametrach: \n" + new Gson().toJson(this));
    }
}
