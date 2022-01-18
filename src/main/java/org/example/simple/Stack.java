package org.example.simple;

import org.example.Node;

public class Stack implements BasicStructure {

    private Node head;

    @Override
    public Node pop() {

        if (this.head == null) {
            return null;
        }

        if (!this.head.hasNext()) {
            Node node = this.head;
            this.head = null;

            return node;
        }

        return popNow(this.head);
    }

    private Node popNow(Node node) {

        if (node.getNext().hasNext()) {
            return popNow(node.getNext());
        } else {
            Node removedNode = node.getNext();
            node.setNext(null);

            return removedNode;
        }
    }

    @Override
    public void push(Node node) {

        if (this.head == null) {
            this.head = node;

            return;
        }

        pushNow(this.head, node);
    }

    private void pushNow(Node node, Node newNode) {

        if (node.hasNext()) {
            pushNow(node.getNext(), newNode);
        } else {
            node.setNext(newNode);
        }
    }
}
