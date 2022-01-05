package org.example;

public class LinkedListFactory {

    LinkedList supply(LinkedListType type, Node node) {

        if (type == LinkedListType.SINGLY) return new SinglyLinkedList(node);
        if (type == LinkedListType.CIRCULAR) return new CircularLinkedList(node);

        return null;
    }
}
