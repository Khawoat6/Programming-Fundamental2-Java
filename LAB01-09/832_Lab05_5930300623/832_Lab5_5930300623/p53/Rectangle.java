public class Rectangle extends GeometricObject
{
  private double width;
  private double height;

  public Rectangle()
  {
    width = 0.0;
    height = 0.0;
  }
  public Rectangle(double width,double height)
  {
    this.width = width;
    this.height = height;
  }
  public double getWidth()
  {
    return width;
  }
  public void setWidth(double width)
  {
    width = width;
  }
  public double getHeight()
  {
    return height;
  }
  public void setHeight(double height)
  {
    height = height;
  }
  public double getArea()
  {
    return width*height;
  }
  public String toString()
  {
    return super.toString()+",width: "+width +",height: "+height;
  }
}
