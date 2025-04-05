package ex_09_Constructor;

public class Lab_065_ConstructorCar {
    public static void main(String[] args) {
        Car c1=new Car();
        System.out.println(c1.name);
        System.out.println(c1.model);
        System.out.println(c1.year);

        System.out.println("--------------------");

        Car c2=new Car();
        System.out.println(c2.model);
        System.out.println(c2.name);
    }
}
class Car
{
    String name;
    String year;
    String model;
    Car()
    {
        name="Tesla";
        year="1991";
        model="Model1.2";
    }
}
