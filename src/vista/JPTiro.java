package vista;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import javax.swing.JPanel;

public class JPTiro extends JPanel{

    private int punto, aunX, tColumnas;
    
    public JPTiro() {
        punto = 0;
        tColumnas = 0;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D)g;
        if(tColumnas>0){
            actualizarValores();
        
            g2d.setPaint( new GradientPaint( 5, 30, Color.red, 35, 100, Color.blue, true ) ); 
            g2d.translate(punto, 0);
            GeneralPath figura = new GeneralPath();
            figura.moveTo( 0, 0);
            figura.lineTo( aunX, 0);
            figura.lineTo( aunX, 10);
            figura.lineTo( (aunX)/2, 40);
            figura.lineTo( 0, 10);
            figura.lineTo( 0, 0);
            figura.closePath();
            g2d.fill( figura );
        }
            
    }
    
    private void actualizarValores(){
        try{
            aunX = getWidth()/tColumnas;
        }catch(Exception e){
            aunX = 0;
        }
        
    }
    
    public void cambiarPosicion(int cor, int tC){
        tColumnas = tC;
        int aux = 0;
        if(aunX>0){
            aux = (cor/aunX) > (tC-1)? 6 : (cor/aunX);
            punto = aux*aunX;
            repaint();
        }else{
            actualizarValores();
        }
            
    }
        
}