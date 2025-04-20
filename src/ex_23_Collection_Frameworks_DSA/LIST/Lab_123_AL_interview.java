package ex_23_Collection_Frameworks_DSA.LIST;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Lab_123_AL_interview {
    public static void main(String[] args) {
        List marks=new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);

        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);

        //collection - Tnterface
        //collection - Class (it contains complete methods)

        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);

    }
}
