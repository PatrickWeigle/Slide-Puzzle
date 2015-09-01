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
public class Raiz extends JPanel
{
    // instance variables - replace the example below with your own
    private Object x;
    private Raiz p1;
    private Raiz p2;
    private Raiz p3;
    private Raiz p4;    

    /**
     * Constructor for objects of class Node
     */
    public Raiz()
    {

    }
    
    public void setP1(Raiz p1){
        this.p1 = p1;
    }
    
    public Raiz getP1(){
        return this.p1;
    }
    
    public void setP2(Raiz p2){
        this.p2 = p2;
    }
    
    public Raiz getP2(){
        return this.p2;
    }
    
    public void setP3(Raiz p3){
        this.p3 = p3;
    }
    
    public Raiz getP3(){
        return this.p3;
    }
    
    public void setP4(Raiz p4){
        this.p4 = p4;
    }
    
    public Raiz getP4(){
        return this.p4;
    }
    
    public Raiz(String args)
    {
        this.x = args;
    } 
    
}
