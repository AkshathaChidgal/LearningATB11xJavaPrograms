package ex_05_Functions;

public class Lab031_FuncationMethod {
    public static void main(String[] args) {
    //step2- call the functions
        f1();
        ThisIsCode_to_be_executed();
        ThisIsCode_to_be_executed();
    }

    //step 1- define function
    static void f1() {
        System.out.println("This is will be execute");
    }

    static void ThisIsCode_to_be_executed(){


        {
            System.out.println("Execute1");
            System.out.println("Execute2");
            System.out.println("Execute3");
        }
    }
}
