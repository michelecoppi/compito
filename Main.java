/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensaaziendale;

import java.util.Random;



/**
 *
 * @author informatica
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Bancone b= new Bancone(20);
        
        Thread Produttore = new Thread( new Cuoco(1000,b));
        Thread Consumatore = new Thread(new Dipendenti(1000,b));
        Produttore.start();
        Consumatore.start();
    }
    
}
