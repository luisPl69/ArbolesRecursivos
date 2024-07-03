import main.Materia.Controles.Graph;
import main.Materia.Controles.SetsClase;
import main.Materia.Models.NodeGraph;

public class App {
    public static void main(String[] args) throws Exception {
        runGraph();
        runSets();
    }

    private static void runSets() {
        SetsClase setsClase = new SetsClase();
        
    }

    private static void runGraph() {
        Graph graph = new Graph();

        // Agregar nodos
        NodeGraph node1 = graph.addNode(1);
        NodeGraph node2 = graph.addNode(2);
        NodeGraph node3 = graph.addNode(3);
        NodeGraph node4 = graph.addNode(4);
        NodeGraph node5 = graph.addNode(5);
        NodeGraph node6 = graph.addNode(6);
        NodeGraph node7 = graph.addNode(7);
        NodeGraph node8 = graph.addNode(8);

        // Agregar aristas
        graph.addEdge(node1, node2);
        graph.addEdge(node1, node3);
        graph.addEdge(node2, node4);
        graph.addEdge(node4, node7);
        graph.addEdge(node2, node5);
        graph.addEdge(node5, node8);
        graph.addEdge(node3, node6);

        // Imprimir el grafo
        graph.printGraph();
    }
}
