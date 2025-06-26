public class Carta {
    private String nombre;
    private String tipo;       // Esbirro, Hechizo, Arma, etc.
    private String clase;      // Mago, Guerrero, Neutral, etc.
    private int costoMana;
    private int ataque;
    private int salud;
    private String descripcion;
    private String raridad;    // Común, Rara, Épica, Legendaria

    public Carta(String nombre, String tipo, String clase, int costoMana,
                 int ataque, int salud, String descripcion, String raridad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.clase = clase;
        this.costoMana = costoMana;
        this.ataque = ataque;
        this.salud = salud;
        this.descripcion = descripcion;
        this.raridad = raridad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getClase() {
        return clase;
    }

    public int getCostoMana() {
        return costoMana;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getSalud() {
        return salud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getRaridad() {
        return raridad;
    }

    @Override
    public String toString() {
        return String.format("Carta{nombre='%s', tipo='%s', clase='%s', costoMana=%d, ataque=%d, salud=%d, raridad='%s', descripcion='%s'}",
                nombre, tipo, clase, costoMana, ataque, salud, raridad, descripcion);
    }
}
