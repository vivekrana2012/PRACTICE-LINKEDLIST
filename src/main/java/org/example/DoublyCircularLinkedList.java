package org.example;

public class DoublyCircularLinkedList implements LinkedList {

    private Node head;

    public DoublyCircularLinkedList(Node head) {
        this.head = head;
        this.head.setNext(head);
        this.head.setPrevious(head);
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

            updateLastNode(node);

            node.setNext(this.head);
            node.setPrevious(this.head.getPrevious());

            this.head.setPrevious(node);
            this.head.setCircularHead(false);

            this.head = node;
            this.head.setCircularHead(true);
        } else {
            new AddTask(node).execute(this.head);
        }
    }

    private void updateLastNode(Node newNode) {
        this.head.getPrevious().setNext(newNode);
    }

    @Override
    public Node remove(Node node) {

        if (this.head.equals(node)) {
            updateLastNode(this.head.getNext());

            this.head.getNext().setPrevious(this.head.getPrevious());
            this.head = this.head.getNext();
            this.head.setCircularHead(true);

            return node;
        } else {
            return new RemoveTask(node).execute(this.head);
        }
    }
}
