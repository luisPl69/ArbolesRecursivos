package main.Materia.Controles;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



import main.Materia.Models.NodeGraph;

public class Graph {
    private List<NodeGraph> nodes;
    //Contructor 
    public Graph( ){
        this.nodes= new ArrayList<>();

    }
    public NodeGraph addNode(int value ){
        NodeGraph newNode=new NodeGraph(value);
        nodes.add(newNode);
        return newNode;
    }
    public void  addEdge (NodeGraph  src, NodeGraph dest){
        src.addNeighbor(src);
        dest.addNeighbor(dest);

    }  
    public void printGraph(){
        for (NodeGraph node : nodes){
            System.out.print("Vertex"+node.getValue()+":");
            for (NodeGraph neighbor : node.getNeighbors()){
                System.out.println("-->"+neighbor.getValue());
            }
            System.out.println();
        }

    } 
    public void getDFS(NodeGraph startNode) {
        boolean[] visited = new boolean[nodes.size()]; /// Crear un array de booleanos para marcar los nodos visitados
        DFSU(startNode, visited); // Llamar al método DFS recursivo pasando el nodo inicial y el array de visitados
    }
    public void DFSU(NodeGraph node, boolean[] visited) {
        if (node == null || visited[node.getValue()]) return;
        visited[node.getValue()] = true;
        System.out.print(node.getValue() + " ");
        for (NodeGraph neighbor : node.getNeighbors()) {
            DFSU(neighbor, visited);
        }
    }
    public void getBFS(NodeGraph startNode) {
        boolean[] visited = new boolean[nodes.size()];
        Queue<NodeGraph> queue = new LinkedList<>();
        queue.add(startNode);
        visited[startNode.getValue()] = true;
        
        while (!queue.isEmpty()) {
            NodeGraph currentNode = queue.poll();
            System.out.print(currentNode.getValue() + " ");
            for (NodeGraph neighbor : currentNode.getNeighbors()) {
                if (!visited[neighbor.getValue()]) {
                    queue.add(neighbor);
                    visited[neighbor.getValue()] = true;
                }
            }
        }
    }
    public int [][] getAdjacencyMatrix(){

    }
    public void printAdjacencyMatrix(){

    }


}
