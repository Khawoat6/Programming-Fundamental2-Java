package p55;
public class Lab55HidingFields
{
  public static void main(String[] args) {
    A x = new B();
    //Access instance data fields i
    System.out.println("(1)     x.i is " + x.i);   //(A)
    System.out.println("(2)  (B)x.i is " + ((B)x).i); //(B)

    //Access instance data fields j
    System.out.println("(3)     x.j is " + x.j); //(C)
    System.out.println("(4)  (B)x.j is " + ((B)x).j); //(D)

    // Invoke static method m1
    System.out.println("(5)     x.m1() is " + x.m1()); //(E)
    System.out.println("(6)  (B)x.m1() is " + ((B)x).m1()); //(F)

    //Invoke instance method m2
    System.out.println("(7)     x.m2() is " + x.m2()); //(G)
    System.out.println("(8)  (B)x.m2() is " + x.m3()); //(H)

  }
}
