/*The super keyword in Java is a reference variable used to refer to the immediate parent class of the current object. It can be used to:

Call the parent class constructor

Access parent class methods

Access parent class variables

*/

package ex_14_OOPs_Super;

public class Lab_079_SuperCallParentConstructor {
    public static void main(String[] args) {
        Dog d= new Dog();

    }
}
class Animal
{
    Animal()
    {
        System.out.println("Animal constructor called"); // DC
    }
}
class Dog extends Animal
{
    //create DC for the child class
   Dog(){
       super(); //Calls Animal constructor
       System.out.println("Dog constructor is called");
   }

}

//call the parent class constructor from a subclass constructor.
//It must be the first statement in the subclass constructor.