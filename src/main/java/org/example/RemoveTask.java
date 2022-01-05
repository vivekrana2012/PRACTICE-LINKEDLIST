package org.example;

public class RemoveTask implements LinkedListTask<Node> {

    private Node removeNode;

    public RemoveTask(Node removeNode) {
        this.removeNode = removeNode;
    }

    @Override
    public Node execute(Node node) {

        if (!node.hasNext()) {
            return null;
        }

        if (node.getNext().isCircularHead()) {
            return null;
        }

        if (node.getNext().equals(removeNode)) {
            node.setNext(node.getNext().getNext());

            return removeNode;
        }

        return execute(node.getNext());
    }
}
