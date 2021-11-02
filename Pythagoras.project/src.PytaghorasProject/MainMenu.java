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
public class MainMenu {
    int menu;
    char loop;
    
    void Menu(){
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("1. Cek triple pythagoras");
            System.out.println("2. Menentukan sisi miring segitiga");
            System.out.println("3. Menentukan sisi siku-siku segitiga");
            System.out.println("4. Exit");
            System.out.println("Pilih nomor menu : ");
            menu = input.nextInt();
            input.nextLine();
            switch(menu){
                case 1:
                    System.out.println("\nMengecek Triple Pythagoras\n");
                    CekPythagoras p = new CekPythagoras();
                    break;
                case 2:
                    System.out.println("\nMencari sisi miring\n");
                    SisiMiring sm = new SisiMiring();
                    break;
                case 3:
                    System.out.println("\nMencari sisi siku-siku\n");
                    SikuSiku ss = new SikuSiku();
                    break;
                case 4:
                    System.exit(0);
            }        
        }while(loop != 'x');
    }
}