package behavioral.memento;

public class TextFile {
    private StringBuilder text;
    private int pointer;


    public TextFile() {
        text = new StringBuilder();
        pointer = 0;
    }

    public Memento save() {
        return new Memento(text, pointer);
    }

    public void write(String writtenText) {
        text = text.insert(pointer, writtenText);
        pointer += writtenText.length();
    }

    public void restore(Memento stateTextFile) {
        text = new StringBuilder().append(stateTextFile.getText());
        pointer = stateTextFile.getPointer();
    }

    @Override
    public String toString() {
        return text.toString();
    }

    public class Memento {
        private final StringBuilder text;
        private final int pointer;

        public Memento(StringBuilder text, int pointer) {
            this.text = new StringBuilder(text);
            this.pointer = pointer;
        }

        public StringBuilder getText() {
            return text;
        }

        public int getPointer() {
            return pointer;
        }
    }
}