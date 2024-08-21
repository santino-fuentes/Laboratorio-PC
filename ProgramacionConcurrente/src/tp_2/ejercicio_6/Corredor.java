package tp_2.ejercicio_6;

public class Corredor extends Thread
{
	private String nombre;
	private double distanciaRecorrida;

	public Corredor(String unNombre)
	{
		this.nombre = unNombre;
	}
}
