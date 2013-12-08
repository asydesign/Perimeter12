/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author fmi
 */
public class User {
    private Figure figure;
    
//    public User(Figure figure){
//        this.figure = figure;
//    }
    public User(){
    }
    
    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public Figure getFigure() {
        return figure;
    }
    
    
   
    public void displayPerimeter(){
        System.out.println(figure.calculatePerimeter());
        
    }
}
