package org.example.simple;

import org.example.Node;

public class Queue implements BasicStructure {

    private Node head;

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

    @Override
    public Node pop() {

        if (this.head == null) {
            return null;
        }

        Node node = this.head;

        if (this.head.hasNext()) {
            this.head = this.head.getNext();
        } else {
            this.head = null;
        }

        return node;
    }
}
