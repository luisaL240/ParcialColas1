import java.util.Queue;
import java.util.Scanner;

public class Metodos {

    // 🔹 1. Llegada de cliente (ENCOLAR)
    public Queue<Cliente> llegarCliente(Queue<Cliente> cola, Scanner sc) {

        Cliente c = new Cliente();

        System.out.println("Ingrese ID:");
        int id = sc.nextInt();
        sc.nextLine();
        c.setId(id);

        System.out.println("Ingrese nombre:");
        String nombre = sc.nextLine();
        c.setNombre(nombre);

        System.out.println("Ingrese tipo de servicio:");
        String servicio = sc.nextLine();
        c.setTipoServicio(servicio);

        System.out.println("Ingrese hora de llegada:");
        String hora = sc.nextLine();
        c.setHoraLlegada(hora);      
        
        System.out.println(" ");       
        c.setAtendido(false);

        cola.offer(c);

        return cola;
    }

    // 🔹 2. Atender cliente (DESENCOLAR)
    public Queue<Cliente> atenderCliente(Queue<Cliente> cola) {

        if (!cola.isEmpty()) {

            Cliente c = cola.poll();
            c.setAtendido(true);

            System.out.println("Atendiendo a: " + c.getNombre());

        } else {
            System.out.println("No hay clientes en la cola");
        }

        return cola;
    }

    // 🔹 3. Ver siguiente cliente (PEEK)
    public Queue<Cliente> verSiguiente(Queue<Cliente> cola) {

        if (!cola.isEmpty()) {

            Cliente c = cola.peek();
            System.out.println("Siguiente cliente: " + c.getNombre());

        } else {
            System.out.println("No hay clientes en espera");
        }

        return cola;
    }

    // 🔹 4. Ver toda la cola
    public Queue<Cliente> verCola(Queue<Cliente> cola) {

        if (!cola.isEmpty()) {

            for (Cliente c : cola) {
                System.out.println("ID: " + c.getId());
                System.out.println("Nombre: " + c.getNombre());
                System.out.println("Servicio: " + c.getTipoServicio());
                System.out.println("Hora: " + c.getHoraLlegada());
                System.out.println("------------------");
            }

        } else {
            System.out.println("Cola vacía");
        }

        return cola;
    }
}