package tp_3.ejercicio_4;

import java.util.Random;

/**
 *
 * @author sang
 */
public class Visitante implements Runnable
{
        private Area[] areas;
        private int unArea;
        
        public Visitante(Area[] unasAreas)
        {
                this.areas = unasAreas;
                Random random = new Random();
                this.unArea = random.nextInt(3);
        }
        
        @Override
        public void run()
        {
                try {                        
                        System.out.println(Thread.currentThread().getName()
                                + " Esperando para comprar tickets...");
                        
                        // Realiza la reserva en alguna de las áreas
                        String ticket = this.areas[unArea].reservar();
                        
                        // Imprime el ticket de la compra
                        System.out.println(ticket);
                        
                        // Recorre el área
                        Thread.sleep(1000);
                } catch (Exception e) {
                } finally {
                        // Libera el espacio
                        this.areas[this.unArea].liberarEspacio();
                }
        }
}
