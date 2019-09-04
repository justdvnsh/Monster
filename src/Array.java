import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Array {

    // main function
    public static void main(String[] args){

        // ArrayLists are list of objects , that is basically they are arrays , but with dynamic
        // sizes. We do not need to explicitly define the sizes.
        ArrayList arr = new ArrayList();

        // we can either define the data type for the array list , or we dont
        ArrayList<String> arrString = new ArrayList<String>();

        // to add values in ArrayList
        arrString.add("Something Just like this.");
        arrString.add("Sucker For Pain.");

        // add values to the arr array. Here we added random values, with all different data types.
        arr.add(1);
        arr.add("Name");
        arr.add(2.145);

        System.out.println(arrString);
        System.out.println(arr);

        // To add values at a specific index of the array , we can use the add method.
        arr.add(2, "Name is something to define.");
        System.out.println(arr);

        // we can also change the value of an element at a particular position
        arr.set(1, "Name Name Name");
        System.out.println(arr);

        // we can get a particular value.
        System.out.println(arrString.get(1));

        // we can use the arr.remove(2) or arr.removeRange(0,2) function, to remove a single value
        // or range value . In range the upper bound is included.
        // We can use the normal enhanced for loops for the arrayList.

        for ( String name: arrString ) {

            // looping
            System.out.println(name);
        }

        // or using the Iterator Class , which was used before the enhanced for loop.
        Iterator iter = arrString.iterator();

        while ( iter.hasNext() ) {

            // iterating .
            System.out.println("Iterator class :- " + iter.next());
        }

        // to copy array
        ArrayList copiedArr = new ArrayList();

        // addAll copies the array
        copiedArr.addAll(arrString);

        if ( copiedArr.contains("Sucker For Pain.") ) {
            System.out.println(copiedArr);
        }

        // also we have the containsAll function which checks if all the elements are in the array.
        if ( copiedArr.containsAll(arrString) ) {
            System.out.println(copiedArr);
            System.out.println(arrString);
        }


    }
}
