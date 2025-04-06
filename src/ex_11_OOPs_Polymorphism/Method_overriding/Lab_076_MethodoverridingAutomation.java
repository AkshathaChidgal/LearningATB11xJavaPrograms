package ex_11_OOPs_Polymorphism.Method_overriding;

public class Lab_076_MethodoverridingAutomation {
    public static void main(String[] args) {
        Chrome c=new Chrome();
        c.openbrowser();
        Firefox f= new Firefox();
        f.openbrowser();
        CommonToAll ca=new CommonToAll();
        ca.openbrowser();
    }
}
class CommonToAll
{
    void openbrowser()
    {
        System.out.println("Open the browser!");
    }
}
class Chrome extends CommonToAll
{
    @Override
    void openbrowser() {
        System.out.println("Chrome will open now");
    }
}
class Firefox extends CommonToAll
{
    void openbrowser()
    {
        System.out.println("Fire fox will open now");
    }
}

