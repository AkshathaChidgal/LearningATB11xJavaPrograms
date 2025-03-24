package ex_06_Strings;

public class Lab042_StringInterviewQ2 {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s4 = "Hello"; // SCP -> 1

        String s2 = new String("Hello"); // OA
        String s3 = new String("Hello");
        String s5 = new String("hello"); //  OA = 3

        // == -> Comparsion -> String -> this check the locations ref.
        System.out.println(s1 == s3); //false
        System.out.println(s1 == s2); //false
        System.out.println(s2 == s3); //true

        System.out.println(s1 == s4); //false
        System.out.println(s3 == s5); //true

        // equals ( content) -> value

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3));//true
        System.out.println(s3.equals(s5)); //false
        System.out.println(s3.equalsIgnoreCase(s5)); //true

        //  equalsIgnoreCase -> pramod. Pramod, PRAMOD , PraMod . PramoD -> pramod
        //  == - check for the ref
        // = assignment the value

    }
}
