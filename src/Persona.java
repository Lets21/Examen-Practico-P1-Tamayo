import java.util.ArrayList;
import java.util.Objects;

public class Persona {
    private int id;
    private String nombreCompleto;
    private int edad;
    private int prioridad;
    private ArrayList<Persona> amigos;

    public Persona(int id, String nombreCompleto, int edad, int prioridad) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.prioridad = prioridad;
        amigos = new ArrayList<>();
    }
    public int getId() {
        return id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public ArrayList<Persona> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Persona> amigos) {
        this.amigos = amigos;
    }

    public void agregarAmigo(Persona amigo) {
        amigos.add(amigo);
    }

    public void eliminarAmigo(Persona amigo) {
        amigos.remove(amigo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombreCompleto, persona.nombreCompleto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreCompleto);
    }
}