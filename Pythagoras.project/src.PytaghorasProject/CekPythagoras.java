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
public class CekPythagoras {
    Scanner input = new Scanner(System.in);
    int a;
    int b;
    int c;
    
    public CekPythagoras(){
        System.out.println("Masukkan nilai sisi A : ");
        a = input.nextInt();
        input.nextLine();
        System.out.println("Masukkan nilai sisi B : ");
        b = input.nextInt();
        input.nextLine();
        System.out.println("Masukkan nilai sisi C : ");
        c = input.nextInt();
        input.nextLine();
        
        if(Math.pow(a,2)+Math.pow(b,2) == Math.pow(c,2)){
            System.out.println("Sisi A, B, dan C merupakan Triple Pythagoras\n");
        } else{
            System.out.println("Sisi A, B, dan C bukan merupakan Triple Phthagoras\n");
        }
    }
}