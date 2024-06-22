package main.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import main.Materia.Models.Node;

public class ListLevels {
    

    public List<List<Node>> listLevels(Node root) {
        List<List<Node>> result = new ArrayList<>();
        listLevelsHelper(root, result, 0);
        return result;
    }

    private void listLevelsHelper(Node node, List<List<Node>> levels, int level) {
        if (node == null) {
            return;
        }

        if (levels.size() == level) {
            levels.add(new LinkedList<>());
        }

        levels.get(level).add(node);

        listLevelsHelper(node.getLeft(), levels, level + 1);
        listLevelsHelper(node.getRight(), levels, level + 1);
    }

}
