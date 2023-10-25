import java.rmi.Naming;

public class ClienteRMI {
    public static void main(String[] args) {
        try {
            ServicioRemoto servicio = (ServicioRemoto) Naming.lookup("rmi://localhost/CalculatorService");

            int result = servicio.add(5, 3);
            System.out.println("Resultado de la suma: " + result);
        } catch (Exception e) {
            System.err.println("Error en el cliente: " + e);
        }
    }
}
