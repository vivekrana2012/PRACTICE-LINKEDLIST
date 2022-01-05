package org.example;

public interface LinkedList {

    int count();

    boolean isPresent(String data);

    boolean isSorted();

    void print(Order order);

    void add(Node node);

    Node remove(Node node);
}
