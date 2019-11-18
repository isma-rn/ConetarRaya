package vista;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import modelo.Tablero;
import modelo.Tiro;

public class JPTablero extends JPanel {

    private Tablero objTablero = new Tablero();
    private byte indice;
    private int aunX, aunY, pInicial, pFinal;
    private final ImageIcon estrella;
    private final Color rojo = new Color(195, 44, 14);
    private final Color amarillo = new Color(255, 227, 11);
    //
    public Timer animacion = null;

    public JPTablero() {
        indice = 1;
        estrella = new ImageIcon(getClass().getResource("/recurso/estrella.png"));
        animacion = new Timer(40, new ManejadorTimer());
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        actualizarValores();
        
        //**********************************************************************
        for (Tiro tiro : objTablero.tiros) {
            g2d.setColor( (tiro.getNumJugador() == 1)? rojo : amarillo);
            
            if (indice == 1) {//mostrar
                if (tiro.equals(objTablero.tiros.get(objTablero.tiros.size() - 1))) {//si es el ultimo tiro
                    g2d.fillOval((int) tiro.getValColumna() * aunX, pInicial * (aunY/2), aunX, aunY);
                } else {
                    g2d.fillOval((int) tiro.getValColumna() * aunX, (int) tiro.getValFila() * aunY, aunX, aunY);
                }
            }else if (indice == 2) {// vaciar
                g2d.fillOval((int) tiro.getValColumna() * aunX, ((int) tiro.getValFila() + pInicial) * aunY, aunX, aunY);                
            }
            if (tiro.isResaltar()) {
                g2d.setColor(Color.white);
                g2d.drawImage(estrella.getImage(),
                        ((int) tiro.getValColumna() * (aunX)) + (aunX / 2 - (estrella.getIconWidth() / 2)),
                        ( (indice == 1)? (((int) tiro.getValFila() * aunY)) : (((int) tiro.getValFila() + pInicial)) * aunY ) + (aunY / 2 - (estrella.getIconHeight() / 2)),
                        this);
            }
            if (pInicial == pFinal) {
                pFinal = 0;
                detenerAnimacion();
            }
            
        }
        //**********************************************************************
       
        //tablero
        if (objTablero.getFilas() > 0 && objTablero.getColumnas() > 0) {
            g2d.setPaint(gettexturaFondoTablero());

            Area a1 = new Area(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 40, 40));

            for (double i = 0; i <= getWidth(); i += aunX) {
                for (double j = 0; j <= getHeight(); j += aunY) {
                    Area a2 = new Area(new Ellipse2D.Double(i + 8, j + 8, aunX - 16, aunY - 16));
                    a1.subtract(a2);
                }
            }
            g2d.fill(a1);
            g2d.setStroke(new BasicStroke(6.5f));
            g2d.setColor(new Color(10, 100, 200));
            for (double i = 0; i <= getWidth(); i += aunX) {
                for (double j = 0; j <= getHeight(); j += aunY) {
                    g2d.drawOval((int) i + 8, (int) j + 8, (int) (aunX - 16), (int) (aunY - 16));
                }
            }
        } else {
            g2d.drawString("Error...", 20, 20);
        }
    }

    private TexturePaint gettexturaFondoTablero() {
        BufferedImage imagenBuf = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        Graphics2D gg = imagenBuf.createGraphics();
        gg.setColor(new Color(0, 102, 204));
        gg.fillRect(0, 0, 10, 10);
        gg.setColor(new Color(12, 136, 231));
        gg.drawRect(1, 1, 8, 8);
        return new TexturePaint(imagenBuf, new Rectangle(10, 10));
    }

    private void actualizarValores() {
        try {
            aunX = getWidth() / objTablero.getColumnas();
            aunY = getHeight() / objTablero.getFilas();
        } catch (Exception e) {
            aunX = 0;
            aunY = 0;
        }
    }

    public void actualizarVistaTablero(Tablero objAux) {
        objTablero = objAux;
        indice = 1;
        if (objTablero.tiros.size() > 0) {
            animacion.setDelay(40);//60
            pInicial = -2;
            pFinal = objTablero.tiros.get(objTablero.tiros.size() - 1).getValFila()*2;
            iniciarAnimacion();
        } else {
            repaint();
        }
    }

    public void vaciarFichas() {
        indice = 2;
        if (objTablero.tiros.size() > 0) {
            animacion.setDelay(50);
            pInicial = 0;
            pFinal = objTablero.getFilas();
            iniciarAnimacion();
        }
    }

    //--------------------------------------------------------------------------
    public void iniciarAnimacion() {
        if (animacion.isRunning()) {
            animacion.restart();
        } else {
            animacion.start();
        }
    }

    public void detenerAnimacion() {
        animacion.stop();
    }

    //
    private class ManejadorTimer implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            pInicial++;
            repaint();
        }
    }
}