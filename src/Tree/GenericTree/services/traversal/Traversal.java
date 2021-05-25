package Tree.GenericTree.services.traversal;

import Tree.GenericTree.Model.Node;

public class Traversal<T> extends AbstractTraversal<T>{

    public void preOrdertraverse(Node<T> root) {
        treeTraversal = new PreOrderTraversalImpl<>();
        treeTraversal.traverse(root);
    }

    public void postOrderTraverse(Node<T> root){
        treeTraversal=new PostOrderTraversalImpl<>();
        treeTraversal.traverse(root);
    }

    public void levelOrderTraverse(Node<T> root) {
        treeTraversal=new LevelOrderTraversalImpl<>();
        treeTraversal.traverse(root);
    }

    public void levelOrderTraverseZigZag(Node<T> root) {
        treeTraversal=new LevelOrderZigZagTraversalImpl<>();
        treeTraversal.traverse(root);
    }
}
