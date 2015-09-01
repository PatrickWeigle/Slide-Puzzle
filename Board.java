import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.io.File;
import javax.swing.ImageIcon;
import java.awt.geom.AffineTransform;

public class Board extends JPanel implements ActionListener {

    private Timer timer;    
    private Raiz inicio;    
    private int velocidade = 100;    
    private boolean isPlaying = false;    
    private String frase;
    
    public Board() {

        addKeyListener(new TAdapter());
        setFocusable(true);        
        setDoubleBuffered(true);
        setBackground(Color.WHITE);

        frase = "Pressione ENTER para iniciar o jogo! ";
        timer = new Timer(velocidade, this);
        timer.start();
    }
    
    public void iniciar(){
      
    }     
    
    public boolean isEmpty(){
        if(inicio == null){
            return true;
        }else{  
            return false;
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;    
        
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
        
    }    
    
    public void actionPerformed(ActionEvent e) {     
        repaint(); 
    }    
    
    private class TAdapter extends KeyAdapter {

        public void keyPressed(KeyEvent e) {
            
            // Obtém o código da tecla
            int key =  e.getKeyCode();
            //keyAnt = key;
            switch (key){
                case KeyEvent.VK_ENTER:                    
                    break;
                    
                case KeyEvent.VK_LEFT:                  
                    break;
                    
                case KeyEvent.VK_RIGHT:                    
                    break;
                    
                case KeyEvent.VK_UP:                    
                    break;
                    
                case KeyEvent.VK_DOWN:                    
                    break;
            }           
           
        }
    }
    
}