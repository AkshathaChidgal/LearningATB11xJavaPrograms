package ex_09_Constructor;

public class Lab_063_ConstructorWA {

    public static void main(String[] args) {
        WebAutomation w=new WebAutomation();
    }

}
class WebAutomation
{
    WebAutomation()//dedult constuctor is created automatically when object is created
    {
        System.out.println("I want to read csv file!");
        System.out.println("open the page before loading the script");
        System.out.println("you can do anything you wanted to do when object is created");
    }
}
