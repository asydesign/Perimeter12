/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author fmi
 */
public class Triangle extends Figure{
    private double a;
    private double b;
    private double c;
   
    public Triangle (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double calculatePerimeter(){
        return a+b+c;
    }
}
