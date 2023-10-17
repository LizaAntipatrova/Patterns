package behavioral.iterator;

public class BinaryTree implements TreeCollection {
    private Node top;
    private int size;


    public BinaryTree() {
        size = 0;
    }

    private void insertNode(Node node) {
        if (node == null) {
            return;
        }

        double insertValue = node.value;

        if (top == null) {
            top = new Node(insertValue);
            return;
        }
        Node currNode = top;

        while (currNode != null) {
            if (insertValue > currNode.value) {
                if (currNode.rightChild == null) {
                    currNode.rightChild = node;
                    break;
                }
                currNode = currNode.rightChild;
            } else {
                if (currNode.leftChild == null) {
                    currNode.leftChild = node;
                    break;
                }
                currNode = currNode.leftChild;
            }
        }
    }

    public void insert(double value) {
        insertNode(new Node(value));
        size += 1;
    }

    public void remove(double value) {

        Node currNode = top;
        Node previousNode = null;
        while (currNode != null) {

            if (value > currNode.value) {
                previousNode = currNode;
                currNode = currNode.rightChild;
                continue;

            } else if (value < currNode.value) {
                previousNode = currNode;
                currNode = currNode.leftChild;
                continue;
            }

            if (currNode.leftChild != null && currNode.leftChild.value == value) {
                previousNode = currNode;
                currNode = currNode.leftChild;
                continue;
            }

            if (previousNode == null) {
                top = currNode.leftChild;
                insertNode(currNode.rightChild);

            } else if (previousNode.leftChild != null && previousNode.leftChild.value == value) {
                previousNode.leftChild = currNode.leftChild;
                insertNode(currNode.rightChild);
            } else {
                previousNode.rightChild = currNode.rightChild;
                insertNode(currNode.leftChild);
            }
            size -= 1;
            break;

        }
    }


    public Node findNode(double value) {
        Node currNode = top;
        Node foundNode = null;
        while (currNode != null) {

            if (value > currNode.value) {
                currNode = currNode.rightChild;
            } else if (value < currNode.value) {
                currNode = currNode.leftChild;
            } else {
                foundNode = currNode;
                break;
            }
        }
        return foundNode;
    }

    @Override
    public TreeIterator createIteratorBFS() {
        return new TreeIteratorBFS(top);
    }

    @Override
    public TreeIterator createIteratorDFS() {
        return new TreeIteratorDFS(top);
    }

    public int getSize() {
        return size;
    }

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    class Node {
        double value;
        Node leftChild;
        Node rightChild;

        public Node(double value) {
            this.value = value;
        }

        public Node(double value, Node leftChild, Node rightChild) {
            this.value = value;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }
    }
}
