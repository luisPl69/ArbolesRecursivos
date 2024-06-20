package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {
    public void maxDepthTest(){

    }

    public int maxDepth(Node root) {
        // TODO Auto-generated method stub
        if(root==null){
            return 0;
        }

        int depthleft=maxDepth(root.getLeft());
        int depthRight=maxDepth(root.getRight());
        return Math.max(depthleft, depthRight)+1; 

    }

}
