package org.example;

public class FindTask implements LinkedListTask<Boolean> {

    private String data;

    public FindTask(String data) {
        this.data = data;
    }

    @Override
    public Boolean execute(Node node) {

        if (this.data.equals(node.getData())) {
            return true;
        }

        if (node.isCircularHead()) {
            return false;
        }

        if (node.hasNext()) {
            return execute(node.getNext());
        } else {
            return false;
        }
    }
}
