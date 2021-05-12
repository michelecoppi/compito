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
public class Cuoco implements Runnable{
    int ritardo;
    Bancone banco;
     public static int a=1;

    public Cuoco(int ritardo, Bancone banco) {
        this.ritardo = ritardo;
        this.banco = banco;
    }

    @Override
    public void run() {
     while(true){
         try {
             String s="piatto numero "+a;
             banco.ProduciPiatto(s);
             System.out.println("Prodotto "+s);
             a++;
             Thread.sleep(ritardo);
         } catch (InterruptedException ex) {
             System.out.println("Errore");
         }
     
     
     }
    }

    public int getA() {
        return a;
    }
    
    
}
