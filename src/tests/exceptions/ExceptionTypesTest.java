package tests.exceptions;

import java.io.FileReader;

public class ExceptionTypesTest {

    public void doNotCodeThis(int num) {
        doNotCodeThis(1);
    }

    void testRuntime() {
        throw new ThereIsALotOfDeadPeopleException();
    }

    void testNonRuntime() throws ForgotMyKeyException {
        throw new ForgotMyKeyException();
    }

    void testError() {
        throw new OhhMyGodError();
    }

    public static void main(String[] args) {
        new ExceptionTypesTest().doNotCodeThis(1);
    }

}

class ForgotMyKeyException extends Exception { }
class ThereIsALotOfDeadPeopleException extends RuntimeException { }
class OhhMyGodError extends Error { }
