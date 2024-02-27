import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
public class LinkedListAPI {
    public static void main(String[] args) {
        LinkedList<String> LL = new LinkedList<String>();
        LL.add("A");
        LL.add("b");
        LL.add("c");
        LL.add("d");
        LL.add("e");
        System.out.println(LL);

        // print by using for loop
        System.out.println("*Print linked list using for = ");
        for(String s: LL)
        {
            System.out.println(s + " ");
        }

        // add at a particular position
        System.out.println("* Add at index 2 =");
        LL.add(2, "Hello World");
        System.out.println(LL);

        // delete
        System.out.println("* Delete b = ");
        LL.remove("b");
        System.out.println(LL);

        // Use the iterator to print the 3rd data
        Iterator<String> it = LL.iterator();
        it.next();
        it.next();
        System.out.println("* Print 3rd data using iterator = " + it.next());

        // Print all data in Linked List by using iterator
        System.out.println("* Print Linked List by using iterator = ");
        Iterator<String> itPrint = LL.iterator();
        while(itPrint.hasNext())  // traversing elements
        {
            System.out.print(itPrint.next() + " ");
        }

        System.out.println("");

        // Print all data in Linked List by using ListIterator
        System.out.println("* Print Linked List by using ListIterator = ");
        ListIterator<String> lit = LL.listIterator();
        while(lit.hasNext())  // traversing elements
        {
            System.out.print(lit.next() + " ");
        }

        System.out.println("");

        System.out.println("* Print backward = ");
        while(lit.hasPrevious()) // traversing elements backward
        {
            System.out.print(lit.previous() + " ");
        }
    }
}