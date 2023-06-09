
// So, if you declare the variable with public static final keywords (public static final int x = 10;), it becomes a public constant that can be accessed from other classes using the interface name. If you declare it without these keywords (int x = 10;), it is still implicitly public static final, but it is not necessary to include these keywords as they are assumed.

//Therefore, there is no practical difference between declaring the abstract method with or without the abstract keyword within an interface. Both approaches convey the same meaning.

//Therefore, it is not possible to change the value of x inside the implementing class because it is declared as a constant in the interface.

package com.mycompany.interfaceimplementedobj;

public interface MyfirstInterface 
{
    int x=10;
    void display();
}
