package zadania.zad6.model;

import com.google.gson.Gson;

public class RoślinaB {
    public void drukujOpisWKlasieAbstrakcyjnej() {
        System.out.println(new Gson().toJson(this));
    }
}
