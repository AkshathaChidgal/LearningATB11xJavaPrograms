package ex_19_ENUM;

public class Lab_101_enum1 {
    public static void main(String[] args) {
        System.out.println(Day.SUNDAY);
        System.out.println(Day.valueOf("TUESDAY"));
        System.out.println(Day.MONDAY);
        Day day = Day.WEDNESDAY;
        System.out.println(day.ordinal()); //returns position starting from 2

        Day d=Day.valueOf("SATURDAY");//convert string to enum constant
        System.out.println(d);


        System.out.println(Project_URLs.chrome);
        System.out.println(Project_URLs.katalon);
    }
}
//class A{
//    String[] days = {"Mon","Tue", "Wed", "Thurs","Fri","Sat","Sun"};
//}

enum Day{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}

enum Project_URLs{
    google,chrome,restassured,katalon
}