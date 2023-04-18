package oop3_3.main;

public class Array04 {
    public static void main(String[] args) {
        ItemForArray[] array1;
        ItemForArray array2[];

        array1 = new ItemForArray[5];
        array2 = new ItemForArray[5];

        array1[0] = new ItemForArray(500, "item01");
        array2[1] = new ItemForArray(1000, "item02");
    }
}
