package org.example;

import lombok.Getter;

@Getter
public class SinglyLinkedList implements LinkedList {

    private Node head;

    public SinglyLinkedList(Node head) {

        if (head == null) {
            throw new NullPointerException();
        }

        this.head = head;
    }

    @Override
    public void print(Order order) {
        new PrintTask(order).execute(this.head);
    }

    @Override
    public int count() {
        return new CountTask().execute(this.head);
    }

    @Override
    public boolean isPresent(String data) {
        return new FindTask(data).execute(this.head);
    }

    @Override
    public boolean isSorted() {
        return new SortedTask().execute(this.head);
    }

    @Override
    public void add(Node node) {

        if (this.head.compareTo(node) > 0) {
            node.setNext(this.head);
            this.head = node;
        } else {
            new AddTask(node).execute(this.head);
        }
    }

    @Override
    public Node remove(Node node) {

        if (this.head.equals(node)) {
            node.setNext(this.head.getNext());
            this.head = this.head.getNext();

            return node;
        } else {
            return new RemoveTask(node).execute(this.head);
        }
    }
}
