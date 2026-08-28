import java.util.ArrayList;
import java.util.Collections;

// Arrays are fixed sized and store premitive data like int, float etc.
// ArrayLists are variables can change the size and store objects.

// functions of collection frameworks
// add = add element in arraylist
// get = get the added element
// modify = add element in between 
// delete or remove = delete or remove the element
// iterate or operation 


public class ArrayLists {
    public static void main(String[] args) {
        // Integer | String | Boolean = ara the classes for defining ArrayList
        // for integer
        ArrayList<Integer> list = new ArrayList<Integer>();
        // for string
        // ArrayList<String> list2 = new ArrayList<String>();
        // for boolean
        // ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        // add element
        list.add(0);
        list.add(2);
        list.add(3);

        // get element
        int element = list.get(1);

        // to add element in between
        list.add(1,1);

        // set element
        list.set(0,5);

        // delete element
        list.remove(3);

        // size 
        int size = list.size();

        System.out.println(list);
        System.out.println(element);
        System.out.println(size);

        // access by loop
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // sorting
        Collections.sort(list);
        System.out.println(list);

    }
}