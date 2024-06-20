package main.Materia.Controles;

import java.util.Stack;
import main.Materia.Models.Node;

public class ArbolBinario {

    // Método de recorrido en preorden utilizando un bucle
    public void preOrdenLoop(Node root) {
        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.print(node.getValue() + "-");
            if (node.getRight() != null) {
                stack.push(node.getRight());
            }
            if (node.getLeft() != null) {
                stack.push(node.getLeft());
            }
        }
        System.out.println();
    }

    // Método de recorrido en preorden recursivo
    public void preOrderRecursivo(Node node) {
        if (node != null) {
            System.out.print(node.getValue() + "-");
            preOrderRecursivo(node.getLeft());
            preOrderRecursivo(node.getRight());
        }
    }

    // Método de recorrido en postorden utilizando un bucle
    public void postOrderLoop(Node root) {
        if (root == null) {
            return;
        }

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);

        while (!stack1.isEmpty()) {
            Node node = stack1.pop();
            stack2.push(node);

            if (node.getLeft() != null) {
                stack1.push(node.getLeft());
            }

            if (node.getRight() != null) {
                stack1.push(node.getRight());
            }
        }

        while (!stack2.isEmpty()) {
            Node node = stack2.pop();
            System.out.print(node.getValue() + "-");
        }
        System.out.println();
    }

    // Método de recorrido en postorden recursivo
    public void postOrderRecursivo(Node node) {
        if (node != null) {
            postOrderRecursivo(node.getLeft());
            postOrderRecursivo(node.getRight());
            System.out.print(node.getValue() + "-");
        }
    }

    // Método de recorrido en inorden recursivo
    public void inOrderRecursivo(Node node) {
        if (node != null) {
            inOrderRecursivo(node.getLeft());
            System.out.print(node.getValue() + "-");
            inOrderRecursivo(node.getRight());
        }
    }
}

