/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pinjam.powerbank;

/**
 *
 * @author nikol
 */
import java.time.LocalDate;
public class Loan {
    private User user;
    private Powerbank powerBank;
    
    public Loan(User user, Powerbank powerBank){
        this.user = user;
        this.powerBank = powerBank;
    }
    
    public User getUser(){
        return user;
    }
    
    public Powerbank getPowerbank(){
        return powerBank;
    }
    
    @Override
    public String toString(){
        return user.getNama() + " meminjam " + powerBank.getKode();
    }
}
