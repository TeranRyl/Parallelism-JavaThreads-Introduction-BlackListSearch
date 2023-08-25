/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {
    
    public static void main(String a[]){
        Thread hiloA = new Thread(new CountThread(0,100));
        Thread hiloB = new Thread(new CountThread(99, 200));
        Thread hiloC = new Thread(new CountThread(200, 300));
        hiloA.start();
        hiloB.start();
        hiloC.start();/*
        hiloA.run();
        hiloB.run();
        hiloC.run();*/
    }
    
}
