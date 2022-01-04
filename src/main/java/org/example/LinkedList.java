package org.example;

import lombok.Getter;

@Getter
public class LinkedList {

    private Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    void print() {
        printNow(this.head);
    }

    void printNow(Node node) {
        System.out.print(node.getData() + ", ");

        if (node.hasNext()) {
            printNow(node.getNext());
        }
    }
}
