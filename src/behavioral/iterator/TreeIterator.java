package behavioral.iterator;

public abstract class TreeIterator {

    protected BinaryTree.Node nextNode;

    public TreeIterator(BinaryTree.Node topTree) {
        this.nextNode = topTree;
    }

    public abstract double getNext();

    public boolean hasNext() {
        return nextNode != null;
    }
}
