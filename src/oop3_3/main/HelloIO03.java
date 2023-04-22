package oop3_3.main;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.lang.reflect.WildcardType;

public class HelloIO03 {
    public static void main(String[] args) throws Exception {
        Writer out = new FileWriter("./tmp/hello.txt");
        out.write((int) 'a');
        out.write((int) 'h');
        out.write((int) '!');
        out.close();
    }
}
