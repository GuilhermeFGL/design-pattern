import implementations.Tree;
import implementations.TreeFactory;
import implementations.TreeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {

    private final List<Tree> TREES = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        TREES.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : TREES) {
            tree.draw(graphics);
        }
    }
}