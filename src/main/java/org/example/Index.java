package org.example;

public class Index {

    public static void main(String[] args) {

        Node node1 = new Node("c");
        Node node2 = new Node("e");
        Node node3 = new Node("f");
        Node node4 = new Node("h");
        Node node5 = new Node("j");
        Node node6 = new Node("l");

        LinkedList linkedList = new LinkedListFactory().supply(LinkedListType.DOUBLY, node1);

        linkedList.add(node2);
        linkedList.add(node3);
        linkedList.add(node4);
        linkedList.add(node5);
        linkedList.add(node6);

        linkedList.print(Order.STRAIGHT);
        System.out.println("");
        linkedList.print(Order.REVERSE);

        System.out.println("\nItem Count :: " + linkedList.count());

        System.out.println("isPresent h :: " + linkedList.isPresent("h"));
        System.out.println("isPresent a :: " + linkedList.isPresent("a"));

        System.out.println("isSorted :: " + linkedList.isSorted());

        Node removedNode = linkedList.remove(node5);

        System.out.println("Removed Node :: " + removedNode);

        linkedList.print(Order.STRAIGHT);

        Node removedNode2 = linkedList.remove(node1);

        System.out.println("");
        System.out.println("Removed Node :: " + removedNode2);

        linkedList.print(Order.STRAIGHT);

        linkedList.add(node1);
        System.out.println("");

        linkedList.print(Order.STRAIGHT);
    }
}
