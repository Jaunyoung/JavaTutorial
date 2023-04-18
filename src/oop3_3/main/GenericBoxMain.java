package oop3_3.main;

public class GenericBoxMain {
    public static void main(String[] args) {
        GenericBox<String> genericBox = new GenericBox<>();
        genericBox.set("kim");
        String str = genericBox.get();
        System.out.println(str.toUpperCase());

        // genericBox.set(new Integer(5)); // 컴파일 오류가 발생한다.
    }
}
