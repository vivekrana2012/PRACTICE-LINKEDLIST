package org.example;

public class PrintTask implements LinkedListTask<Void> {

    private Order order;

    public PrintTask(Order order) {
        this.order = order;
    }

    @Override
    public Void execute(Node node) {
        if (Order.STRAIGHT == this.order) printNow(node);
        else printReverse(node);

        return null;
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
