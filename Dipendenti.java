/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensaaziendale;



/**
 *
 * @author informatica
 */
public class Dipendenti implements Runnable{
     int ritardo;
    Bancone banco;
    

    public Dipendenti(int ritardo, Bancone banco) {
        this.ritardo = ritardo;
        this.banco = banco;
    }

    @Override
    public void run() {
       while(true){
       
           try {
               String s= banco.ConsumaPiatto();
               System.out.println("Consumato "+s);
               
               
               Thread.sleep(ritardo);
           } catch (InterruptedException ex) {
               System.out.println("Errore");
           }
       }
    }
}
