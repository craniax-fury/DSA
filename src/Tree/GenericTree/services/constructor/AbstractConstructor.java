package Tree.GenericTree.services.constructor;

import Tree.GenericTree.Model.Node;
import Tree.GenericTree.Model.NodeWithLevel;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractConstructor {
    public static Node<Integer> construct(int[] input) {
        List<Node<Integer>> list = new ArrayList<>();
        Node<Integer> root = new Node<>();
        for (Integer data : input) {
            if (data != -1) {
                Node<Integer> node = new Node<>();
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

    public static NodeWithLevel<Integer> constructNodeWithLevel(int[] input) {
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