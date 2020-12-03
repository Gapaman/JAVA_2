package homework6;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

    public static void main(String[] args) {
        ServerSocket server = null;
        Socket nameServer = null;
        try {
            server = new ServerSocket(8189);
            System.out.println("Ожидаем подключения...");
            nameServer= server.accept();
            System.out.println("пользователь подключился ");
            new Client(nameServer, "Сервер");
            while(true){
                if(nameServer.isClosed()){
                    break;
                }
            }
            server.close();
            System.exit(0);
        } catch (IOException e) {
            System.out.println("Ошибка сервера");
        } finally {
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}