import java.util.*;

public class SocialNetwork {
    private Queue<Persona> colaEspera;
    private PriorityQueue<Persona> colaPrioridad;
    private Stack<Persona> pilaEliminados;
    private Set<String> nombresCompletos;

    public SocialNetwork() {
        this.colaEspera = new LinkedList<>();
        this.colaPrioridad = new PriorityQueue<>(Comparator.comparing(Persona::getPrioridad).reversed());
        this.pilaEliminados = new Stack<>();
        this.nombresCompletos = new HashSet<>();
    }

    public void agregarPersona(Persona persona) {
        if (nombresCompletos.contains(persona.getNombreCompleto())) {
            System.out.println("Error: Ya existe una persona con el mismo nombre completo.");
            return;
        }
        nombresCompletos.add(persona.getNombreCompleto());
        colaEspera.offer(persona);
        System.out.println("Se ha agregado a " + persona.getNombreCompleto() + " a la cola de espera.");
    }

    public void activarSiguiente() {
        if (colaEspera.isEmpty()) {
            System.out.println("No hay personas en espera.");
            return;
        }
        Persona persona = colaEspera.poll();
        persona.setPrioridad(persona.getPrioridad() + 1);
        colaPrioridad.offer(persona);
        System.out.println("Se ha activado a " + persona.getNombreCompleto() + ".");