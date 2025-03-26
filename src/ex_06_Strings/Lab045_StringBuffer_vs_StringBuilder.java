package ex_06_Strings;

public class Lab045_StringBuffer_vs_StringBuilder {
    public static void main(String[] args) {
        String s1="Hello";
        String s2=new String("Hello");

        StringBuffer s3=new StringBuffer("Hello");

        StringBuilder s4=new StringBuilder("Hello");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        //there is no difference in the output even after creating with different types
    }
}
//- The main difference between StringBuilder and StringBuffer is that **StringBuilder is not thread-safe**, while _**StringBuffer is thread-safe.(slow)**_
//- **StringBuilder is faster** and more efficient in single-threaded environments, while **StringBuffer is safer to use in multi-threaded environments.**
