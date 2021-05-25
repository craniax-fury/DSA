
package Tree.GenericTree.services.traversal;

import Tree.GenericTree.Model.Node;

import java.util.ArrayDeque;

public class LevelOrderZigZagTraversalImpl<T>  implements TreeTraversal<T>{
    ArrayDeque<Node<T>> stack;

    int level=0;

    @Override
        public void traverse(Node<T> root) {
        traversal(root);

    }
    private void traversal(Node<T> root){
        ArrayDeque<Node<T>> stack = new ArrayDeque<>();
        stack.push(root);

        ArrayDeque<Node<T>> tempStack = new ArrayDeque<>();

        while(stack.size()>0) {
            Node<T> node = stack.pop();
            System.out.print(node.getData()+"->");
            if (level % 2 == 0) {
                for (Node<T> child : node.getChildren()) {
                    tempStack.push(child);
                }
            }
            else {
                for (int i = node.getChildren().size() - 1; i >= 0; i--) {
                    tempStack.push(node.getChildren().get(i));
                }
            }
            if(stack.size()==0){
                stack = tempStack;
                tempStack = new ArrayDeque<>();
                level = level + 1;
            }
        }
    }
}
