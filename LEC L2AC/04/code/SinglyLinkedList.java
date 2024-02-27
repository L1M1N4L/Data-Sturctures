public class SinglyLinkedList {
    class Node{
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    //Represent the head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;

    //addNode() will add a new node to the list
    public void addNode(String data) {
        //Create a new node
        Node newNode = new Node(data);

        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
    }

    public void deleteNode(String data) {
        Node current = head;

        // delete the data if the node on the head
        if(current.data == data)
        {
            head = current.next;
        }
        else
        {
            Node temp = null;

            // check the data is on the Linked List
            while(current != null && current.data != data)
            {
                temp = current;
                current = current.next;
            }

            // if the data exist
            if(current!=null)
            {
                temp.next = current.next;
            }
            else
            {
                System.out.println("Data not found");
            }
        }
    }

    //Print all the nodes
    public void printLinkedList() {
        // current node will point to head
        Node current = head;

        if(head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        System.out.print("Singly-linked list = ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SinglyLinkedList singlyLL = new SinglyLinkedList();

        //Add nodes to the list
        singlyLL.addNode("A");
        singlyLL.addNode("b");
        singlyLL.addNode("c");
        singlyLL.addNode("d");
        singlyLL.addNode("e");

        //Print the content of the Linked List
        singlyLL.printLinkedList();

        // delete A
        System.out.println("*Delete A*");
        singlyLL.deleteNode("A");
        singlyLL.printLinkedList();

        // delete d
        System.out.println("*Delete d*");
        singlyLL.deleteNode("d");
        singlyLL.printLinkedList();

        // delete E
        System.out.println("*Delete E*");
        singlyLL.deleteNode("E");
        singlyLL.printLinkedList();
    }
}