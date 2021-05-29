package Tree.GenericTree.services.maxOfTree;

import Tree.GenericTree.Model.Node;

public abstract class AbstractTreeMax<T> {
    int max = Integer.MIN_VALUE;

    public int max(Node<Integer> node){
        for (Node<Integer> child:node.getChildren()) {

            max = Math.max(max,max(child));
        }
        return Math.max(max,node.getData());
    }
}
