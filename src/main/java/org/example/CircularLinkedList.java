package org.example;

public class CircularLinkedList implements LinkedList {

    private Node head;

    public CircularLinkedList(Node head) {
        this.head = head;
        this.head.setNext(head);
        this.head.setCircularHead(true);
    }

    @Override
    public int count() {
        return new CountTask().execute(this.head.getNext()) + 1;
    }

    @Override
    public boolean isPresent(String data) {
        return this.head.getData().equals(data) || new FindTask(data).execute(this.head.getNext());
    }

    @Override
    public boolean isSorted() {

        if (this.head.compareTo(this.head.getNext()) <= 0) {
            return new SortedTask().execute(this.head.getNext());
        }

        return false;
    }

    @Override
    public void print(Order order) {

        if (Order.STRAIGHT == order) System.out.print(this.head.getData() + ", ");

        new PrintTask(order).execute(this.head.getNext());

        if (Order.REVERSE == order) System.out.print(this.head.getData() + ", ");
    }

    @Override
    public void add(Node node) {

        if (this.head.compareTo(node) > 0) {

            updateLastNode(this.head, node);

            node.setNext(this.head);
            this.head.setCircularHead(false);

            this.head = node;
            this.head.setCircularHead(true);
        } else {
            new AddTask(node).execute(this.head);
        }
    }

    private void updateLastNode(Node node, Node newNode) {

        if (node.getNext().isCircularHead()) {
            node.setNext(newNode);
        } else {
            updateLastNode(node.getNext(), newNode);
        }
    }

    @Override
    public Node remove(Node node) {

        if (this.head.equals(node)) {
            updateLastNode(this.head, this.head.getNext());

            this.head = this.head.getNext();
            this.head.setCircularHead(true);

            return node;
        } else {
            return new RemoveTask(node).execute(this.head);
        }
    }
}
