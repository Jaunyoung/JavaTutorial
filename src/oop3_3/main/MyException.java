package oop3_3.main;

public class MyException extends RuntimeException {
    public MyException(String msg) {
        super(msg);
    }

    public MyException(Exception ex) {
        super(ex);
    }
}
