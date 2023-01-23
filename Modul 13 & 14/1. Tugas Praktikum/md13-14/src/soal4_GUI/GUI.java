package soal4_GUI;

//import java.awt.Color;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JRadioButton;
//
//public class GUI {
//    JFrame LogReg = new JFrame();
//    JRadioButton radioangka = new JRadioButton();
//    JRadioButton radioangka2 = new JRadioButton();
//    JRadioButton radioangka3 = new JRadioButton();
//    JRadioButton radioangka4 = new JRadioButton();
//    JRadioButton radioangka5 = new JRadioButton();
//    JLabel login,daftar,top;
//    
//    public GUI(){
//        LogReg.setSize(700, 630);
//        LogReg.setLayout(null);
//        LogReg.setVisible(true);
//        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        LogReg.setLocationRelativeTo(null);
//        LogReg.getContentPane().setBackground(Color.BLUE);
//        
//        top = new JLabel("1");
//        top.setBounds(340, 50, 600, 50);
//        top.setFont(new Font("Times New Roman", Font.BOLD,40));
//        LogReg.add(top);
//        
//        radioangka = new JRadioButton("+1");
//        radioangka.setBounds(200, 150, 100, 30);
//        radioangka.setBackground(Color.YELLOW);
//        LogReg.add(radioangka);
//        
//        radioangka2 = new JRadioButton("+3");
//        radioangka2.setBounds(400, 150, 100, 30);
//        radioangka2.setBackground(Color.YELLOW);
//        LogReg.add(radioangka2);
//        
//        radioangka3 = new JRadioButton("-1");
//        radioangka3.setBounds(200, 200, 100, 30);
//        radioangka3.setBackground(Color.CYAN);
//        LogReg.add(radioangka3);
//        
//        radioangka4 = new JRadioButton("-3");
//        radioangka4.setBounds(400, 200, 100, 30);
//        radioangka4.setBackground(Color.CYAN);
//        LogReg.add(radioangka4);
//        
//        radioangka5 = new JRadioButton("x2");
//        radioangka5.setBounds(300, 300, 100, 30);
//        radioangka5.setBackground(Color.GRAY);
//        LogReg.add(radioangka5);
//        
//        LogReg.setVisible(true);
//        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        LogReg.setLocationRelativeTo(null);
//        
//        radioangka.addActionListener(new ActionListener()
//        {
//            @Override
//            public void actionPerformed(ActionEvent ae){
//                if(radioangka.isSelected()){
//                    radioangka2.setSelected(false);
//                }
//            }
//        });
//        
//        radioangka2.addActionListener(new ActionListener()
//        {
//            @Override
//            public void actionPerformed(ActionEvent ae){
//                if(radioangka2.isSelected()){
//                    radioangka.setSelected(false);
//                }
//            }
//        });
//        
//        radioangka3.addActionListener(new ActionListener()
//        {
//            @Override
//            public void actionPerformed(ActionEvent ae){
//                if(radioangka3.isSelected()){
//                    radioangka4.setSelected(false);
//                }
//            }
//        });
//        
//        radioangka4.addActionListener(new ActionListener()
//        {
//            @Override
//            public void actionPerformed(ActionEvent ae){
//                if(radioangka4.isSelected()){
//                    radioangka3.setSelected(false);
//                }
//            }
//        });
//        
//        LogReg.setVisible(true);
//        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        LogReg.setLocationRelativeTo(null);
//    }
//}

//package button;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI extends JFrame{

    private JButton btn_tambah1;
    private JButton btn_tambah3;
    private JButton btn_kurang1;
    private JButton btn_kurang3;
    private JButton btn_kali2;
    private JLabel lbl_angka;
    private JPanel formPanel;
    private int num=1;
    private Font mainFont=new Font("serif",Font.BOLD,30);
    public GUI()
    {
        setTitle("halo");
        setSize(400,200);
        setLayout(null);
        
        form();
        event();
    }
    public void form()
    {
        
        lbl_angka=new JLabel("1");
        lbl_angka.setBounds(161,30, 100,30);
        lbl_angka.setFont(mainFont);
        add(lbl_angka);
        
        btn_tambah1=new JButton("+1");
        btn_tambah1.setBounds(35, 60, 100,30);
        add(btn_tambah1);
            
         btn_tambah3=new JButton("+3");
        btn_tambah3.setBounds(200, 60, 100,30);
        add(btn_tambah3);
        
         btn_kurang1=new JButton("-1");
        btn_kurang1.setBounds(35, 130, 100,30);
        add(btn_kurang1);
        
         btn_kurang3=new JButton("-3");
        btn_kurang3.setBounds(200,130, 100,30);
        add(btn_kurang3);
        
        btn_kali2=new JButton("x2");
        btn_kali2.setBounds(120,200, 100,30);
        add(btn_kali2);
         
    }
    public static void main(String[] args) {
       GUI o=new GUI();
       o.setVisible(true);
    }

    private void event() {
     btn_tambah1.addActionListener((e)->{
         num+=1;
         String numstr=String.valueOf(num);
         lbl_angka.setText(numstr);
     });
     btn_tambah3.addActionListener((e)->{
         num+=3;
         String numStr=String.valueOf(num);
         lbl_angka.setText(numStr);     
     });
     btn_kurang1.addActionListener((e)->{
         num-=1;
         String numStr=String.valueOf(num);
         lbl_angka.setText(numStr);
     });
     btn_kurang3.addActionListener((e)-> {
         num-=3;
         String numStr=String.valueOf(num);
         lbl_angka.setText(numStr);
     });
     btn_kali2.addActionListener((e)-> {
         num*=2;
         String numStr=String.valueOf(num);
         lbl_angka.setText(numStr);
     });
    }
}