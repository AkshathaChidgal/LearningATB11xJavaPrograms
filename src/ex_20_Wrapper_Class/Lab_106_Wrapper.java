package ex_20_Wrapper_Class;

public class Lab_106_Wrapper {
    public static void main(String[] args) {

        Mobile iphone=new Mobile("Iphone",1,45789.00);
        Mobile sumsung=new Mobile("Sumsung",2, 500.6);
        iphone.calling();
        iphone.changePrice(456);
        iphone.changePrice(456.7);
    }
}
class Mobile
{
    private String name;
    private Integer phone;
    private Double price;
    static String mobile_carrie="airtel";

    Mobile()
    {
        System.out.println("Default constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    Mobile(String name, Integer phone, Double price)
    {
        this.name=name;
        this.phone=phone;
        this.price=price;
    }
    void display()
    {
        System.out.println(this.name+this.phone+this.price);
    }
    static  void switchOnAirplaneMode()
    {
        System.out.println("Common Airplane Mode");
    }
    void changePrice(Integer price)
    {
        System.out.println("Change price in interger");
    }
    void changePrice(Double price)
    {
        System.out.println("Change price in double");
    }
    void calling()
    {
        System.out.println("dialpad-> Touch Dial pad");
    }
}

interface  simCard
{
    void enterCard();

    void calling();
}

class oldMobile implements simCard
{
    public void enterCard()
    {
        System.out.println("insert the card");
    }
    @Override
    public void calling()
    {
        System.out.println("dialpad");
    }
}