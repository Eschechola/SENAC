public class Tree {
    private Node _root;
    private int _sum;

    public Tree()
    {
        _root = null;
        _sum = 0;
    }

    public Node getRoot() {
        return _root;
    }

    public void insert(Object value){
        var newNode = new Node(value, null, null);

        if(_root == null)
            _root = newNode;
        else
            insert(newNode, _root);
    }

    private void insert(Node newNode, Node prevNode){
        int newNodeValue = (int) newNode.getValue();
        int prevNodeValue = (int) prevNode.getValue();

        if(newNodeValue < prevNodeValue)
        {
            if(prevNode.getLeft() == null)
                prevNode.setLeft(newNode);
            else
                insert(newNode, prevNode.getLeft());
        }
        else
        {
            if(prevNode.getRight() == null)
                prevNode.setRight(newNode);
            else
                insert(newNode, prevNode.getRight());
        }
    }

    public void order(Node node){
        if(node != null){
            order(node.getLeft());
            System.out.print(node.getValue() + " | ");
            order(node.getRight());
        }
    }

    public void preOrder(Node node){
        if(node != null){
            System.out.print(node.getValue() + " | ");
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    public void postOrder(Node node){
        if(node != null){
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.print(node.getValue() + " | ");
        }
    }

    public void course(Node node, TreeCourseType courseType){
        if(node != null){
            if(courseType.equals(TreeCourseType.PRE))
                System.out.print(node.getValue() + " | ");

            course(node.getLeft(), courseType);

            if(courseType.equals(TreeCourseType.ORDER))
                System.out.print(node.getValue() + " | ");

            course(node.getRight(), courseType);

            if(courseType.equals(TreeCourseType.POST))
                System.out.print(node.getValue() + " | ");
        }
    }

    public void search(int value, Node currentNode){
        if(currentNode == null)
            System.out.println("O valor não foi encontrado!");

        int currentValue = (int) currentNode.getValue();

        if(value == currentValue)
            System.out.println("Valor encontrado: " + currentNode);
        else
        {
            if(value < currentValue)
                search(value, currentNode.getLeft());
            else
                search(value, currentNode.getRight());
        }
    }

    public void minValue(Node currentNode){
        if(currentNode.getLeft() != null)
            minValue(currentNode.getLeft());
        else
            System.out.println("Min value: " + currentNode.getValue());
    }

    public void maxValue(Node currentNode){
        if(currentNode.getRight() != null)
            minValue(currentNode.getRight());
        else
            System.out.println("Max value: " + currentNode.getRight());
    }

    public void sumElements(){
        int sum = sumElements(_root);
        System.out.println("Sum of elements: " + sum);
    }

    private int sumElements(Node node){
        int sum = 0;
        int sumRight = 0;
        int sumLeft = 0;

        if(_root == null){
            System.out.println("Tree is empty!");
            return 0;
        }

        if(node.getLeft() != null)
            sumLeft = sumElements(node.getLeft());

        if(node.getRight() != null)
            sumRight = sumElements(node.getRight());

        sum = (int)node.getValue() + sumLeft + sumRight;

        return sum;
    }

    public void getLevelOfNode(int value){
        int level = getLevelOfNode(_root, value, 0);
        System.out.println("Level of node: " + level);
    }

    private int getLevelOfNode(Node node, int value, int level){
        int result = 0;

        if(_root == null){
            System.out.println("Tree is empty!");
            return 0;
        }

        if((int)node.getValue() == value)
            return level;

        if(node.getLeft() != null){
            result = getLevelOfNode(node.getLeft(), value, level + 1);

            if(result != 0)
                return result;
        }

        if(node.getRight() != null){
            result = getLevelOfNode(node.getRight(), value, level + 1);

            if(result != 0)
                return result;
        }

        return 0;
    }
}
