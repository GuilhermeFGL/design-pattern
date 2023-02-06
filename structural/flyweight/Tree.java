import java.awt.*;

public class Tree {

    private final int X;
    private final int Y;
    private final TreeType TYPE;

    public Tree(int x, int y, TreeType type) {
        this.X = x;
        this.Y = y;
        this.TYPE = type;
    }

    public void draw(Graphics g) {
        TYPE.draw(g, X, Y);
    }
}
