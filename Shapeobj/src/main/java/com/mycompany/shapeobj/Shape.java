
package com.mycompany.shapeobj;

abstract class Shape
{
    protected float Area;
     public abstract float CalculateArea();
      public void display(){
          System.out.println("Area is"+Area);
    
}
}