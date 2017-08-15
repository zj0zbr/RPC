package zbr.socket.rpc.framework;

import zbr.socket.rpc.idl.IDosomething;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by zj0zbr on 17-4-9.
 */
public class Server {
    private int port;
    private ServerSocket ss=null;
    public Server(int port) throws IOException {
        this.port=port;
        this.ss=new ServerSocket(port);
    }
    public void start(IDosomething dosomething) throws IOException {
        while (true) {
            Socket s = ss.accept();
            DoThread doThread=new DoThread();
            doThread.setSocket(s);
            doThread.setiDosomething(dosomething);
            doThread.start();
        }
    }
}
