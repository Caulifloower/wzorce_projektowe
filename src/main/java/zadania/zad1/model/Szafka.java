package zadania.zad1.model;


import com.google.gson.Gson;
import lombok.Setter;

@Setter
public class Szafka extends Mebel{

    private int ilośćPółek;
    private String materiał;

    @Override
    public void wydrukujOpis() {
        System.out.println("Szafka o parametrach: \n" + new Gson().toJson(this));
    }
}
