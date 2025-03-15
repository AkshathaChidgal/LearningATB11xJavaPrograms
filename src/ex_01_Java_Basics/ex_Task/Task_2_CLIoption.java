package ex_01_Java_Basics.ex_Task;

public class Task_2_CLIoption {
    public static void main(String[] args) {
//        Take a user input - Name, Age and Salary and print them in the end.
        String name=args[0];
        int age=Integer.parseInt(args[1]);
        int salary=Integer.parseInt(args[2]);

        System.out.println("age " +age);
        System.out.println("name " +name);
        System.out.println("salary "+salary);


    }
}
