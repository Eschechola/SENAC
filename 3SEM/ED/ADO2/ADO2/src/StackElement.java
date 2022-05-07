public class StackElement {
    private Object _value;
    private StackElement _nextElement;
    private StackElement _backElement;

    public StackElement(int value, StackElement backElement, StackElement nextElement) {
        _value = value;
        _nextElement = nextElement;
        _backElement = backElement;
    }

    public Object getValue() {
        return _value;
    }

    public void setValue(Object value) {
        _value = value;
    }

    public StackElement getNextElement() {
        return _nextElement;
    }

    public void setNextElement(StackElement nextElement) {
        _nextElement = nextElement;
    }

    public StackElement getBackElement() {
        return _backElement;
    }

    public void setBackElement(StackElement backElement) {
        _backElement = backElement;
    }
}
