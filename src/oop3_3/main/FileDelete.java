package oop3_3.main;
import java.io.*;

public class FileDelete {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("사용법: java FileDelete 파일이름");
            System.exit(0);
        }

        File f = new File(args[0]);
        if (f.exists()) {
            boolean deleteflag = f.delete();
            if (deleteflag) {
                System.out.println("파일 삭제를 성공하였습니다.");
            } else {
                System.out.println("파일 삭제를 실패하였습니다.");
            }
        } else {
            System.out.println("파일이 존재하지 않습니다.");
        }
    }
}
