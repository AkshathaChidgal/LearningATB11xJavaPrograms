package ex_07_Array;

public class Lab048_ArrayCreation {
    public static void main(String[] args) {

        int[] marks2={45,60,47,77};
        String[] names={"akshatha","Chidgal"};

        //second way to create array
        int[] marks3=new int[6]; //fixed size
        int marks[]=new int[5]; // fixed size
        marks[0]=100;
        marks[1]=55;
        marks[2]=70;
        marks[3]=78;
        marks[4]=98;
        System.out.println(marks[4]);
        System.out.println(marks[2]);
        System.out.println(marks3[0]);
        System.out.println(marks3[4]);

        String[] names2=new String[2];
        names2[0]="Hello";
        names2[1]="World";
        System.out.println(names2[0]);
        System.out.println(names2[1]);
       // System.out.println(names2[-1]);//ArrayIndexOutOfBoundsException
       // System.out.println(names2[20]);//ArrayIndexOutOfBoundsException



        boolean[] is_female={true,false,true,false,false};

        boolean[] is_male=new boolean[3];
        is_male[3]=true;


    }
}
