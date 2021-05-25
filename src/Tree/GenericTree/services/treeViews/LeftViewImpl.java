package Tree.GenericTree.services.treeViews;

import Tree.GenericTree.Model.NodeWithLevel;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class LeftViewImpl<T>  implements TreeView<T> {

    @Override
        public void view(NodeWithLevel<T> root) {
        int level=0;

        ArrayDeque<NodeWithLevel<T>> queue = new ArrayDeque<>();
        Map<Integer,Boolean> levelMap= new HashMap<>();

        queue.offer(root);
        root.setLevel(level);
        levelMap.put(level,Boolean.FALSE);

        while(queue.size()!=0) {
            NodeWithLevel<T> node = queue.poll();

            if(levelMap.get(node.getLevel())==Boolean.FALSE) {
                System.out.print(node.getData() + "->");
                levelMap.replace(node.getLevel(),Boolean.TRUE);
                level += 1;
                levelMap.put(level, Boolean.FALSE);
            }

            for (NodeWithLevel<T> child : node.getChildren()) {
                child.setLevel(level);
                queue.offer(child);
            }
        }
        System.out.print(".");
    }
}