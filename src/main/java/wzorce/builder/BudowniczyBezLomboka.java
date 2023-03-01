package wzorce.builder;

public class BudowniczyBezLomboka {

    private final String value1;
    private final String value2;

    private BudowniczyBezLomboka(String value1, String value2) {
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

        BudowniczyBezLomboka build() {
            return new BudowniczyBezLomboka(value1, value2);
        }
    }
}
