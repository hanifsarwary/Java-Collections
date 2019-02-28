import java.util.ArrayList;
import java.util.List;

public class ListArrayClass {
    public void Exec(){

        /* ........... Normal Array............. */
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(arr[0]);

        /*............ArrayList..............*/
        // Create an arrayList with initial capacity 2
        List<Integer> arrL = new ArrayList<Integer>(2);

        // Add elements to ArrayList
        arrL.add(1);
        arrL.add(2);

        // Access elements of ArrayList
        System.out.println(arrL.get(0));
    }
}
