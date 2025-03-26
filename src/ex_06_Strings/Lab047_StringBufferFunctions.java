package ex_06_Strings;

public class Lab047_StringBufferFunctions {
    public static void main(String[] args) {
//1.        Creating a StringBuffer
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);

//2. append(String s): Adds text at the end
        System.out.println(sb.append(" World"));

//3. insert(int index, String s): Inserts text at a given position
        System.out.println(sb.insert(5," Java"));

//4.        replace(int start, int end, String s): Replaces a substring
        System.out.println(sb.replace(6,10,"Hi"));

//5.       delete(int start, int end): Deletes a substring
        System.out.println(sb.delete(6,9));

//6.        reverse(): Reverses the string
        StringBuffer s0=new StringBuffer("Java Progarmming");
        System.out.println(s0.reverse());

//7.       capacity(): Returns the capacity of the buffer
        System.out.println(sb.capacity());

        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity()); //16  By defult capacity is 16
        System.out.println(sb1.append("Good Morning Everyone"));
        System.out.println(sb1.capacity()); //34 Capacity is extended


//8.        ensureCapacity(int minCapacity): Ensures a minimum capacity
        StringBuilder sb2 = new StringBuilder();
        System.out.println("Intial Capacity: "+sb2.capacity()); //16
        sb2.ensureCapacity(50);//Ensures capacity is at least 50
        System.out.println("New Capacity: "+sb2.capacity()); //new capacity is added if default is added

//9.        charAt(int index): Returns a character at a specified index
        System.out.println(sb.charAt(2));

//10.       setCharAt(int index, char ch): Changes a character at a position
        sb.setCharAt(1,'a');
        System.out.println(sb);

//11.        length(): Returns the length of the buffer
        System.out.println(sb.length());

//12.        substring(int start): Extracts a substring
        System.out.println(sb.substring(5));

//13.         substring(int start, int end): Extracts a substring within a range
        System.out.println(sb.substring(2,4));

//14.        toString(): Converts StringBuffer to String

        String str=sb.toString();
        System.out.println(str);

//15.        trimToSize(): Reduces capacity to fit the current content

        StringBuffer s2 = new StringBuffer(50);
        s2.append("How are you?");
        s2.trimToSize();
        System.out.println(s2.capacity()); //12

    }
}
