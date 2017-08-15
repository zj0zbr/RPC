package zbr.socket.rpc.idl;

/**
 * Created by zj0zbr on 17-4-9.
 */
public abstract class ILogin extends IDosomething {
    public abstract boolean login(String username,String password);
}
