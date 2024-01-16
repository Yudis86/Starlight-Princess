/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.game;

/**
 *
 * @author yudistira
 */
public class Game {

    public static void main(String[] args) {
        //objeck
        Player Hero = new Player();
        Player enemy = new Player();
        
        System.out.println("HERO READY");
        System.out.println("====================================");
        
        
        Hero.name = "TEDI";
        Hero.speed = 59;
        Hero.healthPoint = 100;
        Hero.damage = 2690;
        Hero.armor = 1480;
        
        Hero.run();
        Hero.attack();
        Hero.defend();
        
        System.out.println(" ");
         System.out.println("ENEMY READY");
        System.out.println("====================================");
        
        
        enemy.name = "RAFI";
        enemy.speed = 23;
        enemy.healthPoint = 0;
        enemy.damage = 2640;
        enemy.armor = 100;
        
        enemy.run();
        enemy.attack();
        enemy.defend();
        
        System.out.println("=============");
        System.out.println("HASIL");
        
           if(Hero.IsDead()){
            System.out.println("YOU WIN :)");
        }
        if(enemy.IsDead()){
            System.out.println("YOU LOSE :)");
        }
        System.out.println("=============");
    }
}
