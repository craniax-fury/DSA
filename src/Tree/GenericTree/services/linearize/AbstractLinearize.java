package Tree.GenericTree.services.linearize;

import Tree.GenericTree.Model.Node;

public abstract class AbstractLinearize<T> {
    public void linearize1(Node<T> node) {
        for (Node<T> child : node.getChildren()) {
            linearize1(child);
        }
        while (node.getChildren().size() > 1) {
            int numberOfChildren = node.getChildren().size() - 1;
            Node<T> lastChild = node.getChildren().get(numberOfChildren);
            node.getChildren().remove(lastChild);
            Node<T> secondLastChild = node.getChildren().get(numberOfChildren - 1);
            tail(secondLastChild).getChildren().add(lastChild);
        }

    }

    private Node<T> tail(Node<T> node) {
        while (node.getChildren().size() == 1) {
            node = node.getChildren().get(0);
        }
        return node;
    }


    // Above approach is working in order of n^2
    // As after we have iterated all elements for linerizing, we again iterate to get tail
    // Below is a more efficient approach , where we expect linearize method to linerarize the tree
    // as well as return the tail, this way our program would take only 0(n)

    public Node<T> linearize(Node<T> node) {

        if(node.getChildren().size()==0){
            return node;
        }

        Node<T> last_Node_tail = linearize(node.getChildren().get(node.getChildren().size() - 1));
        while (node.getChildren().size() > 1) {
            Node<T> lastNode = node.getChildren().remove(node.getChildren().size() - 1);
            Node<T> second_last_child = node.getChildren().get(node.getChildren().size() - 1);
            Node<T> second_last_tail = linearize(second_last_child);
            second_last_tail.setChildren(lastNode);
        }
        return last_Node_tail;
    }

}

