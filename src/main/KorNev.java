
package main;

import java.util.Scanner;


public class KorNev {

    static Scanner scanner= new Scanner (System.in);
    
    public static void main(String[] args) {
        //én megoldásom
        
        int kor =0;
        String nev = "";
        boolean jo=false;
        while(!jo){
            System.out.println("Add meg az életkord: ");
            kor=scanner.nextInt();
            
            scanner.nextLine();
            System.out.println("Adj me egy neved: ");
            nev=scanner.nextLine();
            
            jo=kor>6 && nev.length()>=3;
        }
        System.out.println("Azéletkorod: "+kor);
        System.out.println("A neved: "+nev);
        
        
        
    }
    
}
