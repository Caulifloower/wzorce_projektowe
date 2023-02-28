package wzorce.builder;

public class BudowniczyBezLombooka {

    private final String value1;
    private final String value2;

    private BudowniczyBezLombooka(String value1, String value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    static BudowniczyBezLombookaBuilder builder() {
        return new BudowniczyBezLombookaBuilder();
    }

    static class BudowniczyBezLombookaBuilder {

        private String value1;
        private String value2;

        BudowniczyBezLombookaBuilder value1(String value1) {
            this.value1 = value1;
            return this;
        }

        BudowniczyBezLombookaBuilder value2(String value2) {
            this.value2 = value2;
            return this;
        }

        BudowniczyBezLombooka build() {
            return new BudowniczyBezLombooka(value1, value2);
        }
    }
}
