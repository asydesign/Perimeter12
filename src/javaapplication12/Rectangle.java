/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author fmi
 */
public class Rectangle extends Figure{
     private double a;
    private double b;
    
   
    public Rectangle (double a, double b){
        this.a = a;
        this.b = b;
        
    }
    @Override
    public double calculatePerimeter(){
        return 2*(a+b);
    }
}
