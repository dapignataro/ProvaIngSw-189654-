package it.unical.ingsw2020.ProvaIngsw;

import java.util.ArrayList;
import java.util.Random;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Random r  = new Random();
        
        ArrayList<Integer> numeri = new ArrayList<Integer>();
        for(int i = 0; i < 20; i++) {
        	numeri.add(r.nextInt(100)+1);
        }
     
        MyListUtil m = new MyListUtil();
        
        //Ordina in modo crescente
        numeri = m.ordinaNumeri(numeri,'c');
        
        //Ordina in modo decrescente
        //numeri = m.ordinaNumeri(numeri,'d');
        
        
        for(int i = 0; i < numeri.size(); i++) {
        	System.out.println(numeri.get(i));
        }
    }
}
