package ex_09_Constructor;



class Person
{
    String name;
    int age;
    String address;
    long phone;
    boolean isMale;


    String eat()
    {
        System.out.println(this.name+" is the name of the person");
        return "Person is eating";
    }
    String walk()
    {
        System.out.println("Person aged "+this.age+" is walking in road");
        return "Person is walking";
    }

    void doHomeWork()
    {
        System.out.println("Person "+this.name+" has done homework");
    }
    String printDetails()
    {
        System.out.println("Printing details of person "+this.name);
        System.out.println("Name is "+this.name);
        System.out.println("Age is "+this.age);
        System.out.println("Mobile number "+this.phone);
        System.out.println("Adress is "+this.address);
        System.out.println("Is the person male? "+this.isMale);
        return "Hello";
    }
    Person()//defult constructor
    {
        String name="Nancy";
        int age=35;
    }
    Person(String name_arg,int age_arg, boolean isMale,long phone_arg, String address_arg)  //this is parameterized constructor
    {
        this.name=name_arg;
        this.age=age_arg;
        this.isMale=isMale;
        this.address=address_arg;
        this.phone=phone_arg;
    }
}

public class Lab_061_ConstructorPerson {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("************* Person 1 details ******************");
        System.out.println();
        Person obj2=new Person("Akshatha", 25,false, 889943545L,"Karnataka");
        obj2.eat();
        obj2.walk();
        obj2.doHomeWork();
        obj2.printDetails();

        System.out.println();
        System.out.println("****************** Person 2 details *****************");
        System.out.println();
        Person p1=new Person("Amit",30,true,44546L,"Mumbai");
        p1.walk();
        p1.eat();
        p1.doHomeWork();
        p1.printDetails();


    }
}
/************* Person 1 details ******************

 Akshatha is the name of the person
 Person aged 25 is walking in road
 Person Akshatha has done homework
 Printing details of person Akshatha
 Name is Akshatha
 Age is 25
 Mobile number 889943545
 Adress is Karnataka
 Is the person male? false

 ****************** Person 2 details *****************

 Person aged 30 is walking in road
 Amit is the name of the person
 Person Amit has done homework
 Printing details of person Amit
 Name is Amit
 Age is 30
 Mobile number 44546
 Adress is Mumbai
 Is the person male? true

*/