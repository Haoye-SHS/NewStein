package Java2.Snake;

public class Position {
    private int x;
    private int y;

    /*
    constructor init x and y pos for an object
     */
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //get x pos
    public int getX() {
        return x;
    }

    //get y pos
    public int getY() {
        return y;
    }
}
