package Tree.GenericTree.services.maxOfTree;

import Tree.GenericTree.Model.Node;

public abstract class AbstractTreeMax<T> {
    int max = Integer.MIN_VALUE;

    public int max(Node<Integer> node){
        for (Node<Integer> child:node.getChildren()) {
            max(child);
            max = Math.max(max,child.getData());
        }
        return max;
    }
}
