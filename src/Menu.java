import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private Inventario inventario;
    private Scanner scanner;

    public Menu() {
        inventario = new Inventario();
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion = 0;
        do {
            System.out.println("\n--- INVENTARIO HEARTHSTONE ---");
            System.out.println("1. Agregar carta");
            System.out.println("2. Listar cartas");
            System.out.println("3. Eliminar carta");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        agregarCarta();
                        break;
                    case 2:
                        inventario.listarCartas();
                        break;
                    case 3:
                        eliminarCarta();
                        break;
                    case 4:
                        System.out.println("¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Debes ingresar un número.");
            }
        } while (opcion != 4);
    }

    private void agregarCarta() {
        System.out.print("Nombre de la carta: ");
        String nombre = scanner.nextLine();

        try {
            Carta carta = new Carta(nombre);
            inventario.agregarCarta(carta);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al agregar carta: " + e.getMessage());
        }
    }

    private void eliminarCarta() {
        if (inventario.cantidadCartas() == 0) {
            System.out.println("No hay cartas para eliminar.");
            return;
        }

        inventario.listarCartas();
        System.out.print("Ingrese el número de la carta a eliminar: ");

        try {
            int indice = Integer.parseInt(scanner.nextLine()) - 1;
            inventario.eliminarCarta(indice);
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida. Debes ingresar un número.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No existe una carta en ese número.");
        }
    }
}
