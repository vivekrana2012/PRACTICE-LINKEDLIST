package org.example;

public class SortedTask implements LinkedListTask<Boolean> {

    @Override
    public Boolean execute(Node node) {

        if (!node.hasNext()) {
            return true;
        }

        if (node.getNext().isCircularHead()) {
            return true;
        }

        if (node.compareTo(node.getNext()) <= 0) {
            return execute(node.getNext());
        } else {
            return false;
        }
    }
}
