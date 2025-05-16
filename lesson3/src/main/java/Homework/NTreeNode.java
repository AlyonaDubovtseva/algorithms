package Homework;

import java.util.ArrayList;
import java.util.List;

public class NTreeNode {
    int val;
    List<NTreeNode> children;

    NTreeNode(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }

    void addChild(NTreeNode child) {
        this.children.add(child);
    }
}
