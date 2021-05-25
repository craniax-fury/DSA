package Tree.GenericTree.services.removeLeaves;

import Tree.GenericTree.Model.Node;

import java.util.Collections;
import java.util.Iterator;

public abstract class AbstractRemoveLeaves<T>{
    public void removeLeaves(Node<T> node) {
        for(int i=node.getChildren().size()-1; i>=0;i--){
            Node<T> child = node.getChildren().get(i);
            if(child.getChildren().size()==0)
                node.getChildren().remove(child);
        }
        for (Node<T> childNode:node.getChildren()){
            removeLeaves(childNode);
        }
    }
}

