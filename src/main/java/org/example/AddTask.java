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

            return null;
        }

        if (node.getNext().getData().compareTo(this.newNode.getData()) > 0) {
            this.newNode.setNext(node.getNext());
            node.setNext(this.newNode);
        } else {
            execute(node.getNext());
        }

        return null;
    }
}
