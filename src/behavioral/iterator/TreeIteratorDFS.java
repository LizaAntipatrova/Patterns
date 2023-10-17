package behavioral.iterator;

import java.util.Stack;

public class TreeIteratorDFS extends TreeIterator {
    private final Stack<BinaryTree.Node> nextNodes = new Stack<>();


    public TreeIteratorDFS(BinaryTree.Node topTree) {
        super(topTree);
    }

    @Override
    public double getNext() {
        BinaryTree.Node currNode = nextNode;

        if (nextNode.leftChild != null) {
            if (nextNode.rightChild != null) {
                nextNodes.push(nextNode.rightChild);
            }
            nextNode = nextNode.leftChild;

        } else if (!nextNodes.empty()) {
            nextNode = nextNodes.pop();
        } else {
            nextNode = null;
        }
        return currNode.value;
    }


}
