package org.example;

public class CountTask implements LinkedListTask<Integer> {

    @Override
    public Integer execute(Node node) {

        if (node.isCircularHead()) {
            return 0;
        }

        if (node.hasNext()) {
            return 1 + execute(node.getNext());
        } else {
            return 1;
        }
    }
}
