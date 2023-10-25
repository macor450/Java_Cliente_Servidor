import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServidorRMI {
    public static void main(String[] args) {
        try {
            ServicioRemoto servicioremoto = new ServicioRemotoIMP();

            // Iniciar el registro RMI en el puerto 1099
            LocateRegistry.createRegistry(1099);

            // Registrar el objeto remoto
            Naming.rebind("CalculatorService", servicioremoto);

            System.out.println("Servidor RMI listo.");
        } catch (Exception e) {
            System.err.println("Error en el servidor: " + e);
        }
    }
}

