package Tree.GenericTree.Model;

import java.util.ArrayList;
import java.util.List;

public class NodeWithLevel<T>{
    private int level;
    private T data;
   private List<NodeWithLevel<T>> children = new ArrayList<>();


    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data=data;
    }

    public List<NodeWithLevel<T>> getChildren() {
        return this.children;
    }

    public void setChildren(NodeWithLevel<T> child) {
        this.children.add(child);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
