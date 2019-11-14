/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo4.latihan1;

/**
 *
 * @author necha
 */
public class AeroPlan extends Vehicle {
    public void walk(){
        System.out.println("Aeroplan is Flaying");
    }
    public void fuel(){
        System.out.println("Bensin");
    }
    public static void main(String[] args) {
        AeroPlan garuda = new AeroPlan();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
}
