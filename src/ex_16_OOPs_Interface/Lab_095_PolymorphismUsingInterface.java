package ex_16_OOPs_Interface;
//✅ Exercise 8: Polymorphism Using Interface
//Task:
//Create an interface Shape with a method draw().
//Create classes Circle, Square, and Triangle that implement Shape.
//In the main() method, use an array of Shape references to call draw() on different shapes
public class Lab_095_PolymorphismUsingInterface {
    public static void main(String[] args) {
        Shape s[]={new Circle(),new Square(),new Triangle()};
        for (Shape i:s)
            i.draw();

    }

}
interface Shape
{
     void draw();// Abstract method (no default here for flexibility)

}
class Circle implements Shape
{
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
class Square implements Shape
{
    public void draw()
    {
        System.out.println("Drawing a square");
    }
}class Triangle implements Shape
{

    public void draw()
    {
        System.out.println("Drawing a trinagle");
    }
}