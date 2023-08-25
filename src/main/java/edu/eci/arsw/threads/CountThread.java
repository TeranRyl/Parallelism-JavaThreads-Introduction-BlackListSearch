/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

import java.util.Arrays;

/**
 *
 * @author hcadavid
 */
public class CountThread implements Runnable {
    private final int inicio;
    private final int fin;

    public CountThread(int inicio, int fin){
        this.inicio = inicio;
        this.fin = fin;
    }
    @Override
    public void run() {
        System.out.println("Ejecutando hilo...");
        for (int i = inicio; i < fin; i++){
            System.out.println("Hilo: " + Thread.currentThread().threadId() + ", Numero: " + i);
        }

    }
}
