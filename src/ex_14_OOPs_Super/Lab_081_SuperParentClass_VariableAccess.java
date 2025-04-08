package ex_14_OOPs_Super;

class Lab_081_SuperParentClassVariableAccess {
    public static void main(String[] args) {
        Pegions p=new Pegions();
        p.printDetails();


    }
}
class Bird1
{
    String type="Dove Parent";
}
class Pegions extends Bird1
{
    String type="Pegions";
    void printDetails()
    {
        System.out.println("Parent class variable: "+super.type);
        System.out.println("Child class variable: "+this.type);
    }
}
//f the child class has a variable with the same name as the parent, super.variableName can be used to access the parent class variable.

