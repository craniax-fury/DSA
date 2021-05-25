package Tree.GenericTree.services.mirror;

import Tree.GenericTree.Model.Node;
import Tree.GenericTree.services.display.DisplayTree;

import java.util.Collections;

public abstract class AbstractTreeMirror<T>{
    public void getMirror(Node<T> root) {
        for (Node<T> child : root.getChildren()) {
            getMirror(child);
        }
        Collections.reverse(root.getChildren());
    }
}

