import java.util.ArrayList;

public class Persona {
	private String nombre;
	private int edad;
	private Escuela escuela;
	private ArrayList<Persona> hermanos = new ArrayList<Persona>();
	private ArrayList<Persona> amigos = new ArrayList<Persona>();
	private Mascota mascota;

	public Persona(String nombre, int edad) {
		throw new UnsupportedOperationException();
	}
}