package View;

import Entity.FilmEntity;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PemesanGUI {

    JFrame pemesan = new JFrame();
    JButton back, daftarbtn;
    JTextArea area = new JTextArea();
    JLabel datadiri, daftarFilm;
    JComboBox pilFilm = new JComboBox(FilmEntity.film);
    int cek = Allobjctrl.pemesan.cekDaftarPemesan(Allobjctrl.pemesan.getData().getNama());

    public PemesanGUI() {
        pemesan.setSize(720, 600);
        pemesan.setLayout(null);
        pemesan.getContentPane().setBackground(Color.BLUE);

        datadiri = new JLabel("Data pemesan");
        datadiri.setFont(new Font("Timer New Roman", Font.BOLD, 30));
        datadiri.setBounds(90, 30, 200, 30);
        pemesan.add(datadiri);
        area.setBounds(30, 90, 400, 300);
        pemesan.add(area);

        daftarFilm = new JLabel("Daftar Film");
        daftarFilm.setBounds(450, 30, 250, 30);
        daftarFilm.setFont(new Font("Times New Roman", Font.BOLD, 30));
        pemesan.add(daftarFilm);
        pilFilm.setBounds(450, 90, 230, 30);
        pemesan.add(pilFilm);

        daftarbtn = new JButton("Daftar");
        daftarbtn.setBounds(500, 200, 100, 30);
        daftarbtn.setBackground(Color.GRAY);
        pemesan.add(daftarbtn);

        back = new JButton("Back");
        back.setBounds(30, 500, 100, 30);
        back.setBackground(Color.GRAY);
        pemesan.add(back);

        pemesan.setVisible(true);
        pemesan.setLocationRelativeTo(null);
        pemesan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        if (cek == -1) {
            JOptionPane.showMessageDialog(null, "Anda Belum Daftar Film", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else if (cek == -2) {
            JOptionPane.showMessageDialog(null, "Anda Belum Daftar Film", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            area.setText(datapembeli());
        }
        daftarbtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                int indexfilm = pilFilm.getSelectedIndex();
                Allobjctrl.pemesan.daftarfilm(indexfilm, Allobjctrl.pemesan.getData(), false);
                area.setText(datapembeli());
            }

        });
        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                pemesan.dispose();
                GUIi men = new GUIi();
            }

        });
    }

    String datapembeli() {
        int cek = Allobjctrl.pemesan.cekDaftarPemesan(Allobjctrl.pemesan.getData().getNama());
        String cekverif;
        if (Allobjctrl.pemesan.showDaftarPemesan(cek).isIsVerified() == false) {
            cekverif = "belum di verifikasi";
        } else {
            cekverif = "Sudah di verifikasi";
        }
        String text = "Nama = " + Allobjctrl.pemesan.showDaftarPemesan(cek).getPembeli().getNama() + "\n"
                + "No Telp = " + Allobjctrl.pemesan.showDaftarPemesan(cek).getPembeli().getNotelp() + "\n"
                + "Verifikasi = " + cekverif + "\n"
                + "Film = " + FilmEntity.film[Allobjctrl.pemesan.showDaftarPemesan(cek).getIndexFilm()];
        return text;
    }
}
