package oop3_3.main;

public class Exception6 {
    public static void main(String[] args) {
//        {4,2}로바꿔서 실행해보고. int [] array = null로도 바꿔본다.
        int[] array = {4, 0};
        int[] value = null;
        try {
            value[0] = array[0] / array[1];
        } catch (ArrayIndexOutOfBoundsException aiob) {
            System.out.println(aiob.toString());
        } catch (ArithmeticException ae) {
            System.out.println(ae.toString());
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
