package ex_06_Strings;

public class Lab040_StringFunction {
    public static void main(String[] args) {
        char c='A'; //character
        System.out.println(c);

        String s1="ABC";
        s1=s1.concat("D");
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());

    }
}
