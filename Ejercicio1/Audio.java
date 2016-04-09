/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio1;

/**
 *
 * @author abollaita
 */
public class Audio implements ReproductorMedia {

    @Override
    public void ejecutar() {
      System.out.println("Reproduciendo audio");
    }

    @Override
    public void detener() {
      System.out.println("Deteniendo audio");  
    }

    @Override
    public void rebobinar() {
      System.out.println("Rebobinando audio");    
    }

    @Override
    public void avanzar() {
      System.out.println("avanzando audio");     
    }

    @Override
    public void grabar() {
      System.out.println("Grabando audio");  
    }

}
