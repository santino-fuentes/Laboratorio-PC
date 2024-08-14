package tp_0.ejercicio_2;

/**
 *
 * @author santino.fuentes
 * @version
 */
public class TestAlquiler
{
        public static void main(String[] args)
        {
                Cliente unCliente = new Cliente("Lionel",
                        "Messi", 
                        25006100);
                Avion unAvion = new Avion("AR1010",
                        120.5,
                        2018);
                Alquiler unAlquiler = new Alquiler(10,
                        unCliente,
                        unAvion,
                        "15/08/2024",
                        "16:00",
                        "25/08/2024",
                        "23:30");
                
                System.out.println("Valor del alquiler: $" + unAlquiler.obtenerValor());
        }
}
