package composite;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputExam {
    public static void main(String[] args) throws Exception {
        User user = new User("jjy89@naver.com", "김김김", 1996);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("./tmp/user.dat"));
        out.writeObject(user);
        out.close();
    }
}
