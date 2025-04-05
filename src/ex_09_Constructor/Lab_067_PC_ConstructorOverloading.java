package ex_09_Constructor;


class Person5{

    String pname;//instance variable/attribute/data variable
    String gender;
    String citizenship;

    Person5()//DC
    {

    }

    Person5(String pname_arg,String gender_arg,String citizenship_arg)
    {
        this.pname=pname_arg;
        this.citizenship=citizenship_arg;
        this.gender=gender_arg;
    }
    Person5(String pname,String citizenship)
    {
        this.pname=pname;
        this.citizenship=citizenship;
    }
    void study()
    {
        System.out.println(this.pname+" is studying");
    }

}
public class Lab_067_PC_ConstructorOverloading {
    public static void main(String[] args) {
        Person5 p1=new Person5();
        p1.pname="Akshatha";
        System.out.println(p1.pname);

        Person5 p2=new Person5("Amit","male","Indian");
        System.out.println("Name is "+p2.pname+", gender is "+p2.gender+" ,citizenship is "+p2.citizenship);

        Person5 p3=new Person5("Jack","American");
        System.out.println(p3.pname+" "+p3.citizenship);

        p1.study();
        p2.study();
        p3.study();

    }
}
