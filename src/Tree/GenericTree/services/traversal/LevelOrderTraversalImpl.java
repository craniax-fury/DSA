package Tree.GenericTree.services.traversal;

import Tree.GenericTree.Model.Node;

import java.util.ArrayDeque;

public class LevelOrderTraversalImpl<T>  implements TreeTraversal<T>{

    @Override
        public void traverse(Node<T> node) {
        ArrayDeque<Node<T>> queue = new ArrayDeque<>();
        queue.offer(node);
        while(queue.size()>0) {
            int size= queue.size();
            for(int i=0;i<size;i++) {
                node = queue.poll();
                System.out.print(node.getData() + "->");
                for (Node<T> child : node.getChildren()) {
                    queue.offer(child);
                }
            }
            System.out.println(".");
        }
    }
}