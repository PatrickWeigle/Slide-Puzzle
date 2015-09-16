import java.awt.Image;
import javax.swing.*;
import java.util.Random;
import java.util.Arrays;

/**
 * Escreva a descrição da classe Rodada aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Rodada //extends JPanel
{
    private Rodada esquerda;
    private Rodada cima;
    private Rodada direita;
    private Rodada baixo;
    int indiceNulo = 0;
    
    private Image num1 = new ImageIcon(this.getClass().getResource("images/1.png")).getImage();
    private Image num2 = new ImageIcon(this.getClass().getResource("images/2.png")).getImage();
    private Image num3 = new ImageIcon(this.getClass().getResource("images/3.png")).getImage();
    private Image num4 = new ImageIcon(this.getClass().getResource("images/4.png")).getImage();
    private Image num5 = new ImageIcon(this.getClass().getResource("images/5.png")).getImage();
    private Image num6 = new ImageIcon(this.getClass().getResource("images/6.png")).getImage();
    private Image num7 = new ImageIcon(this.getClass().getResource("images/7.png")).getImage();
    private Image num8 = new ImageIcon(this.getClass().getResource("images/8.png")).getImage();
    Image[] numeros = {num1,num2,num3,num4,num5,num6,num7,num8,null};
    
    private Image image;
    
    public Rodada(){ 
        Random random = new Random();
        for (int i=0; i < (numeros.length - 1); i++) { 
            int j = random.nextInt(numeros.length);
            Image temp = numeros[i];
            numeros[i] = numeros[j];
            numeros[j] = temp;
        } 
        verificarIndNulo();
    }
    
    public void verificarIndNulo(){
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] == null){
                indiceNulo = i;
            }
        }
    }
    
    public Rodada(Image[] _numeros, int indRecebeNumero, int indRecebeZero){
        numeros = Arrays.copyOf(_numeros, _numeros.length);
        
        Image numero = numeros[indRecebeZero];
        numeros[indRecebeZero] = null;
        indiceNulo = indRecebeZero;
        numeros[indRecebeNumero] = numero;
    }
    
    public void setEsquerda(Rodada _Rodada){
        esquerda = _Rodada;
    }
    
    public Rodada getEsquerda(){
        return esquerda;
    }
    
    public void setCima(Rodada _Rodada){
        cima = _Rodada;
    }
    
    public Rodada getCima(){
        return cima;
    }
    
    public void setDireita(Rodada _Rodada){
        direita = _Rodada;
    }
    
    public Rodada getDireita(){
        return direita;
    }
    
    public void setBaixo(Rodada _Rodada){
        baixo = _Rodada;
    }
    
    public Rodada getBaixo(){
        return baixo;
    }
}
