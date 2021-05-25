package Tree.GenericTree.services.display;

import Tree.GenericTree.Model.Node;
import Tree.GenericTree.Model.NodeWithLevel;

import java.util.Scanner;
import java.util.Stack;

public abstract class AbstractDisplayTree<T> {
    public void display(Node<T> node) {
        System.out.print(node.getData() + "->");
        for (Node<T> child : node.getChildren()) {
            System.out.print(child.getData() + " ");

        }
        System.out.println(".");
        for (Node<T> child : node.getChildren()) {
            display(child);

        }

    }

    public void displayNodeHavingLevel(NodeWithLevel<T> rootWithLevel) {
        System.out.print(rootWithLevel.getData() + "->");
        for (NodeWithLevel<T> child : rootWithLevel.getChildren()) {
            System.out.print(child.getData() + " ");

        }
        System.out.println(".");
        for (NodeWithLevel<T> child : rootWithLevel.getChildren()) {
            displayNodeHavingLevel(child);

        }
    }
}
