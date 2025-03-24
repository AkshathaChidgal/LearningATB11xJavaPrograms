package ex_06_Strings;

public class Lab043_StringFunction {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1 == str2); //true //both are in SCP
        System.out.println(str1 == str3); //false
        System.out.println(str1.equals(str3)); //true //compare the content
    }
}
