/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pinjam.powerbank;

/**
 *
 * @author nikol
 */
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private JTextField txtNama;
    private JTextField txtNim;

    private JComboBox<String> cbPowerbank;

    private JTextArea areaData;

    private LoanManager manager;

    public MainFrame() {

        manager = new LoanManager();

        setTitle("Sistem Peminjaman PowerBank");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponent();
    }

    private void initComponent() {

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JLabel lblNama = new JLabel("Nama");
        JLabel lblNim = new JLabel("NIM");

        txtNama = new JTextField();
        txtNim = new JTextField();

        cbPowerbank = new JComboBox<>();

        cbPowerbank.addItem("PB01 - 10000 mAh");
        cbPowerbank.addItem("PB02 - 15000 mAh");
        cbPowerbank.addItem("PB03 - 20000 mAh");

        JButton btnPinjam = new JButton("Pinjam");

        areaData = new JTextArea();

        JScrollPane scrollPane =
                new JScrollPane(areaData);

        panel.add(lblNama);
        panel.add(txtNama);

        panel.add(lblNim);
        panel.add(txtNim);

        panel.add(new JLabel("PowerBank"));
        panel.add(cbPowerbank);

        panel.add(btnPinjam);

        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        btnPinjam.addActionListener(e -> prosesPinjam());
    }

    private void prosesPinjam() {

        String nama = txtNama.getText();
        String nim = txtNim.getText();

        String pilihan =
                cbPowerbank.getSelectedItem().toString();

        String kode =
                pilihan.substring(0, 4);

        int kapasitas;

        if(kode.equals("PB01"))
            kapasitas = 10000;
        else if(kode.equals("PB02"))
            kapasitas = 15000;
        else
            kapasitas = 20000;

        User user = new User(nama, nim);

        PowerBank pb =
                new PowerBank(kode, kapasitas);

        Loan loan =
                new Loan(user, pb);

        manager.tambahPinjaman(loan);

        tampilkanData();
    }

    private void tampilkanData() {

        areaData.setText("");

        for(Loan l : manager.getDaftarPinjaman()) {

            areaData.append(
                l.toString() + "\n"
            );
        }
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
