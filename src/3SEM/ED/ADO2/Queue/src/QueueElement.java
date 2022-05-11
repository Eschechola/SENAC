public class QueueElement {
    private Object _value;
    private QueueElement _nextElement;
    private QueueElement _backElement;

    public QueueElement(int value, QueueElement backElement, QueueElement nextElement) {
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

    public QueueElement getNextElement() {
        return _nextElement;
    }

    public void setNextElement(QueueElement nextElement) {
        _nextElement = nextElement;
    }

    public QueueElement getBackElement() {
        return _backElement;
    }

    public void setBackElement(QueueElement backElement) {
        _backElement = backElement;
    }
}
