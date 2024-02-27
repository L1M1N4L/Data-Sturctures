public class SimpleListNode {
    Node head;
    static class Node {
        String data;
        Node next;
        //constructor
        Node(String newData) {
            data = newData;
            next = null;
        }
    }
    public static void main(String[] args) {
        SimpleListNode list = new SimpleListNode(); //empty Linked List
        //inserting 4 nodes with data
        Node tom = new Node("Tom");
        Node dick = new Node("Dick");
        Node harry = new Node("Harry");
        Node sam = new Node("Sam");

        list.head = tom;

        tom.next = dick; //Linked first node to the second node
        dick.next = harry; //Linked second node to the third node
        harry.next = sam; //Linked second node to the third node

        System.out.println(tom.data);
        System.out.println(tom.next.data);
        System.out.println(tom.next.next.data);
        System.out.println(tom.next.next.next.data);

        System.out.println("\nOther way to print by using head:");
        System.out.println(list.head.data);
        System.out.println(list.head.next.data);
        System.out.println(list.head.next.next.data);
        System.out.println(list.head.next.next.next.data);

        /*
        Exercise
        a. Insert "Bill" before "Tom"
        */
        System.out.println("\nExercise a:");
        Node bill = new Node("Bill");
        bill.next=tom;
        list.head = bill;
        System.out.println(list.head.data);
        System.out.println(list.head.next.data);
        System.out.println(list.head.next.next.data);
        System.out.println(list.head.next.next.next.data);
        System.out.println(list.head.next.next.next.next.data);

        /*
        Exercise
        b. Insert "Sue" before "Sam"
        */
        System.out.println("\nExercise b:");
        Node sue = new Node("Sue");
        harry.next=sue;
        sue.next = sam;
        System.out.println(list.head.data);
        System.out.println(list.head.next.data);
        System.out.println(list.head.next.next.data);
        System.out.println(list.head.next.next.next.data);
        System.out.println(list.head.next.next.next.next.data);
        System.out.println(list.head.next.next.next.next.next.data);

        /*
        Exercise
        c. Remove "Bill"
        */
        System.out.println("\nExercise c:");
        list.head = tom;
        System.out.println(list.head.data);
        System.out.println(list.head.next.data);
        System.out.println(list.head.next.next.data);
        System.out.println(list.head.next.next.next.data);
        System.out.println(list.head.next.next.next.next.data);

        /*
        Exercise
        d. Remove "Sam"
        */
        System.out.println("\nExercise d:");
        sue.next = null;
        System.out.println(list.head.data);
        System.out.println(list.head.next.data);
        System.out.println(list.head.next.next.data);
        System.out.println(list.head.next.next.next.data);

        /*
        Exercise
        d. Remove "Harry"
        */
        System.out.println("\nExercise e:");
        dick.next = sue;
        System.out.println(list.head.data);
        System.out.println(list.head.next.data);
        System.out.println(list.head.next.next.data);
    }
}
