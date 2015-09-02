import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class InicializarJogo extends JFrame
{

    private static int WIDTH = 800;
    private static int HEIGHT = 600;
    
    
    public InicializarJogo(){
        
         // Adiciona o JPanel do jogo
        add(new Jogo());

        // Define a saida da aplicação
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Define o tamanho da janela
        setSize(new Dimension(WIDTH,HEIGHT));
        // A localização
        setLocationRelativeTo(null);
        // O titulo da janela
        setTitle("Slide-Puzzle");
        // Impede o redimensionamento da janela
        setResizable(false);
        // Mostra a janela
        setVisible(true);
        
    }
    public static void main (String args[]){
        new InicializarJogo();
    }
    
    
}
