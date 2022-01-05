package org.example;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Node implements Comparable<Node> {

    private String data;
    private Node next;
    private Node previous;
    private boolean isCircularHead;

    public Node(String data) {
        this.data = data;
    }

    public boolean hasNext() {
        return this.next != null;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setCircularHead(boolean circularHead) {
        this.isCircularHead = circularHead;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(data, node.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public int compareTo(Node o) {
        if (o == null || o.getData() == null) {
            return 1;
        }

        if (this.getData() == null) {
            return -1;
        }

        return this.getData().compareTo(o.getData());
    }

    @Override
    public String toString() {
        return "Node{" + "data='" + data + '\'' + '}';
    }
}
