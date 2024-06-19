/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serpiente;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author Marta Moreno
 */
public class PanelSnake extends JPanel {
    Color colorsnake = Color.blue;
    Color colorcomida = Color.red;
    int tammax ,tam ,can, res;
    List<int[]> snake = new ArrayList<>();
    int [] comida;
    
    
    
    public PanelSnake (int tammax,int can){ 
        this.tammax = tammax;
        this.can = can;
        this. tam = tammax/can;
        this.res =tammax%can;
        int[] a = {can/2-1, can/2-1};
        int[] b = {can/2, can/2-1};
        snake.add(a);
        snake.add(b);
        
    }
    @Override
    public void paint(Graphics pintor){
        super.paint (pintor);
        
        for (int i =0; i < snake.size(); i++){
            pintor.fillRect(res/2+ snake.get(i) [0]* tam,res/2+ snake.get(i) [1]* tam, tam-1, tam-1);
        }
        for (int[] par:snake) {
            pintor.fillRect (res/2+par[0]*tam, res/2+par[1]*tam, tam-1, tam-1);
        }
      
    }
    
}