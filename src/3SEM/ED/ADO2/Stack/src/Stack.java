public class Stack {
    StackElement _start = null;
    StackElement _current;
    StackElement _support;

    public boolean push(int value){
        if(_start == null){
            _start = new StackElement(value, null, null);
            _support = _start;
            _current = _start;

            return true;
        }

        _current = new StackElement(value, _support, null);
        _support.setNextElement(_current);
        _support = _current;

        return true;
    }

    public boolean pop(){
        if(empty())
            return true;

        if(_current.getBackElement() == null)
        {
            _start = null;
        }
        else
        {
            _support = _current.getBackElement();
            _support.setNextElement(null);
            _current.setBackElement(null);

            _current = _support;
        }

        return true;
    }

    public boolean empty(){
        return _start == null;
    }

    public Object top(){
        StackElement element = _start;

        while(element.getNextElement() != null)
            element = element.getNextElement();

        return element.getValue();
    }

    public int size(){
        if(empty())
            return 0;

        StackElement element = _start;
        int size = 0;

        while(element != null){
            size++;
            element = element.getNextElement();
        }


        return size;
    }

    public void show(){
        StackElement element = _start;

        while(element != null){
            System.out.print(element.getValue() + " | ");
            element = element.getNextElement();
        }
    }
}
