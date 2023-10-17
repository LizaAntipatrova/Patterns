package behavioral.iterator;

public class TestIterator {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(3);
        tree.insert(1);
        tree.insert(1);
        tree.insert(2);
        tree.insert(8);
        tree.insert(10);
        tree.insert(0);
        tree.insert(6);

        TreeIterator treeIteratorBFS = tree.createIteratorBFS();
        while (treeIteratorBFS.hasNext()) {
            System.out.println(treeIteratorBFS.getNext());
        }


    }
}
