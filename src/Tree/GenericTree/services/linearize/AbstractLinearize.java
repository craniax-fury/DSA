package Tree.GenericTree.services.linearize;

import Tree.GenericTree.Model.Node;

public abstract class AbstractLinearize<T>{
    public void linearize(Node<T> node) {
        for(Node<T> child:node.getChildren()){
            linearize(child);
        }
        while(node.getChildren().size()>1){
            int numberOfChildren = node.getChildren().size()-1;
            Node<T> lastChild =node.getChildren().get(numberOfChildren);
            node.getChildren().remove(lastChild);
            Node<T> secondLastChild = node.getChildren().get(numberOfChildren-1);
            tail(secondLastChild).getChildren().add(lastChild);
        }

    }

    private Node<T> tail(Node<T> node) {
        while (node.getChildren().size()==1){
            node=node.getChildren().get(0);
        }
        return node;
    }

}

