package ex_00_JavaTask;

public class Task_4_BothIncDecOperator {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--);
        System.out.println(a);
        //ExpA= 19,a=19
        //ExpB= 19 ,a=20
        //ExpC= 20 ,19
        //a=19 & Exp=19+19+20=58
    }
}
