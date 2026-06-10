/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pinjam.powerbank;

/**
 *
 * @author nikol
 */
public class User {
    private String nama;
    private String NPM;
    
    public User(String nama, String NPM){
        this.nama = nama;
        this.NPM = NPM;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getNPM(){
        return NPM;
    }
    @Override
    public String toString(){
        return nama + "(" + NPM + ")";
    }
}
