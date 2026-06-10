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
    private String NIM;
    
    public User(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getNIM(){
        return NIM;
    }
    @Override
    public String toString(){
        return nama + "(" + NIM + ")";
    }
}
