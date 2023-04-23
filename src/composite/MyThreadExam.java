package composite;

public class MyThreadExam {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("*");
        MyThread mt2 = new MyThread("+");

        mt1.start();
        mt2.start();

        System.out.println("end!");
    }
}
