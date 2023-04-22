package oop3_3.main;

import java.io.*;

public class TempFile {
    public static void main(String[] args) {
        try {
            File f = File.createTempFile("tmp_", ".dat");
            System.out.println("60초 동안 멈춰있습니다.");
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e1) {
                System.out.println(e1);
            }
            f.deleteOnExit(); // JVM이 종료될 대 임시파일을 자동으로 삭제한다.
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
