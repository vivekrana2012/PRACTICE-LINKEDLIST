package org.example.simple;

import org.example.Node;

public class Index {

    public static void main(String[] args) {

        BasicStructure structure = new Queue();

        System.out.println("pop - " + structure.pop());

        structure.push(new Node("a"));
        structure.push(new Node("b"));
        structure.push(new Node("c"));
        structure.push(new Node("d"));

        System.out.println("pop - " + structure.pop());
        System.out.println("pop - " + structure.pop());
        System.out.println("pop - " + structure.pop());
        System.out.println("pop - " + structure.pop());

    }
}
