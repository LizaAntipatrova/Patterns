package behavioral.memento;

import java.util.Stack;

public class Storage {
    private final TextFile textFile;
    private final Stack<TextFile.Memento> history;

    public Storage(TextFile textFile) {
        this.textFile = textFile;
        this.history = new Stack<>();
    }

    public void makeBackup() {
        history.push(textFile.save());
    }

    public void undo() {
        textFile.restore(history.pop());
    }

    public TextFile getTextFile() {
        return textFile;
    }
}
