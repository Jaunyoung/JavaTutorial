package oop3_3;

public class Bus2 extends Car2 {
    public Bus2() {
        super("Bus!!");
        System.out.println("Bus2기본생성자");
    }

    @Override
    public void run() {
        System.out.println("후륜구동으로 동작한다.");
    }
}
