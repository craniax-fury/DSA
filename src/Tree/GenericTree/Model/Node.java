package Tree.GenericTree.Model;
import java.util.List;
import java.util.ArrayList;

public class Node<T> {
    private T data;
    private List<Node<T>> children = new ArrayList<>();

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<Node<T>> getChildren() {
        return children;
    }

    public void setChildren(Node<T> children) {
        this.children.add(children);
    }
}
