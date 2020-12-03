package homework6;

import java.io.IOException;
import java.net.Socket;

    public class ChatClient {
        private  static final String SERVER = "localhost";
        private static final int SERVER_PORT = 8189;

        public static void main(String[] args) {
            try {
                Socket name = new Socket(SERVER, SERVER_PORT);
                new Client(name, "Клиент");
                while(true){
                    if(name.isClosed()){
                        break;
                    }
                }
                System.exit(0);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

