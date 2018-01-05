/**
 * Created by Asus on 5/3/2560.
 */
package p53;

import javafx.scene.shape.Circle;

import java.awt.*;

public class Lab53GeomatricTest
{
    public static void main(String[] args)
    {
        double area = 0.0;
        GeometricObject[] objs = new GeometricObject{new Circle(5.0), new Rectangle(2.0, 4.0)};
        for(GeometricObject obj : objs )
        {
            area += objs.getArea();
        }
        System.out.println("Total area = "+area);
    }
}
