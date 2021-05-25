package Tree.GenericTree.services.traversal;

import Tree.GenericTree.Model.Node;

public class PostOrderTraversalImpl<T>  implements TreeTraversal<T>{

    @Override
    public void traverse(Node<T> root) {

        for (Node<T> child:root.getChildren()){

            traverse(child);
        }
        System.out.print(root.getData()+"->");

    }
}
