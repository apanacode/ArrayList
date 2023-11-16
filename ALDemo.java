package ArrayList;

import java.util.*;

public class ALDemo {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>(); // syntax for ArrayList

        al.add("rethu"); // adding elements into the list
        al.add("kerana");
        al.add(1, "faraza"); // adding elements into the list through index

        System.out.println(al); // output

        for (String s : al) // printing the elements not like array
        {
            System.out.println(s + " ");
        }

        System.out.println("size of the arraylist:" + al.size());

        String[] s = new String[] { "lahari", "rathu", "kethu" };

        al.addAll(Arrays.asList(s)); // adding elements from arr to object type

        System.out.println(al);

        System.out.println(al.get(3)); // retreival of elements from the list

        System.out.println(al.contains("rethu")); // verification of elements in the list return boolean values
        System.out.println(al.containsAll(Arrays.asList(s)));

        al.set(4, "saraaliakhan"); // updation of elements in the list
        System.out.println(al);

        al.remove(al.remove("saraaliakhan")); // deletion of elements from the list

        System.out.println(al);

    }

}
