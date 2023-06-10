import java.util.ArrayList;

public class Persona {
	protected String nombre;
	private ArrayList<Persona> amigos = new ArrayList<Persona>();
	protected ArrayList<Moto> motos = new ArrayList<Moto>();
	private Casa casa;

	public void arrendar(Casa casa) {
		throw new UnsupportedOperationException();
	}
}