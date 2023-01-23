//package View;
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.*;
//
//public class GUI {
//    JFrame LogReg = new JFrame();
//    JRadioButton radioadmin = new JRadioButton();
//    JRadioButton radiouser = new JRadioButton();
//    JLabel labelnamalogin, labelpasswordlogin, labelnamadaftar, labelnama, labelkodeakun, labelpassword,
//    labelnohp, labelfilm;
//    JTextField textnamalogin, textnpmdaftar, textnama, textkodeakun, textpassword, textnohp, textfilm;
//    JPasswordField passwordlogin;
//    JButton check = new JButton();
//    JLabel login,daftar,top;
//    
//    public GUI(){
//        LogReg.setSize(700, 430);
//        LogReg.setLayout(null);
//        LogReg.setVisible(true);
//        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        LogReg.setLocationRelativeTo(null);
//        LogReg.getContentPane().setBackground(Color.pink);
//        
//        top = new JLabel("Cinema Megcip 5D");
//        top.setBounds(170, 10, 600, 50);
//        top.setFont(new Font("Times New Roman", Font.BOLD,40));
//        LogReg.add(top);
//        
//        login = new JLabel ("Login");
//        login.setBounds(100, 50, 100,100);
//        login.setFont(new Font("Times New Roman", Font.BOLD, 30));
//        LogReg.add(login);
//        
//        radioadmin = new JRadioButton("Admin");//asisten lab
//        radioadmin.setBounds(30, 150, 100, 30);
//        radioadmin.setBackground(Color.CYAN);
//        LogReg.add(radioadmin);
//        
//        radiouser = new JRadioButton("Pemesan");//praktikan
//        radiouser.setBounds(140, 150, 100, 30);
//        radiouser.setBackground(Color.CYAN);
//        LogReg.add(radiouser);
//        
//        //============Login Akun=============//
//        labelnamalogin = new JLabel("Nama");
//        labelnamalogin.setBounds(30,180,200,30);
//        LogReg.add(labelnamalogin);
//        
//        textnamalogin = new JTextField();
//        textnamalogin.setBounds(30,210,200,30);
//        LogReg.add(textnamalogin);
//        
//        labelpasswordlogin = new JLabel("Password");
//        labelpasswordlogin.setBounds(30,240,100,30);
//        LogReg.add(labelpasswordlogin);
//        
//        passwordlogin = new JPasswordField();
//        passwordlogin.setBounds(30,270,200,30);
//        LogReg.add(passwordlogin);
//        
//        check = new JButton("check");
//        check.setBounds(90,320,100,40);
//        check.setBackground(Color.GREEN);
//        LogReg.add(check);
//        
//        //=============Registrasi Akun=============//
//        daftar = new JLabel("Registrasi Akun");
//        daftar.setFont(new Font("Times New Roman",Font.BOLD,28));
//        daftar.setBounds(400, 50, 200,100);
//        LogReg.add(daftar);
//        
//        labelnamadaftar = new JLabel("Nama");
//        labelnamadaftar.setBounds(400, 140, 100, 30);
//        LogReg.add(labelnamadaftar);
//        
//        textnpmdaftar = new JTextField();
//        textnpmdaftar.setBounds(400,165,200,30);
//        LogReg.add(textnpmdaftar);
//        
////        labelnama = new JLabel("KODE AKUN");
////        labelnama.setBounds(400, 190, 100, 30);
////        LogReg.add(labelnama);
////        
////        textnama = new JTextField();
////        textnama.setBounds(400,215,200,30);
////        LogReg.add(textnama);
//        
//        labelpassword = new JLabel("Password");
//        labelpassword.setBounds(400, 190, 100, 30);
//        LogReg.add(labelpassword);
//        
//        textpassword = new JPasswordField();
//        textpassword.setBounds(400,215,200,30);
//        LogReg.add(textpassword);
//        
//        labelnohp = new JLabel("Nomor Handphone");
//        labelnohp.setBounds(400,240,200,30);
//        LogReg.add(labelnohp);
//        
//        textnohp = new JTextField();
//        textnohp.setBounds(400,265,200,30);
//        LogReg.add(textnohp);
//        
////        labelfilm = new JLabel("FILM");
////        labelfilm.setBounds(400,340,200,30);
////        LogReg.add(labelfilm);
////        
////        textfilm = new JTextField();
////        textfilm.setBounds(400,365,200,30);
////        LogReg.add(textfilm);
//        
//        check = new JButton("Daftar");
//        check.setBounds(450,320,100,40);
//        check.setBackground(Color.GREEN);
//        LogReg.add(check);
//        
//        LogReg.setVisible(true);
//        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        LogReg.setLocationRelativeTo(null);
//        
//        radioadmin.addActionListener(new ActionListener()
//        {
//            @Override
//            public void actionPerformed(ActionEvent ae){
//                if(radioadmin.isSelected()){
//                    radiouser.setSelected(false);
//                }
//            }
//        });
//        radiouser.addActionListener(new ActionListener()
//        {
//            @Override
//            public void actionPerformed(ActionEvent ae){
//                if(radiouser.isSelected()){
//                    radioadmin.setSelected(false);
//                }
//            }
//        });
//    }
//}

package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import View.Allobjctrl;

public class GUIi {

    JFrame TampilanAwal = new JFrame();
    JLabel login, daftar, top;
    JRadioButton radiopenjual, radiopembeli;
    JTextField textnamalogin, textnamadaftar, textnotelp;
    JLabel labelnamalogin, labelpasswordlogin, labelnamadaftar, labelpassworddaftar, labelnotelp;
    JButton check, reg, update;
    JPasswordField passwordlogin, passworddaftar;
    private boolean ceklogin = false;

    public GUIi() {
        TampilanAwal.setSize(680, 470);
        TampilanAwal.setLayout(null);
        TampilanAwal.getContentPane().setBackground(Color.YELLOW);

        top = new JLabel("Cinema Megcip 5D");
        top.setBounds(100, 10, 600, 50);
        top.setFont(new Font("Times New Roman", Font.BOLD, 40));
        TampilanAwal.add(top);

        login = new JLabel("Log In");
        login.setBounds(85, 50, 100, 100);
        login.setFont(new Font("Times New Roman", Font.BOLD, 30));
        TampilanAwal.add(login);

        radiopenjual = new JRadioButton("Admin");
        radiopenjual.setBounds(30, 150, 80, 30);
        radiopenjual.setBackground(Color.LIGHT_GRAY);
        TampilanAwal.add(radiopenjual);

        radiopembeli = new JRadioButton("User");
        radiopembeli.setBounds(150, 150, 80, 30);
        radiopembeli.setBackground(Color.LIGHT_GRAY);
        TampilanAwal.add(radiopembeli);

        labelnamalogin = new JLabel("Nama");
        labelnamalogin.setBounds(30, 180, 50, 30);
        TampilanAwal.add(labelnamalogin);

        textnamalogin = new JTextField();
        textnamalogin.setBounds(30, 210, 200, 30);
        TampilanAwal.add(textnamalogin);

        labelpasswordlogin = new JLabel("Password");
        labelpasswordlogin.setBounds(30, 240, 100, 30);
        TampilanAwal.add(labelpasswordlogin);

        passwordlogin = new JPasswordField();
        passwordlogin.setBounds(30, 270, 200, 30);
        TampilanAwal.add(passwordlogin);

        check = new JButton("check");
        check.setBounds(90, 320, 100, 40);
        check.setBackground(Color.LIGHT_GRAY);
        TampilanAwal.add(check);

        update = new JButton("UPDATE");
        update.setBounds(90, 370, 100, 40);
        update.setBackground(Color.LIGHT_GRAY);
        TampilanAwal.add(update);

        daftar = new JLabel("Daftar");
        daftar.setFont(new Font("Times New Roman", Font.BOLD, 30));
        daftar.setBounds(460, 50, 150, 100);
        TampilanAwal.add(daftar);

        labelnamadaftar = new JLabel("Nama");
        labelnamadaftar.setBounds(400, 150, 50, 30);
        TampilanAwal.add(labelnamadaftar);
        textnamadaftar = new JTextField();
        textnamadaftar.setBounds(400, 180, 200, 30);
        TampilanAwal.add(textnamadaftar);
        labelpassworddaftar = new JLabel("Password");
        labelpassworddaftar.setBounds(400, 210, 100, 30);
        TampilanAwal.add(labelpassworddaftar);
        passworddaftar = new JPasswordField();
        passworddaftar.setBounds(400, 240, 200, 30);
        TampilanAwal.add(passworddaftar);
        labelnotelp = new JLabel("No Telp");
        labelnotelp.setBounds(400, 270, 100, 30);
        TampilanAwal.add(labelnotelp);
        textnotelp = new JTextField();
        textnotelp.setBounds(400, 300, 200, 30);
        TampilanAwal.add(textnotelp);
        reg = new JButton("Daftar");
        reg.setBounds(460, 350, 100, 40);
        reg.setBackground(Color.LIGHT_GRAY);
        TampilanAwal.add(reg);
        TampilanAwal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TampilanAwal.setVisible(true);
        TampilanAwal.setLocationRelativeTo(null);

        radiopenjual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (radiopenjual.isSelected()) {
                    radiopembeli.setSelected(false);
                    ceklogin = true;
                }
            }

        });
        radiopembeli.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (radiopembeli.isSelected()) {
                    radiopenjual.setSelected(false);
                    ceklogin = false;
                }
            }

        });
        check.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (ceklogin == true) {
                    try {
                        Allobjctrl.admin.dataPenjual();
                        Allobjctrl.admin.login(textnamalogin.getText(), passwordlogin.getText());
                        String nama = Allobjctrl.admin.penjualEntity().getNama();
                        JOptionPane.showMessageDialog(null, "Selamat datang " + nama, "information", JOptionPane.INFORMATION_MESSAGE);
                        PenjualGUI penj = new PenjualGUI();
                        TampilanAwal.dispose();

                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(null, "Nama atau Password salah", "information", JOptionPane.INFORMATION_MESSAGE);
                    }
                    kosong();
                } else {
                    try {

                        Allobjctrl.pemesan.login(textnamalogin.getText(), passwordlogin.getText());
                        String nama = Allobjctrl.pemesan.pembeliEntity().getNama();
                        JOptionPane.showMessageDialog(null, "Selamat datang " + nama, "information", JOptionPane.INFORMATION_MESSAGE);
                        PemesanGUI pemb = new PemesanGUI();
                        TampilanAwal.dispose();
                    } catch (Exception eception) {
                        JOptionPane.showMessageDialog(null, "Nama atau Password salah", "information", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                }
            }

        });

        update.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                UpdateGUI update = new UpdateGUI();
                TampilanAwal.dispose();
            }

        });

        reg.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String nama = textnamadaftar.getText();
                    String pass = passworddaftar.getText();
                    String notelp = textnotelp.getText();

                    Allobjctrl.pemesan.insert(nama, pass, notelp);
                    JOptionPane.showMessageDialog(null, "Registrasi sukses", "information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Registrasi Gagal", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        });
    }

    void kosong() {
        textnamadaftar.setText(null);
        passworddaftar.setText(null);
        textnamalogin.setText(null);
        textnotelp.setText(null);
        passwordlogin.setText(null);

    }
}
