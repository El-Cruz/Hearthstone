import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Carta> cartas;

    public Inventario() {
        this.cartas = new ArrayList<>();
    }

    public void agregarCarta(Carta c){
        if (carta == null || carta.getNombre().trim().isEmpty()) {
            throw new IllegalArgumentException("La carta no puede ser nula ni tener nombre vacío.");
        }
        cartas.add(c);
        System.out.println("Carta ´ "+ carta.getNombre()+ " ´ agregada.");
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