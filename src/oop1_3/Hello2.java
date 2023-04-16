package oop1_3;

public class Hello2 {
    static int i = 1;
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(i);
    }
    static {
        i = 500;
        System.out.println("static block");
    }
}
