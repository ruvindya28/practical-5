
package com.mycompany.shapeobj;

public class Shapeobj {

    public static void main(String[] args)
    {
      Rectangle r1=new Rectangle(5,4);
      Circle c1=new Circle(6);
      
      r1.CalculateArea();
      r1.display();
      
      c1.CalculateArea();
      c1.display();
    }
}
