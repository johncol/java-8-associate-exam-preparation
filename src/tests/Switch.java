package tests;

public class Switch {

    private final static String b = "b";

    final String classString = "a";

    void test(String string, String string1, final String string2) {
        String string3 = "3";
        final String string4 = "4";
        int x = 0;

        SWITCH_LABEL: switch (string) {
            case string4:
                //
            case "":
                //
            case classString:
                //
            case b:
        }

        WHILE_LABEL: while (x<9) {}

        DO_WHILE_LABEL: do {} while (x<9);

        FOR:LABEL: for (;x<9;) {}

        IF_BLOCK_LABEL: if (x<9) {}

        ANY_BLOCK_LABEL: {}

    }

    public static void main(String[] args) {
        new Switch().test("a", "b", "c");
    }

}
