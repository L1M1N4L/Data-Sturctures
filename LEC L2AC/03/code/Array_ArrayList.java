import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class Array_ArrayList {
    public static void main(String[] args) {
        int[] arr = new int[5]; // specified the array
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println("Printing array arr: " + Arrays.toString(arr));
        System.out.println("arr index 2: " + arr[2]);

        ArrayList aL = new ArrayList();
        aL.add("a");
        aL.add("b"); // index 1
        aL.add("c");
        aL.add("d");
        aL.add("e");
        System.out.println("Printing ArrayList aL: " + aL);
        System.out.println("aL size: " + aL.size());
        aL.remove(1);
        System.out.println("After removing index 1: " + aL);
        System.out.println("get aL index 3: " + aL.get(3));

        // converting array arr to ArrayList
        List<Integer> list = new ArrayList<Integer>();

        for(Integer myNumber:arr){
            list.add(myNumber);
        }
        System.out.println("Printing List from arr: "+list);
    }
}