package org.example;

public class LinkedListFactory {

    LinkedList supply(LinkedListType type, Node node) {

        if (type == LinkedListType.SINGLY) return new SinglyLinkedList(node);
        if (type == LinkedListType.CIRCULAR) return new CircularLinkedList(node);
        if (type == LinkedListType.DOUBLY) return new DoublyLinkedList(node);
        if (type == LinkedListType.DOUBLY_CIRCULAR) return new DoublyCircularLinkedList(node);

        return null;
    }
}
