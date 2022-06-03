public class Node {
    private Object _value;
    private Node _left;
    private Node _right;

    public Node(
            Object value,
            Node left,
            Node right)
    {
        _value = value;
        _left = left;
        _right = right;
    }

    public Object getValue() {
        return _value;
    }

    public void setValue(Object value) {
        _value = value;
    }

    public Node getLeft() {
        return _left;
    }

    public void setLeft(Node left) {
        _left = left;
    }

    public Node getRight() {
        return _right;
    }

    public void setRight(Node right) {
        _right = right;
    }
}
