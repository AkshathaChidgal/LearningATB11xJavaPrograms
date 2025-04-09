package ex_21_Exceptions;

public class Lab_108_StringNullPointer {
    public static void main(String[] args) {
        String s=null;
        s.trim();  //java.lang.NullPointerException: Cannot invoke "String.trim()" because "s" is null
    }
}
