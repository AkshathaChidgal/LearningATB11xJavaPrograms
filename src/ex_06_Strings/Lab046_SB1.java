package ex_06_Strings;

public class Lab046_SB1 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Aksahtha");
        System.out.println(s1.reverse());
        System.out.println(s1.reverse());  //Does modification to the same string s1 -so its mutable
        System.out.println(s1.append(" Chidgal"));

        StringBuffer s5=new StringBuffer("Akshatha");
        s5.append(" Chidgal");
        System.out.println("s5 : "+s5);  //mutable
        s5.append( 12345); //can appened the numbers
        System.out.println(s5);




        String s2="Akshatha";
        String s4=" Chidgal";
        String s3=s2+s4; //Creating a new string s3 for concatination -so its immuatble
        System.out.println(s3);

        StringBuffer sb=new StringBuffer("Java Programming");
        sb.replace(0,4,"Python "); //replacing substring
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.delete(15,19));//deleteing the substring


    }
}
