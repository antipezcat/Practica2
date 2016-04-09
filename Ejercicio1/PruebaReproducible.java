/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abollaita
 */
public class PruebaReproducible  {
    ArrayList<ReproductorMedia> lista =new ArrayList<>();
    Audio audio;
    Video video;
    public void instanciandoAudio( ){
        audio = new Audio();
        lista.add(audio);
    }
    
    public void instanciandoVideo ( ){
        video = new Video();
        lista.add(video);
    }
    
    public void procesarRepoductoresMedia(List<ReproductorMedia> lista){
     
     for (int i = 0 ; i < lista.size(); i++){ 
         lista.get(i).ejecutar();
         lista.get(i).detener();
         lista.get(i).rebobinar();
         lista.get(i).avanzar();
         lista.get(i).grabar();
    }
    
 }

}
