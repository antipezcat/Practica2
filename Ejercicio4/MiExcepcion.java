/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio4;

/**
 *
 * @author abollaita
 */
public class MiExcepcion extends Exception {
    
    public static  void disparandoExcepcion(int n1, int n2) throws MiExcepcion{
        
        if(n1==0||n2==0){
           
            throw new MiExcepcion();
        }
    }
     public  static  void capturandoExcepcion(int a,int b){
        
        try{
            disparandoExcepcion(a,b);
        }catch(MiExcepcion e){
            System.err.println("Error del tipo mio "+e.getMessage());
        }
    }

}
