package behavioral.iterator;

import java.util.Deque;
import java.util.LinkedList;

public class TreeIteratorBFS extends TreeIterator {

    private final Deque<BinaryTree.Node> nextNodes = new LinkedList<>();

    public TreeIteratorBFS(BinaryTree.Node topTree) {
        super(topTree);
    }

    @Override
    public double getNext() {
        BinaryTree.Node currNode = nextNode;
        if (nextNode.leftChild != null) {
            nextNodes.add(nextNode.leftChild);
        }
        if (nextNode.rightChild != null) {
            nextNodes.add(nextNode.rightChild);
        }
        nextNode = nextNodes.pollFirst();
        return currNode.value;
    }


}
