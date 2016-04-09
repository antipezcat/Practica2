/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio2;
import java.util.List;
import java.util.*;
import java.io.IOException; 
/**
 *
 * @author abollaita
 */

/*Defina una clase llamada MiColeccion la cual implemente la interfaz java.util.List.
Dicha clase debe trabajará con una propiedad Object[] (Arreglo del tipo Object) donde
almacenará los datos. La clase debe contener dos constructores una vacío que inicializará
el arreglo de objeto a 3 posiciones y otro de se especifique la dimensión. En dicha clase,
usted estará implementando los siguientes métodos proveniente de la interfaz List: size(),
isEmpty(), toArray(), add(Object), remove(int index), clear(), get(int index). El tamaño
de la colección serán considerados los elementos del arreglo que no sean nulos, en el
método add(Object) estará almacenando los objetos en la primera posición del arreglo
que sea nula. En caso de sobrepasar la capacidad del arreglo no permitir agregar más
objetos a la colección. Validar los errores que puedan ocurrir manipulando los métodos
implementados.*/

public class MiColeccion implements java.util.List {
Object obj [];

    void MiColeccion (){
        this.obj = new Object[3];
    }
    void MiColeccion(int n){
        this.obj = new Object[n];
    }
    
    @Override
    public int size(){
        int tamanio = 0;
        for (int i = 0; i < obj.length;i++) {
            if (obj[i]!= null) {  
                tamanio++;
            } 
        }
        return tamanio;
    }
    

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < obj.length;i++) {
            if (obj[i]!= null) {  
                return false;
            } 
        }
         return true;
}


    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray(Object[] a) {
        return obj;
    }

    @Override
    public boolean add(Object e) {
        
        for (int i = 0; i < obj.length;i++) {
            if (obj[i]== null) {  
                obj[i]=e;
                return true;
            }      
        } 
        return false; 
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        for(int i =0;i <obj.length;i++){
            obj[i]=null;
        
        }
    }

    @Override
    public Object get(int index) {
        try{
           return obj[index];
       }catch(Exception e){
           throw  new IndexOutOfBoundsException("Fuera de indice");
       }
    }

    @Override
    public Object set(int index, Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(int index, Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object remove(int index) {
        
        try{
           return obj[index] = null;
       }catch(Exception e){
           throw  new IndexOutOfBoundsException("Fuera de indice");
       }
     
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}