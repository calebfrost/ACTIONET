package actionet;

import java.util.*;

public class HashDemo {

    public static void main(String[] args) {

        //using a hash map lets you avoid the problem of duplicates in the first place
        Map m1 = new HashMap();
        m1.put("One", 1);
        m1.put("Two", 2);
        m1.put("Three", 3);
        m1.put("Four", 4);
        m1.put("Five", 5);

        //calculate size
        int m1Size = m1.size();
        System.out.print("Key/Value pairs:" + m1 + "Size " + m1Size);


    }
}
