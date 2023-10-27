package behavioral.memento;

public class TestMemento {
    public static void main(String[] args) {
        TextFile text = new TextFile();
        Storage storage = new Storage(text);

        text.write("Hello ");
        storage.makeBackup();
        text.write("world!");

        System.out.println(text);

        storage.undo();
        System.out.println(text);
    }
}
