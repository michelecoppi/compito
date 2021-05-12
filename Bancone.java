/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensaaziendale;

import java.util.LinkedList;


/**
 *
 * @author informatica
 */
public class Bancone {
    LinkedList<String> lista= new LinkedList();
    int sizeMax;

    public Bancone(int sizeMax) {
        this.sizeMax = sizeMax;
    }
    
    public  boolean isVuoto(){
     return lista.isEmpty();
 }
    
    public boolean isPieno(){
    return lista.size()>=sizeMax;
    }
    
    public synchronized void ProduciPiatto(String piatto){
    if(isPieno()){
        try {
            wait();
        } catch (InterruptedException ex) {
            System.out.println("Errore");
        }
        
    }
       lista.addFirst(piatto);
        notifyAll();     
    }
    
 public synchronized String ConsumaPiatto(){
    if(isVuoto()){
        try {
            wait();
        } catch (InterruptedException ex) {
            System.out.println("Errore");
        }
       
    }
 String s= lista.removeFirst();
        notifyAll();
        return s;
}
    
}
