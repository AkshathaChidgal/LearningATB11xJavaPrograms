package ex_20_Wrapper_Class;

public class Lab_104_WrapperConversion {
    public static void main(String[] args) {
        int a=10;
        Integer b=a; //This is Boxing-> automatically JVM will store the value
        //Primitive to wrapper class-> Autoboxing
        System.out.println(b.intValue());//behaviour
        System.out.println(Integer.MIN_VALUE); //behaviour

        Integer a2 = 42;
        int v = a2; // Unboxing -> wrapper is removed, attribute, behaviour is lost.
        System.out.println(v);

    }
}
