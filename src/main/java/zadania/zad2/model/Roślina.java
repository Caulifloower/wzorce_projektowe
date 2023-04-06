package zadania.zad2.model;

import com.google.gson.Gson;
import lombok.Setter;

@Setter
public class Roślina {

    private String nazwa;

    public void drukujOpisWKlasieAbstrakcyjnej() {
        System.out.println(new Gson().toJson(this));
    }
}
