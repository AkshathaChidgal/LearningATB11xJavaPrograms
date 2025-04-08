package ex_15_OOPs_Abstraction;

public class Lab_085_AbstractionCar {
    public static void main(String[] args) {
        WagonR w=new WagonR();
        w.Drive();


    }

}
abstract class Engine{
    abstract void startEngine();
    abstract void stopEngine();
    void concretefunction()
    {
        System.out.println("Normal Funcation");
    }
}
class WagonR extends Engine //Complete class-means no abstract class
{
    @Override
    void startEngine()
    {
        System.out.println("Start Engine");
    }
    @Override
    void stopEngine()
    {
        System.out.println("Stop Engine");
    }
    void Drive()
    {
        System.out.println("Driving car");
        startEngine();
        stopEngine();
    }
}
