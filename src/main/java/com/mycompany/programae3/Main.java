/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programae3;

import java.util.Scanner;

/**
 *
 * @author Óscar Llamas Parra
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cone coneUser = new Cone();
        
        System.out.println("Introduzca el radio de la base del cono");
        Scanner reader = new Scanner(System.in);
        coneUser.setRadius(reader.nextFloat());
        
        System.out.println("Introduzca la altura del cono");
        reader = new Scanner(System.in);
        coneUser.setHeight(reader.nextFloat());
        
        System.out.println("El volumen del cono introducido por el usuario es:"+coneUser.calculateVolume());
        
        Cone coneSystem = new Cone(5,6);
        
        System.out.println("El volumen del cono del sistema es:"+coneSystem.calculateVolume());
    }
    
}
