import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServicioRemotoIMP extends UnicastRemoteObject implements ServicioRemoto {
    public ServicioRemotoIMP() throws RemoteException {
        // Constructor vacío
    }

    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
}

