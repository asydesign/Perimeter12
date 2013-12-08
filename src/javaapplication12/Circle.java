/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author fmi
 */
public class Circle extends Figure{
    private double r;
   
    public Circle (double r){
        this.r = r;
        
    }
    @Override
    public double calculatePerimeter(){
        return 2*Math.PI*r;
    }
    
}
