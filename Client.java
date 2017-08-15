package zbr.socket.rpc.idl;

import zbr.socket.rpc.framework.Send;

import java.io.IOException;

/**
 * Created by zj0zbr on 17-4-9.
 */
public class Client {
    public boolean login(String ip,int port,String username,String password) throws IOException {
        Send send=new Send(ip,port);
        String res=send.sendsomething("zbr.socket.rpc.idl.ILogin|login|"+username+"|"+password);
        switch (res){
            case "TRUE":
                return true;
            default:
                return false;
        }
    }
}
