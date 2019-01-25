/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exponente;

import java.util.Scanner;

/**
 *
 * @author COMPUTACION
 */
public class Exponente {
Scanner resultado = new Scanner(System.in);
int f;
int base;
  public Exponente(int f, int base) {
        this.f = f;
        this.base = base;
    }
   public float Exponente(){
        int r;
        r=(int) Math.pow(base, f);
        return r;
    }   
}
