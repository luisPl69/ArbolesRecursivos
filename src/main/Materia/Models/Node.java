package main.Materia.Models;

public class Node {
    private int value;
    private Node left;
    private Node right;

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return this.left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return this.right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    // Constructor que inicializa el valor del nodo y los hijos a null
    public Node(int value) {
        this.value = value;
        this.left = null;  // Inicializa el hijo izquierdo a null
        this.right = null; // Inicializa el hijo derecho a null
    }
}


