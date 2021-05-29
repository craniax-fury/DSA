package Tree.GenericTree.services.size;

import Tree.GenericTree.Model.Node;

public abstract class AbstractTreeSize<T> {
    static int size=0;
    public int size(Node<T> node){

        for (Node<T> child:node.getChildren()) {
            size+=1;
            size(child);
        }
        return size+1;
    }
}
