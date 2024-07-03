package main.Materia.Controles;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetsClase {

    public SetsClase(){
        contruirHashSet();
        System.out.println();
        contruirLinkedHashSet();
        System.out.println();
        construirTreeSet();
        System.out.println();
        contruirTreeSetConComparador();
        


    }
    public void contruirHashSet(){
        HashSet<String> conjunto= new HashSet<>();
        conjunto.add("Manzana");
        
        conjunto.add("Banana");
        
        conjunto.add("Naranja");
        
        conjunto.add("Manzana");// Duplicado no se añadira 
        
        conjunto.add("Uvas");
        
        conjunto.add("Piña ");
        System.out.println("HashSet"+conjunto );
        // Eleminar un elemento 
        conjunto.remove("Banana");
        System.out.println("HashSets despues d ela eleimanacioin"+ conjunto );
        conjunto.remove("Uvas");
        conjunto.remove("Piña");
        System.out.println("HashSets despues d ela eleimanacioin"+ conjunto );
        System.out.println();
        Boolean contieneNaranja= conjunto.contains("Naranja");
        System.out.println("¿HashSet contiene naranja "+contieneNaranja);
        System.out.println();
        // oBtener el tamaño del conjunto
        int tamaño = conjunto.size();
        System.out.println("Tamaño del HashSet:"+tamaño);

    }
    public void contruirLinkedHashSet(){
        LinkedHashSet<String> conjunto = new LinkedHashSet<>();
        
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana");// Duplicado no se añadira 
        conjunto.add("Uvas");
        conjunto.add("Piña ");
        System.out.println("LinkdHashSet"+conjunto );

    }
    public void construirTreeSet(){
        TreeSet<String> conjunto = new TreeSet<>();
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana"); // Duplicado no se añadirá
        conjunto.add("Uvas");
        conjunto.add("Piña "); 
        System.out.println("TreeSet: " + conjunto);
    }


    
    public void contruirTreeSetConComparador(){
        Comparator<String> comparadorOrdenInverso=new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1); // Ordenar en orden descendente
            }

        };
          

        
        TreeSet<String> conjunto = new TreeSet<>(comparadorOrdenInverso);
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana"); // Duplicado no se añadirá
        conjunto.add("Uvas");
        conjunto.add("Piña "); 
        System.out.println("TreeSet: " + conjunto);


    }





}
