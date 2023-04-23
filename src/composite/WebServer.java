package composite;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    public static void main(String[] args) throws Exception {
        // 클라이언트가 접속할 때까지 대기할때 필요한 객체가 ServerSocket
        ServerSocket serverSocket = new ServerSocket(10000);
        Socket clientSocket = serverSocket.accept(); // 대기한다. 클라이언트가 접속시 클라이언트와 통신하는 Socket이 반환된다.

        InputStream inputStream = clientSocket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

        OutputStream outputStream = clientSocket.getOutputStream();
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(outputStream));

        // http://localhost/:10000/hello
        // GET /hello HTTP/1.1
        System.out.println(br.readLine());

        String line = null;
        while (!((line = br.readLine()).equals(""))) {
            System.out.println(line);
        }

        pw.println("HTTP/1.1 200 OK");
        pw.println("name: kim");
        pw.println("email:jjy889@naver.com");
        pw.println("");
        pw.println("<html>");
        pw.println("Hello world!");
        pw.println("</html>");

        pw.flush();
        br.close();
        pw.close();
        clientSocket.close();
        serverSocket.close();
    }
}
