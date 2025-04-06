package ex_00_JavaTask;

class ATBStudent
{
    String name;
    int id;
    String course;

    //Constructor
    ATBStudent(String name,int id,String course)
    {
        this.name=name;
        this.id=id;
        this.course=course;
    }
    // Overriding toString() method
    public String toString()
    {
        return "Name: "+name+" id: "+id+"course: "+course;
    }
}
public class Task_15_ATBStudent {
    // Creating an array of ATBStudent
    public static void main(String[] args) {
        ATBStudent students[]=new ATBStudent[3];
        students[0] = new ATBStudent("Alice", 101, "Java");
        students[1] = new ATBStudent("Bob", 102, "Python");
        students[2] = new ATBStudent("Charlie", 103, "C#");

//        Displaying students details
        for(ATBStudent stu:students)
        {
            System.out.println(stu);
        }
    }

}
