import java.awt.Image;
import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;
/**
 * Write a description of class Node here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rodada extends JPanel
{
    // instance variables - replace the example below with your own
    private Object x;
    private Rodada p1;
    private Rodada p2;
    private Rodada p3;
    private Rodada p4;    

    /**
     * Constructor for objects of class Node
     */
    public Rodada()
    {

    }
    
    public void setP1( Rodada p1){
        this.p1 = p1;
    }
    
    public  Rodada getP1(){
        return this.p1;
    }
    
    public void setP2( Rodada p2){
        this.p2 = p2;
    }
    
    public  Rodada getP2(){
        return this.p2;
    }
    
    public void setP3( Rodada p3){
        this.p3 = p3;
    }
    
    public  Rodada getP3(){
        return this.p3;
    }
    
    public void setP4( Rodada p4){
        this.p4 = p4;
    }
    
    public  Rodada getP4(){
        return this.p4;
    }
    
    public Rodada(String args)
    {
        this.x = args;
    } 
    
}
