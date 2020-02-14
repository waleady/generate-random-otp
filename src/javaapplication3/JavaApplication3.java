/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author waleed
 */
import java.util.*;
public class JavaApplication3 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int counter;
        Random rnum = new Random();
        System.out.println("Random numbers:");
        for (counter =1; counter <=2; counter++){
            System.out.println(rnum.nextInt(200));
        }
    }
    
}
