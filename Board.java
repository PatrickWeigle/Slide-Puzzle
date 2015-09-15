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
public class Board extends JPanel implements ActionListener {
    Rodada raiz;
    boolean slideOrdenado = false;
    private Font font;
    private Image mesa = new ImageIcon(this.getClass().getResource("images/table.jpg")).getImage();

    private static final int[] x = {265,346,427,265,346,427,265,346,427};
    private static final int[] y = {150,150,150,231,231,231,312,312,312};

    public Board() {
        addKeyListener(new TAdapter());
        setFocusable(true);        
        setDoubleBuffered(true);

        raiz = new Rodada();

    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;      
        g2d.drawImage(mesa,-70,0,this);

        /*Verifica se está ordenado, se estiver, jogo acabou
        if(slideOrdenado){
        g2d.drawString("P A R A B É N S,   V O C Ê   C O N S E G U I U! ", 270, 280);
        g2d.drawString("Aperte enter para tentar novamente ", 140, 310);     
        }*/

        for(int i=0;i<9;i++){
            g2d.drawImage(raiz.numeros[i],x[i],y[i],this);
        }

        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }

    public void actionPerformed(ActionEvent e) {  
        repaint();  
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

                case KeyEvent.VK_LEFT:
                switch(raiz.indiceNulo){
                    case 1:
                    raiz.setEsquerda(new Rodada(raiz.numeros,raiz.indiceNulo,0));
                    raiz.getEsquerda();
                    break;
                    case 2:
                    raiz.setEsquerda(new Rodada(raiz.numeros,raiz.indiceNulo,1));
                    raiz.getEsquerda();
                    break;
                    case 4:
                    raiz.setEsquerda(new Rodada(raiz.numeros,raiz.indiceNulo,3));
                    raiz.getEsquerda();
                    break;
                    case 5:
                    raiz.setEsquerda(new Rodada(raiz.numeros,raiz.indiceNulo,4));
                    raiz.getEsquerda();
                    break;
                    case 7:
                    raiz.setEsquerda(new Rodada(raiz.numeros,raiz.indiceNulo,6));
                    raiz.getEsquerda();
                    break;
                    case 8:
                    raiz.setEsquerda(new Rodada(raiz.numeros,raiz.indiceNulo,7));
                    raiz.getEsquerda();
                    break;
                    default:
                }
                //raiz = raiz.getEsquerda();
                break;
                
                case KeyEvent.VK_RIGHT:
                switch(raiz.indiceNulo){
                    case 0:
                    raiz.setDireita(new Rodada(raiz.numeros,raiz.indiceNulo,1));
                    raiz = raiz.getDireita();
                    break;
                    case 1:
                    raiz.setDireita(new Rodada(raiz.numeros,raiz.indiceNulo,2));
                    raiz = raiz.getDireita();
                    break;
                    case 3:
                    raiz.setDireita(new Rodada(raiz.numeros,raiz.indiceNulo,4));
                    raiz = raiz.getDireita();
                    break;
                    case 4:
                    raiz.setDireita(new Rodada(raiz.numeros,raiz.indiceNulo,5));
                    raiz = raiz.getDireita();
                    break;
                    case 6:
                    raiz.setDireita(new Rodada(raiz.numeros,raiz.indiceNulo,7));
                    raiz = raiz.getDireita();
                    break;
                    case 7:
                    raiz.setDireita(new Rodada(raiz.numeros,raiz.indiceNulo,8));
                    raiz = raiz.getDireita();
                    break;
                    default:
                }
                //raiz = raiz.getDireita();
                break;
                
                case KeyEvent.VK_UP:
                switch(raiz.indiceNulo){
                    case 3:
                    raiz.setCima(new Rodada(raiz.numeros,raiz.indiceNulo,0));
                    raiz = raiz.getCima();
                    break;
                    case 4:
                    raiz.setCima(new Rodada(raiz.numeros,raiz.indiceNulo,1));
                    raiz = raiz.getCima();
                    break;
                    case 5:
                    raiz.setCima(new Rodada(raiz.numeros,raiz.indiceNulo,2));
                    raiz = raiz.getCima();
                    break;
                    case 6:
                    raiz.setCima(new Rodada(raiz.numeros,raiz.indiceNulo,3));
                    raiz = raiz.getCima();
                    break;
                    case 7:
                    raiz.setCima(new Rodada(raiz.numeros,raiz.indiceNulo,4));
                    raiz = raiz.getCima();
                    break;
                    case 8:
                    raiz.setCima(new Rodada(raiz.numeros,raiz.indiceNulo,5));
                    raiz = raiz.getCima();
                    break;
                    default:
                }
                //raiz = raiz.getCima();
                break;
                
                case KeyEvent.VK_DOWN:
                switch(raiz.indiceNulo){
                    case 0:
                    raiz.setBaixo(new Rodada(raiz.numeros,raiz.indiceNulo,3));
                    raiz = raiz.getBaixo();
                    break;
                    case 1:
                    raiz.setBaixo(new Rodada(raiz.numeros,raiz.indiceNulo,4));
                    raiz = raiz.getBaixo();
                    break;
                    case 2:
                    raiz.setBaixo(new Rodada(raiz.numeros,raiz.indiceNulo,5));
                    raiz = raiz.getBaixo();
                    break;
                    case 3:
                    raiz.setBaixo(new Rodada(raiz.numeros,raiz.indiceNulo,6));
                    raiz = raiz.getBaixo();
                    break;
                    case 4:
                    raiz.setBaixo(new Rodada(raiz.numeros,raiz.indiceNulo,7));
                    raiz = raiz.getBaixo();
                    break;
                    case 5:
                    raiz.setBaixo(new Rodada(raiz.numeros,raiz.indiceNulo,8));
                    raiz = raiz.getBaixo();
                    break;
                    default:
                }
                //raiz = raiz.getBaixo();
                break;
            }
        }
    }
}
