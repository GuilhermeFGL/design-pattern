package implementations;

import java.awt.*;

public class TreeType {

    private final String NAME;
    private final Color COLOR;
    private final String OTHER_TREE_DATA;

    public TreeType(String name, Color color, String otherTreeData) {
        this.NAME = name;
        this.COLOR = color;
        this.OTHER_TREE_DATA = otherTreeData;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(COLOR);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}