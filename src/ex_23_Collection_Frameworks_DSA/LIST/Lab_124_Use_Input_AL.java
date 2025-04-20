package ex_23_Collection_Frameworks_DSA.LIST;
import java.util.Scanner;
import java.util.ArrayList;

public class Lab_124_Use_Input_AL {
    public static void main(String[] args) {

        //Multiple inputs from the user and store them in separate
        //names, ages - store them

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String continueInput = "Y"; //Control variable for input loop
        while (continueInput.equalsIgnoreCase("Y")) {
            System.out.println("Enter the name");
            String name = scanner.next();
            names.add(name);

            System.out.println("Enter the age");
            Integer age = scanner.nextInt();
            ages.add(age);

            scanner.nextLine();
            System.out.println("do you want to enter another record? (Y/N):");
            continueInput=scanner.nextLine();

        }
        for( Object o1:names)
        {
            System.out.println(o1);
        }
        scanner.close();
    }
}

