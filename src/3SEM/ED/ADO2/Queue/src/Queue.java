public class Queue {
    QueueElement _start = null;
    QueueElement _current;
    QueueElement _support;

    public boolean enqueue(int value){
        if(_start == null){
            _start = new QueueElement(value, null, null);
            _support = _start;
            _current = _start;

            return true;
        }

        _current = new QueueElement(value, _support, null);
        _support.setNextElement(_current);
        _support = _current;

        return true;
    }

    public boolean dequeue(){
        if(empty())
            return true;

        if(_start.getNextElement() == null)
        {
            _start = null;
        }
        else
        {
            _support = _start.getNextElement();
            _support.setBackElement(null);
            _start.setNextElement(null);

            _start = _support;
        }

        return true;
    }

    public boolean empty(){
        return _start == null;
    }

    public Object front(){
        QueueElement element = _start;

        while(element.getNextElement() != null)
            element = element.getNextElement();

        return element.getValue();
    }

    public int size(){
        if(empty())
            return 0;

        QueueElement element = _start;
        int size = 0;

        while(element != null){
            size++;
            element = element.getNextElement();
        }


        return size;
    }

    public void show(){
        QueueElement element = _start;

        while(element != null){
            System.out.print(element.getValue() + " | ");
            element = element.getNextElement();
        }
    }
}
