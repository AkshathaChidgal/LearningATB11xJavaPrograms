package ex_10_OOPs_5.Hierarchical_inheritance;

public class Lab_072_Hierarchical_inheritance {
    public static void main(String[] args) {
        Father f1 = new Father();
        Sister r1 = new Sister();

        r1.home();
        f1.home();

        YoungerBrother p1 = new YoungerBrother();
        p1.home();

        Elderbrother l1 = new Elderbrother();
        l1.l2();
        l1.home();


    }


}

class Father{
    void home(){
        System.out.println("3BHK");
    }
}

class YoungerBrother extends Father{
    void h2(){
        System.out.println("h2 - Pramod");
    }
}

class Elderbrother extends Father{

    void l2(){
        System.out.println("Lucky");
    }
}

class Sister extends Father {
    void r1(){
        System.out.println("ruhani");
    }
}
