package Tree.GenericTree.services.traversal;

import Tree.GenericTree.Model.Node;

import java.util.ArrayDeque;

public class LevelOrderTraversalImpl<T>  implements TreeTraversal<T>{

    @Override
        public void traverse(Node<T> root) {
        ArrayDeque<Node<T>> queue = new ArrayDeque<>();
        queue.offer(root);
        System.out.println(queue.poll().getData()+"->");
        for (Node<T> child:root.getChildren()){
            queue.offer(child);
        }
    }
}