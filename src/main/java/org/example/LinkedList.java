package org.example;

import lombok.Getter;

@Getter
public class LinkedList {

    private Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    void print(Order order) {
        if (Order.STRAIGHT == order) printNow(this.head);
        else printReverse(this.head);
    }

    int count() {
        return countNow(this.head);
    }

    boolean isPresent(String data) {
        return isPresent(this.head, data);
    }

    private boolean isPresent(Node node, String data) {

        if (data.equals(node.getData())) {
            return true;
        }

        if (node.hasNext()) {
            return isPresent(node.getNext(), data);
        } else {
            return false;
        }
    }

    private int countNow(Node node) {

        if (node.hasNext()) {
            return 1 + countNow(node.getNext());
        } else {
            return 1;
        }
    }

    private void printNow(Node node) {
        System.out.print(node.getData() + ", ");

        if (node.hasNext()) {
            printNow(node.getNext());
        }
    }

    private void printReverse(Node node) {

        if (node.hasNext()) {
            printReverse(node.getNext());
        }

        System.out.print(node.getData() + ", ");
    }
}
