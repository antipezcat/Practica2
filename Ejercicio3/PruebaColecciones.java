/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;


import Ejercicio1.Audio;
import Ejercicio1.Video;
import Ejercicio2.MiColeccion;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author abollaita
 */
public class PruebaColecciones {

  static void recorrerLista(List lista) {
        
        System.out.println("Cantidad de elementos "+lista.size());
        
        for (Object elemento : lista) {
            if(elemento!=null)
                System.out.println(elemento.getClass().getName() + "/n"); 
        }
    
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MiColeccion lista0 = new MiColeccion(3);
        ArrayList<Object> lista1 = new ArrayList<>();
        LinkedList<Object> lista2 =new LinkedList<> ();
        
        lista0.add(new Audio());
        lista0.add("Unicornio Azul");
        lista0.add(42%3);
        
        lista1.add(new Video());
        lista1.add(new MiColeccion());
        lista1.add("Gatos Espaciales");
        
        lista2.add("Ukrania");
        lista2.add("Rusia");
        lista2.add("Chechenia");
        
        recorrerLista(lista0);
        recorrerLista(lista1);
        recorrerLista(lista2);
        
    }
    
}
