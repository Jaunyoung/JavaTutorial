package composite;

import java.io.StringWriter;

public class IOExam15 {
    public static void main(String[] args) throws Exception {
        StringWriter out = new StringWriter();
        //생성자 안받아들이는애들은 메모리에 쓴다고
        //이해하면 된다
        out.write("hello");
        out.write("france");
        out.write("emoji");
        out.close();

        String str = out.toString();
        System.out.println(str);
    }
}
