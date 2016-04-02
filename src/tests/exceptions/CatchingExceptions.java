package tests.exceptions;

public class CatchingExceptions {
    static void throwsCheckedException() throws CheckedException {}
    static void throwsUncheckedException() throws UncheckedException {}

    public static void main(String[] args) {
        throwsUncheckedException();
        //throwsCheckedException();
    }
}

class CheckedException extends Exception {}
class UncheckedException extends RuntimeException {}
