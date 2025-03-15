package ex_01_Java_Basics.ex_Task;

public class Task_1_Increment {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++); //34
        System.out.println(a); //13

        //Line num |ExpA |ExpB | Exp C
        //6 | ExpA -> 11 , a=11
            //ExpB ->11 , a=12
            //ExpC ->12 , a=13
        //11+11+12
        //(++a + a++ + a++) = 11 + 11 + 12 = 34
        //7 | a=13
    }
}
