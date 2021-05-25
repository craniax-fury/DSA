package Tree.GenericTree.services.traversal;

import Tree.GenericTree.Model.Node;

public interface TreeTraversal<T> {
    void traverse(Node<T> root);
}