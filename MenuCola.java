import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MenuCola {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<Cliente> cola = new LinkedList<>();
        Metodos m = new Metodos();

        boolean bandera = true;

        while (bandera) {
            System.out.println("=== BANCO ===");
            System.out.println("1. Llegada de cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Ver el siguiente cliente");
            System.out.println("4. Ver cola");
            System.out.println("5. Salir");
            System.out.println(" ");

            int opc = sc.nextInt();

            switch (opc) {
                case 1:
                    cola = m.llegarCliente(cola, sc);
                    break;

                case 2:
                    cola = m.atenderCliente(cola);
                    break;

                case 3:
                    cola = m.verSiguiente(cola);
                    break;

                case 4:
                    cola = m.verCola(cola);
                    break;

                case 5:
                    System.out.println("Hasta luego");
                    bandera = false;
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}

