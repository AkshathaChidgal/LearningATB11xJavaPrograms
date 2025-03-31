package ex_08_OOP;

public class Lab_060_Ex1 {
    public static void main(String[] args) {

        Person p1=new Person();
        p1.greet();

        Person message=new Person();
        message.welcome();

       Person sing=new Person();
       sing.singing("Akshatha");


       Person name=new Person();
       String resultname=name.fullname("Akshatha"," Chidgal");
        System.out.println(resultname);







    }
}
 class Person {
    int age;
    float salary;
    String firstname = "Aksahtha";
    String lastname;
    float height;
    float weight;
    int phonenumber;
    int national_id;
    int employee_id;
    int occupation;
    int walkingspeed;

    // 1.Without Parameters and Without Return Type
    void greet() {
        System.out.println("Person is greeting");
    }



    // 2.Without Parameters but With Return Type
    String welcome() {
        return "Hello, welcome to you all";
    }


    //3. With Parameters and Without Return Type
    void singing(String firstname) {
        System.out.println(firstname + " sings very well");

    }


    // 4. With Parameters and With Return Type
      String fullname(String firstname, String lastname)
      {
          String fullname=firstname+lastname;
          return fullname;


      }


    }


