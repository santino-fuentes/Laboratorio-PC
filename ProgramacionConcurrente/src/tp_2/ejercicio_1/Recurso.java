package tp_2.ejercicio_1;

public class Recurso {
	public static void uso() {
		Thread t = Thread.currentThread();
		System.out.println("en Recurso: Soy" + t.getName());
	}
}
