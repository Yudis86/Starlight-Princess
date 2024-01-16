/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game;

/**
 *
 * @author yudistira
 */
public class Player {
    
    //Atribut
    String name;
    int speed, healthPoint, damage, armor;
    
    //Method
    void run(){
        System.out.println(name+" is Running ...");
        System.out.println("speed "+speed);
    }
    void attack(){
        System.out.println(name+" is damage ...");
        System.out.println("damage "+damage);
    }
    void defend(){
        System.out.println(name+" is defend ...");
        System.out.println("armor "+armor);
    }
    
    
    
    
    boolean IsDead(){
        if(healthPoint<=0)return true;
        return false;
    }
    
    
    
}
