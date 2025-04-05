package ex_09_Constructor;
class Car3
{
    String name;
    int year;
    String model;
    Car3()//DC
    {
        name="Tesla";
        year=1991;
        model="Model1.2";
    }
    Car3(String model_oc_arg, String name_oc_arg, int year_oc_arg) {

        this.name = name_oc_arg;
        this.year = year_oc_arg;
        this.model = model_oc_arg;
    }
}

public class Lab_066_ParameterizedConstructor {
    public static void main(String[] args) {
        Car3 c1=new Car3("model3","CarName",2000);  //calling parameterized constructor
        System.out.println(c1.model);
        System.out.println(c1.name);
        System.out.println(c1.year);

        System.out.println("------car 2 ---------");
        Car3 c2=new Car3("model2","ABCcar",2025);
        System.out.println(c2.year);
        System.out.println(c2.name);
        System.out.println(c2.model);
        System.out.println();
        System.out.println("DC car details");
        Car3 dc=new Car3();//DC
        System.out.println(dc.year);
        System.out.println(dc.model);
        System.out.println(dc.name);







    }
}

