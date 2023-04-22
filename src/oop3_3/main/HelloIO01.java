package oop3_3.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class HelloIO01 {
    public static void main(String[] args) throws Exception {
        OutputStream out = new FileOutputStream("./tmp/helloIO01.dat");
        out.write(1); // 00000000 00000000 00000000 00000001 중 마지막 00000001만 저장됨
        out.write(255);
        out.write(0);
        out.close(); // 반드시 close를 붙여줘야 한다.
    }
}
