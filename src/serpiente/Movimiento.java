/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serpiente;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marta Moreno
 */
public class Movimiento  implements Runnable{

    PanelSnake panel;
    boolean estado = true;
    
    public Movimiento(PanelSnake panel){
        this.panel = panel;
    }

    @Override
    public void run() {
        while(true){
            panel.avanzar();
            panel.repaint();
            try {
                Thread.sleep(250);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    
    }
    public void parar(){
        this.estado = false;
    }
}
