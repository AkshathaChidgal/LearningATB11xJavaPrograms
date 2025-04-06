package ex_00_JavaTask;

class ATBStudents{
    private String name="Akshatha"; //when variables are private it will be accessible only within the class, only way to access is with the respective methods
    private int age=20;


    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }

    public String setName(String name)
    {
        this.name=name;
        return name;
    }
    public int setAge(int age)
    {
        this.age=age;
        return age;
    }
}
public class Task_14_Encapsulation {
    public static void main(String[] args) {
        ATBStudents obj=new ATBStudents();
       // System.out.println(obj.name);
        //System.out.println(obj.age);

        obj.setAge(50);
        obj.setName("Ram");
        System.out.println(obj.getName()+" : "+obj.getAge()); //able to access variables using respective methods

        System.out.println(obj.getName()+" : "+obj.setAge(30));
        System.out.println(obj.setName("James")+" : "+obj.setAge(30));




    }
}



