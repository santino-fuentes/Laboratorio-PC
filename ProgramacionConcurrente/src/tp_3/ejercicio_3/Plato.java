/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_3.ejercicio_3;

/**
 *
 * @author santino.fuentes
 */
public class Plato
{
        public synchronized void comer() throws InterruptedException
        {
                System.out.println(Thread.currentThread().getName()
                        + "\n|Comiendo...\n|Am, am, am, am, am, am, am, am...");
                Thread.sleep(1000);
        }
}
