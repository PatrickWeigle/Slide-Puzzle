import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.File;

/**
 * Escreva a descrição da classe Jogo aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Jogo extends JPanel implements ActionListener {
    Rodada raiz;
    boolean slideOrdenado = false;
    private Font font;
    
    public Jogo() {
        addKeyListener(new TAdapter());
        setFocusable(true);        
        setDoubleBuffered(true);
        

        raiz = new Rodada();

        /**Adicionar Rodada na tela (Jpanel)**/
        /*Snake aux = cabeca;
        while(aux.getProxima() != null){
        add(aux);
        aux = aux.getProxima();
        }*/
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;      

        /**Adicionar imagens da Rodada na tela**/
        /*int i = 0;
        int tamanho = tamanhoCobrinha();
        Snake aux = cabeca;
        while(i < tamanho){
        g2d.drawImage(aux.getImage(),aux.getX(),aux.getY(),this);
        aux = aux.getProxima();
        i++;
        }*/

        /**Verifica se está ordenado, se estiver, jogo acabou**/
        //verifica seu deu game over e avisa o usuário
        /*if(slideOrdenado){
        g2d.drawString("G A M E   O V E R ", 270, 280);
        g2d.drawString("Aperte enter para tentar novamente ", 140, 310);     
        }*/

        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }

    public void paintIntro(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        //g2d.drawImage(cobrinha.getImage(),cobrinha.getX(),cobrinha.getY(),this);
        try{
            File file = new File("fonts/VT323-Regular.ttf");
            font = Font.createFont(Font.TRUETYPE_FONT, file);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
            font = font.deriveFont(Font.PLAIN,40);
            g2d.setFont(font);
        }catch (Exception e){
            System.out.println(e.toString());
        }   
        g2d.drawString("S N A K E: ", 300, 300); 
    }
    
    public void actionPerformed(ActionEvent e) {  
        if(!slideOrdenado){
            /*
            switch(moverPara){
                case "esquerda":
                xAtual = cabeca.getX();
                yAtual = cabeca.getY();
                cabeca.mover(-28,0);
                moveCorpo(xAtual,yAtual,tamanho);
                break;

                case "direita":
                xAtual = cabeca.getX();
                yAtual = cabeca.getY();
                cabeca.mover(28,0);
                moveCorpo(xAtual,yAtual,tamanho);
                break;

                case "cima":
                xAtual = cabeca.getX();
                yAtual = cabeca.getY();
                cabeca.mover(0,-28);
                moveCorpo(xAtual,yAtual,tamanho);
                break;

                case "baixo":
                xAtual = cabeca.getX();
                yAtual = cabeca.getY();
                cabeca.mover(0,28);
                moveCorpo(xAtual,yAtual,tamanho);
                break;
            }*/

            repaint();  
        }
    }
    
    private class TAdapter extends KeyAdapter {
        public void keyPressed(KeyEvent e) {

            // Obtém o código da tecla
            int key =  e.getKeyCode();

            switch(key){
                case KeyEvent.VK_ENTER:
                if(slideOrdenado){
                    slideOrdenado = false;
                    //raiz = new Rodada();
                }
                break;
                /*
                case KeyEvent.VK_LEFT:
                if(moverPara == "direita"){
                    break;
                }else{
                    cabeca.setImage("images/headEsq.png");
                    moverPara = "esquerda";
                    break;
                }

                case KeyEvent.VK_RIGHT:
                if(moverPara == "esquerda"){
                    break;
                }else{
                    cabeca.setImage("images/headDir.png");
                    moverPara = "direita";
                    break;
                }

                case KeyEvent.VK_UP:
                if(moverPara == "baixo"){
                    break;
                }else{
                    cabeca.setImage("images/headCima.png");
                    moverPara = "cima";
                    break;
                }

                case KeyEvent.VK_DOWN:
                if(moverPara == "cima"){
                    break;
                }else{
                    cabeca.setImage("images/headBaixo.png");
                    moverPara = "baixo";
                    break;
                }*/

            }
        }
    }
}
