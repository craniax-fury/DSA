package Tree.GenericTree.services.constructor;

import Tree.GenericTree.Model.NodeWithLevel;

import java.util.ArrayList;
import java.util.List;

public interface ConstructNodeWithLevel {
    public static NodeWithLevel<Integer> construct(int[] input) {
        List<NodeWithLevel<Integer>> list = new ArrayList<>();
        NodeWithLevel<Integer> root = new NodeWithLevel<>();
        for (Integer data : input) {
            if (data != -1) {
                NodeWithLevel<Integer> node = new NodeWithLevel<>();
                node.setData(data);
                if (list.size() != 0) {
                    list.get(list.size()-1).setChildren(node);
                } else
                    root = node;
                list.add(node);

            } else {
                list.remove(list.size()-1);

            }
        }
        return root;
    }
}