package ex_05_Functions;
// User Defined Functions.
public class Lab034_UserDefinedFuncations {
    // 1.Without Parameters and Without Return Type
    // 2.Without Parameters but With Return Type
    // 3.With Parameters and Without Return Type
    // 4. With Parameters and With Return Type
    public static void main(String[] args) {
        // 1.Without Parameters and Without Return Type
        wp_wr_greet();
        // 2.Without Parameters but With Return Type
        String msg=wp_withReturn();
        System.out.println(msg);

        // 3.With Parameters and Without Return Type
        GreetwithParmeter_withoutReturn(100,20,"Akku");

        // 4. With Parameters and With Return Type
        int result=Sum(100,200);
        System.out.println(result);

    }
    // 1. Without Parameters and Without Return Type. (Declare) /Define
    static void wp_wr_greet() {
        System.out.println("Hi, How are you?");
    }
    // 2.Without Parameters but With Return Type
    static String wp_withReturn()
    {
        return "Akshatha here !How are you?";
    }
    //  3. With Parameters and Without Return Type ( 90%)
    static void GreetwithParmeter_withoutReturn(int age,int salary, String name)
    {
        System.out.println("Age is "+age+",Salary is "+salary+" ,Name is "+name);
    }

    //  4. With Parameters and With Return Type
    static int Sum(int a, int b)
    {
        return a+b;
    }

}
