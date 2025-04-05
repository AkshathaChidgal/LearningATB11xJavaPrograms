package ex_10_OOPs_1Single_Inheritance;

public class Lab_069_RealScenarioTCrunning {
    public static void main(String[] args) {
        TestCase1 tc1=new TestCase1();
        TestCase2 tc2=new TestCase2();
        tc1.runningTestCase1();
        tc2.runningTestCase2();

        CommonToAll c=new CommonToAll();
        c.startBrowser();
        c.closeBrowser();
        c.readDataBasefile();
        c.readExcelfile();

    }
}
