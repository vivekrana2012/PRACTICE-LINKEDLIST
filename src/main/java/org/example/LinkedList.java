package org.example;

import lombok.Getter;

@Getter
public class LinkedList {

    private Node head;

    public LinkedList(Node head) {

        if (head == null) {
            throw new NullPointerException();
        }

        this.head = head;
    }

    void print(Order order) {
        new PrintTask(order).execute(this.head);
    }

    int count() {
        return new CountTask().execute(this.head);
    }

    boolean isPresent(String data) {
        return new FindTask(data).execute(this.head);
    }

    boolean isSorted() {
        return new SortedTask().execute(this.head);
    }

    void add(Node node) {

        if (this.head.getData().compareTo(node.getData()) > 0) {
            node.setNext(this.head);
            this.head = node;
        } else {
            new AddTask(node).execute(this.head);
        }
    }

    Node remove(Node node) {

        if (this.head.getData().equals(node.getData())) {
            node.setNext(this.head.getNext());
            this.head = this.head.getNext();
        }

        return new RemoveTask(node).execute(this.head);
    }
}
