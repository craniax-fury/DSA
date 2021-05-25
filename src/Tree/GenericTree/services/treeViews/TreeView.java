package Tree.GenericTree.services.treeViews;

import Tree.GenericTree.Model.NodeWithLevel;

public interface TreeView<T>{
    void view(NodeWithLevel<T> root);
}
