package oop1_3;

public class Exam01 {
    public static void main(String[] args) {
        Parent p1 = new Parent(); // 99
        System.out.println(p1.i); // p99
        p1.printI();
        System.out.println("------------------");
        Child c1 = new Child(); // 15
        System.out.println(c1.i); // c15
        c1.printI();
        System.out.println("------------------");
        Parent p2 = new Child(); // 99
        System.out.println(p2.i); // 15
        p2.printI();
    }
}
