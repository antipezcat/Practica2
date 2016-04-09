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
public class Video implements ReproductorMedia{

     @Override
    public void ejecutar() {
      System.out.println("Reproduciendo video");
    }

    @Override
    public void detener() {
      System.out.println("Deteniendo video");  
    }

    @Override
    public void rebobinar() {
      System.out.println("Rebobinando video");    
    }

    @Override
    public void avanzar() {
      System.out.println("avanzando video");     
    }

    @Override
    public void grabar() {
      System.out.println("Grabando video ");  
    }

}
