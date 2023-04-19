package oop3_3.main;

public class Exception1 {
    public static void main(String[] args) {
        try {
            ExceptionObj1 exobj = new ExceptionObj1();
            int value = exobj.divide(10, 0);
            System.out.println(value);
        } catch (ArithmeticException ex) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }
}

class ExceptionObj1 {
    public int divide(int i, int k) throws ArithmeticException {
        int value = 0;
        value = i / k;
        return value;
    }
}
