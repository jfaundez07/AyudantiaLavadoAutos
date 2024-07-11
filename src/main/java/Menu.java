import java.util.Scanner;

public class Menu {

    private Scanner scanner;

    public void menu() {

        LavadoDeAutos MiLavadoDeAutos = new LavadoDeAutos();
        scanner = new Scanner(System.in);
        boolean continuar;

        do {
            opcionesMenu();
            String seleccion = scanner.next();
            continuar = true;

            switch (seleccion) {
                case "1":
                    MiLavadoDeAutos.registrarCliente(scanner);
                    break;
                case "2":
                    MiLavadoDeAutos.registrarAutoCliente(scanner);
                    break;
                case "3":
                    MiLavadoDeAutos.registrarOrden();
                    break;
                case "4":
                    MiLavadoDeAutos.finalizarOrden();
                    break;
                case "5":
                    MiLavadoDeAutos.mostrarOrdenesPendientes();
                    break;
                case "6":
                    MiLavadoDeAutos.mostrarOrdenesFinalizadas();
                    break;
                case "7":
                    System.out.println("\nSaliendo del sistema...\n");
                    continuar = false;
                    break;
                default:
                    System.out.println("\nOpcion no valida!\n");
            }

        } while (continuar);
    }

    public void opcionesMenu() {
        System.out.println("\n#----- MENU PRINCIPAL -----#\n");
        System.out.println("[1] Registrar cliente");
        System.out.println("[2] Registrar auto de cliente");
        System.out.println("[3] Registrar orden");
        System.out.println("[4] Finalizar orden");
        System.out.println("[5] Mostrar ordenes pendientes");
        System.out.println("[6] Mostrar ordenes finalizadas");
        System.out.println("[7] Salir\n");
        System.out.println("Seleccione una opcion: ");
    }

}