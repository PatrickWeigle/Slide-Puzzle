import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mesa extends JPanel
{
    private String cubo = "images/";

    private int incrementX = 0;
    private int incrementY = 0;
    private int x;
    private int y;    
    private Image image;
    
    public Mesa() {        
        x = 0;
        y = 0;        
    }
    
    public void setIncrementX(int incrementX){
        this.incrementX = incrementX;
    }
    
    public void setIncrementY(int incrementY){
        this.incrementY = incrementY;
    }
   
    public int getIncrementX(){
        return this.incrementX;
    }
    
    public int getIncrementY(){
        return this.incrementY;
    }
    
    public void move() {          
        x += incrementX;
        y += incrementY;        
    }
    
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    } 
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }    
    

    public Image getImage() {
        
        return image;
        
    }   
    
    public Image getImageFloor(){
        ImageIcon ii = new ImageIcon(this.getClass().getResource("images/floor.jpg"));
        return ii.getImage();        
    }

}
