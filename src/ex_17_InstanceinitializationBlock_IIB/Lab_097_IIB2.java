package ex_17_InstanceinitializationBlock_IIB;

public class Lab_097_IIB2 {
    public static void main(String[] args) {
        Demo d=new Demo();
    }
}
class Demo {
    // First Instance Initialization Block
    {
        System.out.println("First Instance Block");
    }

    // Second Instance Initialization Block
    {
        System.out.println("Second Instance Block");
    }

    public Demo() {
        System.out.println("Constructor");
    }
}

