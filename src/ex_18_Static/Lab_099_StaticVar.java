package ex_18_Static;

public class Lab_099_StaticVar {
    public static void main(String[] args) {

        D ref1=new D(10);
        ref1.displayValue();

        D.b=45;
        System.out.println(ref1.b);
    }

   static class D {
        int a;
        /// / non static -> instance variable / properties/ attribute / fields
        static int b = 20; //static variable

        D(int d) {
            this.a = a;
        }

        void displayValue() {
            System.out.println(this.a);
        }
    }
}