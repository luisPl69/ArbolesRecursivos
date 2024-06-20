import main.Materia.Controles.ArbolBinario;
import main.Materia.Models.Node;

/*
 *        1   
 *    2      3
 * 4      5     6     
 * 7      8
 */

public class App {
    public static void main(String[] args) throws Exception {
        ArbolBinario arbolBinario = new ArbolBinario();
        Node nodeRoot = new Node(1);

        nodeRoot.setLeft(new Node(2));
        nodeRoot.setRight(new Node(3));

        nodeRoot.getLeft().setLeft(new Node(4));
        nodeRoot.getLeft().setRight(new Node(5)); // Corrección aquí

        nodeRoot.getRight().setRight(new Node(6));

        nodeRoot.getLeft().getLeft().setLeft(new Node(7));
        nodeRoot.getLeft().getRight().setLeft(new Node(8));

        System.out.println("PreOrdenar - Loop");
        arbolBinario.preOrdenLoop(nodeRoot);

        System.out.println("PreOrdenar - Recursivo");
        arbolBinario.preOrderRecursivo(nodeRoot);
        System.out.println();

        System.out.println("PostOrdenar - Loop");
        arbolBinario.postOrderLoop(nodeRoot);

        System.out.println("PostOrdenar - Recursivo");
        arbolBinario.postOrderRecursivo(nodeRoot);
        System.out.println();

        System.out.println("InOrdenar - Recursivo");
        arbolBinario.inOrderRecursivo(nodeRoot);
        System.out.println();
    }
}
