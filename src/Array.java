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

        System.out.println(arrString);
    }
}
