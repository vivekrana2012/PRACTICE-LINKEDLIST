package org.example;

public class AddTask implements LinkedListTask<Void> {

    private Node newNode;

    public AddTask(Node newNode) {
        this.newNode = newNode;
    }

    @Override
    public Void execute(Node node) {

        if (!node.hasNext()) {
            node.setNext(newNode);
            newNode.setPrevious(node);

            return null;
        }

        if (node.getNext().isCircularHead()) {
            newNode.setNext(node.getNext());
            newNode.setPrevious(node);
            node.getNext().setPrevious(newNode);

            node.setNext(newNode);

            return null;
        }

        if (node.getNext().compareTo(this.newNode) > 0) {
            this.newNode.setNext(node.getNext());
            this.newNode.setPrevious(node);

            node.getNext().setPrevious(this.newNode);
            node.setNext(this.newNode);
        } else {
            execute(node.getNext());
        }

        return null;
    }
}
