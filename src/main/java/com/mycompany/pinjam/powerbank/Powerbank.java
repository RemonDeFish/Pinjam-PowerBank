/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pinjam.powerbank;

/**
 *
 * @author Raymond
 */
public class Powerbank {
    private String kode;
    private int kapasitas;
    
    public Powerbank(String kode, int kapasitas){
        this.kode = kode;
        this.kapasitas = kapasitas;
    }
    public String getKode(){
        return kode;
    }
    public int getKapasitas(){
        return kapasitas;
    }
    
    @Override
    public String toString(){
        return kode + " - " + kapasitas + " mAh";
    }
}