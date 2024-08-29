package tp_2.ejercicio_6;

import java.util.Random;

public class Corredor implements Runnable
{

        private int pasos;
        private int distanciaRecorrida;
        private String nombre;
        private Random nroRandom = new Random();
        
        public Corredor(String unNombre)
        {
                this.nombre = unNombre;
                this.distanciaRecorrida = 0;
        }
        
        public String nombre()
        {
                return (this.nombre);
        }
        
        public int distanciaRecorrida()
        {
                return (this.distanciaRecorrida);
        }
        
        public void run()
        {
                System.out.println("Comienza la carrera " + this.nombre);
                try {
                        /*
                        Cada corredor sabe la distancia que recorrió, por lo que
                        deberá imprimir su nombre y el avance (aleatorio entre 1
                        y 10), por cada paso que realiza. Entre cada paso
                        realizado descansa. Una vez que haga 100 pasos, el
                        corredor habrá terminado.
                         */
                        while (this.distanciaRecorrida <= 100) {
                                this.pasos = this.nroRandom.nextInt(10);
                                this.distanciaRecorrida += pasos;
                                System.out.println("Corredor " + this.nombre
                                        + " avanzó " + pasos + " pasos.");
                                Thread.sleep(100);
                        }
                } catch (Exception exc) {
                        System.out.println("ERROR");
                }
        }
}
