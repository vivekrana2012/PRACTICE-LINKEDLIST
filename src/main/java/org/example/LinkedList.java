package org.example;

import lombok.Getter;

@Getter
public class LinkedList {

    private Node head;

    public LinkedList(Node head) {
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

    }
}
