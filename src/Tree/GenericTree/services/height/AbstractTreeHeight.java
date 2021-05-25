package Tree.GenericTree.services.height;

import Tree.GenericTree.Model.Node;

public abstract class AbstractTreeHeight<T> {
    public int height(Node<T> node){
        int height=-1;
        for (Node<T> child:node.getChildren()) {
            height=Math.max(height(child),height);
        }
        return height+1;
    }
}
