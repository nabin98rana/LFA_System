/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navin.lfas;

import com.navin.lfas.view.AbstractView;
import com.navin.lfas.view.ViewFactory;
import java.util.Scanner;

/**
 *
 * @author Navin
 */
public class Program {
    public static void menu(){
        System.out.println("|**********************|");
        System.out.println(" WELCOME TO LFA SYSTEM");
        System.out.println("|**********************|");
        System.out.println("1. COURSE");
        System.out.println("2. FACILITATOR");
        System.out.println("3. STUDENT");
        System.out.println("4. EXIT");
        
        System.out.println("ENTER YOUR CHOICE [1-4]:");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       while(true){
       menu();
           AbstractView view=ViewFactory.get(input.next());
           if(view!=null){
               view.setInput(input);
           view.controller();
           }
           else{
               System.out.println("IINVALID CHOICE PLEASE ENTER AGAIN");
           }
       }
    }

}
