package ex_06_Strings;

public class Lab041_StringInterviewQ1{

    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";
        String s3="Hello";  // 3 Hello is created in SCP

        String s4=new String("Hello");
        String s5=new String("Hello");
        String s6=new String("Hello"); // only 1 Hello is created and its assigned to 3 variables
    }
}
