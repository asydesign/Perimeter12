/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author fmi
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figure triangle1 = new Triangle(2,3,4);
        Figure circle1 = new Circle(7.2);
       
        User stoyan = new User();
        
            stoyan.setFigure(triangle1);
            stoyan.displayPerimeter();
            
            stoyan.setFigure(circle1);
            stoyan.displayPerimeter();
        
        Figure triangle2 = new Triangle(6,5,4);
        Figure rectangle1 = new Rectangle(6,8);
        User ivan = new User();
        
            ivan.setFigure(triangle2);
            ivan.displayPerimeter();
            
            ivan.setFigure(rectangle1);
            ivan.displayPerimeter();
            
    }
}
