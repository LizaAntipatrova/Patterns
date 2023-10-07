package structural.flyweight;

public class Request {
    private SlimeType type;
    private int x;
    private int y;

    public Request(SlimeType type, int x, int y) {
        this.type = type;
        this.x = x;
        this.y = y;
    }

    public SlimeType getType() {
        return type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
