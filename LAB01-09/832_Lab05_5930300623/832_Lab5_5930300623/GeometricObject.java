public class GeometricObject
{
  private String color;
  private boolean filled;

  public GeometricObject()
  {
    color = "white";
    filled = false;
  }
  public String getColor()
  {
    return color;
  }
  public void setColor(String color)
  {
    color = color;
  }
  public boolean isFilled()
  {
    return false;
  }
  public void setFilled(boolean filled)
  {
    filled = filled;
  }
  public String toString()
  {
    return "Color:"+color + ",isFilled"+filled;
  }
}
