package ex_10_OOPs_3.Multilevel_inheritance;

public class Lab_070_Multilevel {
    public static void main(String[] args) {
        Grandfather gf=new Grandfather();
        System.out.println(gf.gold_grandfather);
        gf.gf_2bhk();

        Father f=new Father();
        System.out.println(f.gold_grandfather);
        System.out.println(f.gold_father);
        f.gf_2bhk();
        f.f_3bhk();

        Son s=new Son();
        System.out.println(s.gold_grandfather);
        System.out.println(s.gold_father);
        s.gf_2bhk();
        s.f_3bhk();
        s.home();


    }
}
