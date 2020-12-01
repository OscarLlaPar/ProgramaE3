/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programae3;

/**
 *
 * @author oboss
 */
public class Cone {
    private float radius; //radius of the base
    private float height; //height of the cone

    public Cone(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    public Cone() {
    }
    
    

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    
    public float calculateVolume(){
        return ((float)Math.PI*(float)Math.pow(radius,2)*height )/3;
    }
}
