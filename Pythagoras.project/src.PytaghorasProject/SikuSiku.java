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
public class SikuSiku {
    Scanner input = new Scanner(System.in);
    double a;
    double b;
    double c;
    
    public SikuSiku(){
        System.out.println("Masukkan nilai sisi A : ");
        a = input.nextInt();
        input.nextLine();
        System.out.println("Masukkan niai sisi C : ");
        c = input.nextInt();
        input.nextLine();
        
        b = Math.sqrt(Math.pow(c,2)-Math.pow(a,2));
        System.out.println("Sisi siku-siku dari segitiga dengan sisi "+a+" dan "+c+"adalah : " + b + "\n");
    }
}