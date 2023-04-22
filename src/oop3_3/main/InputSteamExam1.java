package oop3_3.main;

import java.io.IOException;
import java.io.InputStream;

public class InputSteamExam1 {
    public static void main(String[] args) {
        InputStream in = null;
        try {
            int data = in.read();
        } catch (IOException ex) {
            System.out.println("io오류: " + ex);
        } finally {
            try {
                in.close();
            } catch (Exception ex2) {
                System.out.println("io오류2: " + ex2);
            }
        }
    }
}
