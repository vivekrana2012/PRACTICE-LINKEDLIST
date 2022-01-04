package org.example;

import lombok.Getter;

@Getter
public class Node {

    private String data;
    private Node next;

    public Node(String data) {
        this.data = data;
    }

    public boolean hasNext() {
        return this.next != null;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
