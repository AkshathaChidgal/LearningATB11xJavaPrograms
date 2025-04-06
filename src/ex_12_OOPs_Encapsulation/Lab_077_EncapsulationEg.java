package ex_12_OOPs_Encapsulation;

public class Lab_077_EncapsulationEg {
    public static void main(String[] args) {
        VMOLogin vwoLogin = new VMOLogin("admin", "pass123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "345";
        System.out.println(vwoLogin.password);


        GoodVMOLogin vwoLogin1 = new GoodVMOLogin("admin", "pwd123");
    //    System.out.println(vwoLogin1.password);
      //  System.out.println(vwoLogin1.username);

        vwoLogin1.setUsername("Jack");
        System.out.println(vwoLogin1.getUsername());

        System.out.println(vwoLogin1.getPassword());

        vwoLogin1.setPassword("12345",false);
        System.out.println(vwoLogin1.getPassword());

    }
}

class VMOLogin
{
    public String username;
    public String password;

    VMOLogin(String usr, String pwd)
    {
        this.username=usr;
        this.password=pwd;
    }
}
class GoodVMOLogin {
    private String username;
    private String password;


    public GoodVMOLogin(String usr, String pwd) {
        this.password = pwd;
        this.username = usr;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        }
        else
        {
            System.out.println("Not allowed to change the password!");
        }

    }
}
