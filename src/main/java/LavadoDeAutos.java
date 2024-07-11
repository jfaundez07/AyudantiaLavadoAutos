import java.util.ArrayList;
import java.util.Scanner;

public class LavadoDeAutos {

    private ArrayList<Orden> ordenes;
    private ArrayList<Cliente> clientes;

    public LavadoDeAutos() {
        this.ordenes = new ArrayList<Orden>();
        this.clientes = new ArrayList<Cliente>();
    }

    public void registrarCliente(Scanner scanner) {
        System.out.println("\n#----- Registro de cliente -----#\n");

        try {
            System.out.println("Ingrese el nombre del cliente: ");
            String nombre = scanner.next();
            System.out.println("Ingrese el apellido del cliente: ");
            String apellido = scanner.next();
            System.out.println("Ingrese el contacto del cliente: ");
            String contacto = scanner.next();
            System.out.println("Ingrese el rut del cliente: ");
            String rut = scanner.next();
            int id = this.clientes.size();

            Cliente cliente = new Cliente(nombre, apellido, contacto, rut, id);
            this.clientes.add(cliente);

        } catch (Exception e) {
            System.out.println("\nError al registrar cliente!\n");
        }

        System.out.println("\nCliente registrado con exito!\n");
    }

    public void registrarAutoCliente(Scanner scanner) {
        if (this.clientes.isEmpty()) {
            System.out.println("\nNo hay clientes registrados!\n");
            return;
        }

        System.out.println("\n#----- Registro de auto de cliente -----#\n");

        try {
            Cliente cliente = busarCliente(scanner);
            System.out.println("Ingrese la patente del auto: ");
            String patente = scanner.next();
            System.out.println("Ingrese el modelo del auto: ");
            String modelo = scanner.next();

            Auto auto = new Auto(patente, modelo);
            cliente.addAuto(auto);

        } catch (Exception e) {
            System.out.println("\nError al registrar auto de cliente!\n");
        }
    }

    public void registrarOrden() {
    }

    public void finalizarOrden() {
    }

    public void mostrarOrdenesPendientes() {
    }

    public void mostrarOrdenesFinalizadas() {
    }

    private Cliente busarCliente(Scanner scanner) {
        Cliente cliente = null;

        do {
            System.out.println("\n#----- Buscar cliente -----#\n");
            for ( Cliente buscado : this.clientes) {
                System.out.println("[" + buscado.getId() + "]" + ". " + buscado.getNombre() + " " + buscado.getApellido() + " - Rut: " + buscado.getRut());
            }

            try {
                System.out.println("Ingrese la id del cliente: ");
                int id = Integer.parseInt(scanner.next());
                cliente = this.clientes.get(id);

            } catch (Exception e) {
                System.out.println("\nError al buscar cliente!\n");
            }

        } while (cliente == null);

        return cliente;
    }

    private Auto buscarAuto(Cliente cliente) {
        throw new UnsupportedOperationException();
    }
}