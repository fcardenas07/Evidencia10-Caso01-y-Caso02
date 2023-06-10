import java.util.ArrayList;

public class Mascota {
	protected String nombre;
	protected String color;
	protected ArrayList<Persona> dueños = new ArrayList<Persona>();

	public void comer() {
		throw new UnsupportedOperationException();
	}

	public Mascota(String nombre, ArrayList<Persona> dueños) {
		throw new UnsupportedOperationException();
	}
}