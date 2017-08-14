package org.socket.rpc.framework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * Created by andilyliao on 17-4-9.
 */
public class Send {
    private String ip;
    private int port;
    private Socket socket=null;
    public Send(String ip,int port) throws IOException {
        this.ip=ip;
        this.port=port;
        socket=new Socket(ip,port);
    }
    public String sendsomething(String str) throws IOException {
        PrintStream ps = new PrintStream(socket.getOutputStream());
        // 进行普通IO操作
        ps.println(str);
        ps.flush();
        BufferedReader br = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        String line = br.readLine();
        return line;
    }

}
