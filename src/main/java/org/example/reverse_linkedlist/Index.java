package org.example.reverse_linkedlist;

public class Index {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        list.print();

        list.reverse(4);

        System.out.println();
        list.print();
    }
}

class LinkedList<T> {

    Node<T> head;

    void print() {
        printNow(this.head);
    }

    private void printNow(Node<T> node) {

        if (node != null) {
            System.out.print(node);
            printNow(node.next);
        }
    }

    void add(T data) {

        Node<T> newNode = new Node<>(data);

        if (this.head == null) {
            this.head = newNode;
            return;
        }

        addNow(this.head, newNode);
    }

    private void addNow(Node<T> node, Node<T> newNode) {

        if (node.next == null) {
            node.next = newNode;
            return;
        }

        addNow(node.next, newNode);
    }

    public void reverse(int size) {

        if (this.head == null) {
            return;
        }

        this.head = reverseBatch(this.head, null, size);
    }

    private Node<T> reverseBatch(Node<T> first, Node<T> prev, int batchSize) {

        if (first == null) {
            return null;
        }

        Node<T> current = first;
        Node<T> next = current;
        int counter = 1;

        while (next != null) {

            next = current.next;

            current.next = prev;

            prev = current;
            current = next;

            if (counter % batchSize == 0) {
                first.next = reverseBatch(current, first, batchSize);
                break;
            }

            counter++;
        }

        if (counter % batchSize != 0) {
            first.next = null;
        }

        return prev;
    }
}

class Node<T> {

    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return this.data + ", ";
    }
}