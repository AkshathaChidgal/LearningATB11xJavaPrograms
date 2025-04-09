package ex_20_Wrapper_Class;

public class Lab_102_Wrapper_primitive {
    public static void main(String[] args) {
        int a=10;
        //this is primitive, this is not object and don't have attribute or behaviour

        //we will use the wrapper classes
        //Charcter, Integer, Float, Boolean, Double,Long,Short

        Integer age=50;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(age);
        System.out.println(age.intValue());
    }
}
