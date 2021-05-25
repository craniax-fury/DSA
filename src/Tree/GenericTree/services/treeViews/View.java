package Tree.GenericTree.services.treeViews;

import Tree.GenericTree.Model.NodeWithLevel;

public class View<T> extends AbstractTreeView<T> {

    public void leftView(NodeWithLevel<T> root) {
        treeView = new LeftViewImpl<>();
        treeView.view(root);
    }


    public void rightView(NodeWithLevel<T> root) {
        treeView = new RightViewImpl<>();
        treeView.view(root);
    }
}
