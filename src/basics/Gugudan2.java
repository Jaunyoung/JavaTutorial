package basics;

public class Gugudan2 {
    public static void main(String[] args) {
        for (int k = 1; k <= 9; k++) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(k + "*" + i + " = " + (k * i));
            }
            System.out.println();
        }
    }

    public static class IfExam1 {
        public static void main(String[] args){
            int a = 5;

            if (a > 4){
                System.out.println("a는 4보다 큽니다.");
            }
        }
    }
}
