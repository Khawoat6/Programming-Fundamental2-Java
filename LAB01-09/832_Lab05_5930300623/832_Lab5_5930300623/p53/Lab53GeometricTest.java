import java.util.ArrayList;
public class Lab53GeometricTest
{
  public static void main(String[] args)
  {
    Circle obj = new Circle();
    Rectangle obj = new Rectangle();
    double area = 0.0;
    GeometricObject[] obj = {new Circle(5),new Rectangle(2,4)};
    for(GeometricObject obj : objs )
    {
      area += obj.getArea();
    }
   System.out.println("Total area = "+area);
  }
}
