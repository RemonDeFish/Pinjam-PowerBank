/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pinjam.powerbank;
import java.util.ArrayList;
/**
 *
 * @author Raymond
 */

    

public class LoanManager {

    private ArrayList<Loan> daftarPinjaman;

    public LoanManager() {
        daftarPinjaman = new ArrayList<>();
    }
    public void tambahPinjaman(Loan loan) {
        daftarPinjaman.add(loan);
    }
    public ArrayList<Loan> getDaftarPinjaman() {
        return daftarPinjaman;
    }
}
