/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class SisiMiring {
    Scanner input = new Scanner(System.in);
    double a;
    double b;
    double c;
    
    public SisiMiring(){
        System.out.println("Masukkan nilai sisi A : ");
        a = input.nextInt();
        input.nextLine();
        System.out.println("Masukkan nilai sisi B : ");
        b = input.nextInt();
        input.nextLine();
        
        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("Sisi miring dari segitiga dengan sisi "+a+" dan "+b+" adalah " + c + "\n");
    }
}