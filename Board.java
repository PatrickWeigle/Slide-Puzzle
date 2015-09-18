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
    Rodada atual;
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
        raiz.setarFilhos();
        atual = raiz;
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
            g2d.drawImage(atual.numeros[i],x[i],y[i],this);
        }

        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }

    public void actionPerformed(ActionEvent e) {  
        //atual.setarFilhos();
        /*switch(atual.indiceNulo){
            case 0:
            atual.setDireita(new Rodada(atual.numeros,atual.indiceNulo,1));
            atual.setBaixo(new Rodada(atual.numeros,atual.indiceNulo,3));
            break;
            case 1:
            atual.setEsquerda(new Rodada(atual.numeros,atual.indiceNulo,0));
            atual.setDireita(new Rodada(atual.numeros,atual.indiceNulo,2));
            atual.setBaixo(new Rodada(atual.numeros,atual.indiceNulo,4));
            break;
            case 2:
            atual.setEsquerda(new Rodada(atual.numeros,atual.indiceNulo,1));
            atual.setBaixo(new Rodada(atual.numeros,atual.indiceNulo,5));
            
            break;
            case 3:
            atual.setCima(new Rodada(atual.numeros,atual.indiceNulo,0));
            atual.setDireita(new Rodada(atual.numeros,atual.indiceNulo,4));
            atual.setBaixo(new Rodada(atual.numeros,atual.indiceNulo,6));
            
            
            break;
            case 4:
            atual.setCima(new Rodada(atual.numeros,atual.indiceNulo,1));
            atual.setDireita(new Rodada(atual.numeros,atual.indiceNulo,5));
            atual.setBaixo(new Rodada(atual.numeros,atual.indiceNulo,7));
            atual.setEsquerda(new Rodada(atual.numeros,atual.indiceNulo,3));
            
            break;
            case 5:
            atual.setCima(new Rodada(atual.numeros,atual.indiceNulo,2));
            atual.setBaixo(new Rodada(atual.numeros,atual.indiceNulo,8));
            atual.setEsquerda(new Rodada(atual.numeros,atual.indiceNulo,4));
            
            break;
            case 6:
            atual.setCima(new Rodada(atual.numeros,atual.indiceNulo,3));
            atual.setDireita(new Rodada(atual.numeros,atual.indiceNulo,7));
            
            break;
            case 7:
            atual.setCima(new Rodada(atual.numeros,atual.indiceNulo,4));
            atual.setDireita(new Rodada(atual.numeros,atual.indiceNulo,8));
            atual.setEsquerda(new Rodada(atual.numeros,atual.indiceNulo,6));
            
            break;
            case 8:
            atual.setCima(new Rodada(atual.numeros,atual.indiceNulo,5));
            atual.setEsquerda(new Rodada(atual.numeros,atual.indiceNulo,7));
            
            break;
            default:
        }*/
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
                switch(atual.indiceNulo){
                    case 0:
                    atual = atual.getDireita();
                    atual.setarFilhos();
                    break;
                    case 1:
                    atual = atual.getDireita();
                    atual.setarFilhos();
                    break;
                    case 3:
                    atual = atual.getDireita();
                    atual.setarFilhos();
                    break;
                    case 4:
                    atual = atual.getDireita();
                    atual.setarFilhos();
                    break;
                    case 6:
                    atual = atual.getDireita();
                    atual.setarFilhos();
                    break;
                    case 7:
                    atual = atual.getDireita();
                    atual.setarFilhos();
                    break;
                    default:
                }
                //raiz = raiz.getEsquerda();
                break;

                case KeyEvent.VK_RIGHT:
                switch(atual.indiceNulo){
                    case 1:
                    atual = atual.getEsquerda();
                    atual.setarFilhos();
                    break;
                    case 2:
                    atual = atual.getEsquerda();
                    atual.setarFilhos();
                    break;
                    case 4:
                    atual = atual.getEsquerda();
                    atual.setarFilhos();
                    break;
                    case 5:
                    atual = atual.getEsquerda();
                    atual.setarFilhos();
                    break;
                    case 7:
                    atual = atual.getEsquerda();
                    atual.setarFilhos();
                    break;
                    case 8:
                    atual = atual.getEsquerda();
                    atual.setarFilhos();
                    break;
                    default:
                }
                //raiz = raiz.getDireita();
                break;

                case KeyEvent.VK_UP:
                switch(atual.indiceNulo){
                    case 0:
                    atual = atual.getBaixo();
                    atual.setarFilhos();
                    break;
                    case 1:
                    atual = atual.getBaixo();
                    atual.setarFilhos();
                    break;
                    case 2:
                    atual = atual.getBaixo();
                    atual.setarFilhos();
                    break;
                    case 3:
                    atual = atual.getBaixo();
                    atual.setarFilhos();
                    break;
                    case 4:
                    atual = atual.getBaixo();
                    atual.setarFilhos();
                    break;
                    case 5:
                    atual = atual.getBaixo();
                    atual.setarFilhos();
                    break;
                    default:
                }
                //raiz = raiz.getCima();
                break;

                case KeyEvent.VK_DOWN:
                switch(atual.indiceNulo){
                    case 3:
                    atual = atual.getCima();
                    atual.setarFilhos();
                    break;
                    case 4:
                    atual = atual.getCima();
                    atual.setarFilhos();
                    break;
                    case 5:
                    atual = atual.getCima();
                    atual.setarFilhos();
                    break;
                    case 6:
                    atual = atual.getCima();
                    atual.setarFilhos();
                    break;
                    case 7:;
                    atual = atual.getCima();
                    atual.setarFilhos();
                    break;
                    case 8:
                    atual = atual.getCima();
                    atual.setarFilhos();
                    break;
                    default:
                }
                //raiz = raiz.getBaixo();
                break;
            }
            repaint();
        }
    }
}
