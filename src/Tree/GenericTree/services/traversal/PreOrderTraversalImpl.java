package Tree.GenericTree.services.traversal;

import Tree.GenericTree.Model.Node;

public class PreOrderTraversalImpl<T>  implements TreeTraversal<T>{

    @Override
        public void traverse(Node<T> root) {
        System.out.print(root.getData()+"->");
            for (Node<T> child:root.getChildren()){
                 traverse(child);
            }


        }
    }