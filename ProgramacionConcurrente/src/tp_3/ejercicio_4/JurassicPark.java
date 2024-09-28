package tp_3.ejercicio_4;

/**
 *
 * @author sang
 */
public class JurassicPark
{
        /*
        En un sistema de reserva de espacios en un parque temático en línea,
        los visitantes pueden seleccionar y reservar áreas específicas para
        actividades y entretenimiento.
        Cada área tiene un número limitado de espacios disponibles.
        */
        
        public static void main(String[] args)
        {
                Area areas[] = new Area[3];
                areas[0] = new Area("Territorio Triceratops", 10);
                areas[1] = new Area("Reino T-Rex", 4);
                areas[2] = new Area("Valle Gallimimus", 20);
                
                Visitante visitantes[] = new Visitante[100];
                Thread visitantesThread[] = new Thread[100];
                
                for (int i = 0; i < visitantes.length; i++) {
                        visitantes[i] = new Visitante(areas);
                }
                
                for (int j = 0; j < visitantesThread.length; j++) {
                        visitantesThread[j] = new Thread(visitantes[j], "Visitante #" + j);
                }
                
                for (int k = 0; k < visitantesThread.length; k++) {
                        visitantesThread[k].start();
                }
        }
}
