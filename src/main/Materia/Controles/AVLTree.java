package main.Materia.Controles;

import main.Materia.Models.Node;

public class AVLTree {
    private Node root;

    // Obtener la altura de un nodo
    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.getHeight();
    }

    // Método que obtiene el factor de equilibrio de un nodo
    private int getBalance(Node node) {
        if (node == null) {
            return 0;
        }
        return height(node.getLeft()) - height(node.getRight());
    }

    public Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value > node.getValue()) {
            node.setRight(insert(node.getRight(), value));
        } else if (value < node.getValue()) {
            node.setLeft(insert(node.getLeft(), value));
        } else {
            return node;
        }

        // Actualizar la altura del predecesor o ancestro
        node.setRight(1 + Math.max(height(node.getLeft()), height(node.getRight())));

        // Calcular el balance
        int balance = getBalance(node);

        // Si el nodo está desbalanceado se tiene 4 casos

        // Caso Izquierda - Izquierda
        if (balance > 1 && value < node.getLeft().getValue()) {
            return rightRotate(node);
        }

        // Caso Derecha - Derecha
        if (balance < -1 && value > node.getRight().getValue()) {
            return leftRotate(node);
        }

        // Caso Izquierda - Derecha
        if (balance > 1 && value > node.getLeft().getValue()) {
            node.setLeft(leftRotate(node.getLeft()));
            return rightRotate(node);
        }

        // Caso Derecha - Izquierda
        if (balance < -1 && value < node.getRight().getValue()) {
            node.setRight(rightRotate(node.getRight()));
            return leftRotate(node);
        }

        // Devolver el nodo sin cambios o rotaciones
        return node;
    }

    private Node rightRotate(Node nodeR) {
        Node x = nodeR.getLeft();
        Node temp = x.getRight();

        // Realizar la rotación
        x.setRight(nodeR);
        nodeR.setLeft(temp);

        // Actualizar las alturas
        nodeR.setRight(Math.max(height(nodeR.getLeft()), height(nodeR.getRight())) + 1);
        x.setRight(Math.max(height(x.getLeft()), height(x.getRight())) + 1);

        // Devolver nueva raíz
        return x;
    }

    private Node leftRotate(Node nodeL) {
        Node y = nodeL.getRight();
        Node temp = y.getLeft();

        // Realizar la rotación
        y.setLeft(nodeL);
        nodeL.setRight(temp);

        // Actualizar las alturas
        nodeL.setRight(Math.max(height(nodeL.getLeft()), height(nodeL.getRight())) + 1);
        y.setRight(Math.max(height(y.getLeft()), height(y.getRight())) + 1);

        // Devolver nueva raíz
        return y;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public void printTreeNode(Node root, String prefix, boolean isLeft) {
        if (root != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + root.getValue());
            if (root.getLeft() != null || root.getRight() != null) {
                if (root.getLeft() != null) {
                    printTreeNode(root.getLeft(), prefix + (isLeft ? "│   " : "    "), true);
                } else {
                    System.out.println(prefix + (isLeft ? "│   " : "    ") + "├── null");
                }
                if (root.getRight() != null) {
                    printTreeNode(root.getRight(), prefix + (isLeft ? "│   " : "    "), false);
                } else {
                    System.out.println(prefix + (isLeft ? "│   " : "    ") + "└── null");
                }
            }
        }
    }

    public void printTree() {
        printTreeNode(root, "", false);
    }
}