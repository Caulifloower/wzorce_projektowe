package wzorce.singleton;

public class ObiektJednejInstancji {

    private static ObiektJednejInstancji instance = null;

    private ObiektJednejInstancji() {
        if (instance != null) {
            throw new RuntimeException("Obiekt jest już utworzony, użyj metody .getInstance()");
        }
    }

    public ObiektJednejInstancji getInstance() {
        if (instance == null) {
            instance = new ObiektJednejInstancji();
        }

        return instance;
    }
}
