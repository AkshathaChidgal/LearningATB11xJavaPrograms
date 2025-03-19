package ex_01_Java_Basics.ex_02_Switch;
// works in java >13
//Java 14 introduced an enhanced switch expression for more concise syntax.
public class Lab018_Switch2 {
    public static void main(String[] args) {
        int day = 4;

        String result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            default -> "Invalid day";
        };

        System.out.println(result);
    }
}
//Uses arrow (->) instead of case: and break;.
//Assigns the result directly to a variable.