package composite;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExam {
    public static void main(String[] args) {
        try {
            InetAddress ia = InetAddress.getLocalHost();
            System.out.println(ia.getHostAddress());
        } catch (UnknownHostException uhe) {
            uhe.printStackTrace();
        }

        try {
            InetAddress[] iaArray = InetAddress.getAllByName("www.naver.com");
            for (InetAddress ia : iaArray) {
                System.out.println(ia.getHostAddress());
            }
        } catch (UnknownHostException uhe) {
            uhe.printStackTrace();
        }
    }
}
