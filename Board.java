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
    private Rodada inicio;    
    private int velocidade = 100;    
    private boolean isPlaying = false;    
    private String frase;
    private Mesa posicoes = new Mesa();
    private Image mesa = new ImageIcon(this.getClass().getResource("images/table.jpg")).getImage();
    private Image num1 = new ImageIcon(this.getClass().getResource("images/1.png")).getImage();
    private Image num2 = new ImageIcon(this.getClass().getResource("images/2.png")).getImage();
    private Image num3 = new ImageIcon(this.getClass().getResource("images/3.png")).getImage();
    private Image num4 = new ImageIcon(this.getClass().getResource("images/4.png")).getImage();
    private Image num5 = new ImageIcon(this.getClass().getResource("images/5.png")).getImage();
    private Image num6 = new ImageIcon(this.getClass().getResource("images/6.png")).getImage();
    private Image num7 = new ImageIcon(this.getClass().getResource("images/7.png")).getImage();
    private Image num8 = new ImageIcon(this.getClass().getResource("images/8.png")).getImage();
    
    private Image[] nums = {num1,num2,num3,num4,num5,num6,num7,num8};
    
    
    //private Image num9 = new ImageIcon(this.getClass().getResource("images/9.png")).getImage();
    
    
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
        g2d.drawImage(mesa,-70,0,this);
        g2d.drawImage(nums[0],posicoes.xX(0),posicoes.yY(0),this);
        g2d.drawImage(nums[1],posicoes.xX(1),posicoes.yY(1),this);
        g2d.drawImage(nums[2],posicoes.xX(2),posicoes.yY(2),this);
        g2d.drawImage(nums[3],posicoes.xX(3),posicoes.yY(3),this);
        g2d.drawImage(nums[4],posicoes.xX(4),posicoes.yY(4),this);
        g2d.drawImage(nums[5],posicoes.xX(5),posicoes.yY(5),this);
        g2d.drawImage(nums[6],posicoes.xX(6),posicoes.yY(6),this);
        g2d.drawImage(nums[7],posicoes.xX(7),posicoes.yY(7),this);
        //g2d.drawImage(num9,posicoes.xX(8),posicoes.yY(8),this);
        
        
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