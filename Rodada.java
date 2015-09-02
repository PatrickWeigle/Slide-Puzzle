import java.awt.Image;
import javax.swing.*;
/**
 * Escreva a descrição da classe Rodada aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Rodada extends JPanel
{
    private Rodada esquerda;
    private Rodada cima;
    private Rodada direita;
    private Rodada baixo;
    
    private byte[] numeros = new byte[10];
    
    private Image image;
    
    
    public Rodada(){
        
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
