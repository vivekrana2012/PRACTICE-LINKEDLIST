package org.example;

public class Index {

    public static void main(String[] args) {

        Node node1 = new Node("a");
        Node node2 = new Node("c");
        Node node3 = new Node("e");
        Node node4 = new Node("f");
        Node node5 = new Node("h");
        Node node6 = new Node("j");

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);

        LinkedList linkedList = new LinkedList(node1);

        linkedList.print();
    }
}
