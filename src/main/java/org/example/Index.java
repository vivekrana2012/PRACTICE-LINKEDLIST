package org.example;

public class Index {

    public static void main(String[] args) {

        Node node1 = new Node("a");
        Node node2 = new Node("c");
        Node node3 = new Node("e");
        Node node4 = new Node("f");
        Node node5 = new Node("h");
        Node node6 = new Node("j");

        LinkedList linkedList = new LinkedList(node1);

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
        System.out.println("isPresent z :: " + linkedList.isPresent("z"));

        System.out.println("isSorted :: " + linkedList.isSorted());

        Node removedNode = linkedList.remove(node5);

        System.out.println("Removed Node :: " + removedNode.getData());

        linkedList.print(Order.STRAIGHT);

        linkedList.add(new Node("g"));
        System.out.println("");

        linkedList.print(Order.STRAIGHT);
    }
}
