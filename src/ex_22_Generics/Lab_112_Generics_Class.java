package ex_22_Generics;

public class Lab_112_Generics_Class {

    public static void main(String[] args) {
        GenericClass<Integer> intObj=new GenericClass(5);
        GenericClass<String > intObj1=new GenericClass("Akshatha");


        //T is the place holder only , it can be any datatype and cannot have 2 datatypes, eg, only T , cannot have T,T1,T2

    }
}
class GenericClass <T>
{
    private  T data;
    public GenericClass(T data)
    {
        this.data=data;
    }
    public T getData()
    {
        return this.data;
    }
}
