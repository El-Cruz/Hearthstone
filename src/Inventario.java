import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Carta> cartas;

    public Inventario() {
        this.cartas = new ArrayList<>();
    }

    private void agregarCarta() {
        try {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Tipo (Esbirro, Hechizo, Arma, etc.): ");
            String tipo = scanner.nextLine();

            System.out.print("Clase (Mago, Guerrero, Neutral, etc.): ");
            String clase = scanner.nextLine();

            System.out.print("Costo de maná: ");
            int costoMana = Integer.parseInt(scanner.nextLine());

            System.out.print("Ataque: ");
            int ataque = Integer.parseInt(scanner.nextLine());

            System.out.print("Salud: ");
            int salud = Integer.parseInt(scanner.nextLine());

            System.out.print("Descripción: ");
            String descripcion = scanner.nextLine();

            System.out.print("Raridad (Común, Rara, Épica, Legendaria): ");
            String raridad = scanner.nextLine();

            Carta carta = new Carta(nombre, tipo, clase, costoMana, ataque, salud, descripcion, raridad);
            inventario.agregarCarta(carta);
        } catch (NumberFormatException e) {
            System.out.println("Error: Debes ingresar un número válido para maná, ataque o salud.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public void listarCartas(){
        if (cartas.isEmpty()){
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Cartas en el inventario:");
            for (int i = 0; i < cartas.size(); i++) {
                System.out.println((i+1) + ". " + cartas.get(i));
            }
        }
    }

    public void eliminarCarta(int i){
        if(i < 0 || i >= cartas.size()){
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }
        Carta eliminada = cartas.remove(i);
        System.out.println("Carta ´ " + eliminada.getNombre() + " ´ eliminada.");
    }

    public int cantidadCartas(){
        return cartas.size()
    }
}