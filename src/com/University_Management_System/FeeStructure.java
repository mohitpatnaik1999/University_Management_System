package com.University_Management_System;


import javax.swing.*;
import java.awt.*;

public class FeeStructure extends JFrame {

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
    JLabel i1;
    JLabel b1,b2,b3,b4,b5,b6,b7,b8;
    JLabel bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9,bb10,bb11,bb12,bb13,bb14,bb15,bb16,bb17,bb18;
    JLabel m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12;

    public FeeStructure(){

        setSize(5000,1000);
        setLocation(100,100);
        setLayout(null);

        i1 = new JLabel("Fee Structure");
        i1.setFont(new Font("serif",Font.ITALIC,50));
        i1.setBounds(600,10,400,70);
        add(i1);

        l1 = new JLabel("Course");
        l1.setBounds(75,100,100,40);
        l1.setFont(new Font("serif",Font.BOLD,20));
        add(l1);

        l2 = new JLabel("BTech");
        l2.setBounds(275,100,100,40);
        l2.setFont(new Font("serif",Font.BOLD,20));
        add(l2);

        l3 = new JLabel("BCA");
        l3.setBounds(475,100,100,40);
        l3.setFont(new Font("serif",Font.BOLD,20));
        add(l3);

        l4 = new JLabel("BBA");
        l4.setBounds(675,100,100,40);
        l4.setFont(new Font("serif",Font.BOLD,20));
        add(l4);

        bb5 = new JLabel("Rs 25000");
        bb5.setBounds(675,170,150,40);
        bb5.setFont(new Font("serif",Font.PLAIN,20));
        add(bb5);

        bb6 = new JLabel("Rs 25000");
        bb6.setBounds(675,240,150,40);
        bb6.setFont(new Font("serif",Font.PLAIN,20));
        add(bb6);

        bb7 = new JLabel("Rs 25000");
        bb7.setBounds(675,310,150,40);
        bb7.setFont(new Font("serif",Font.PLAIN,20));
        add(bb7);

        bb8 = new JLabel("Rs 25000");
        bb8.setBounds(675,380,150,40);
        bb8.setFont(new Font("serif",Font.PLAIN,20));
        add(bb8);

        bb13 = new JLabel("Rs 25000");
        bb13.setBounds(675,450,150,40);
        bb13.setFont(new Font("serif",Font.PLAIN,20));
        add(bb13);

        bb14 = new JLabel("Rs 25000");
        bb14.setBounds(675,520,150,40);
        bb14.setFont(new Font("serif",Font.PLAIN,20));
        add(bb14);

        l5 = new JLabel("Bsc");
        l5.setBounds(875,100,100,40);
        l5.setFont(new Font("serif",Font.BOLD,20));
        add(l5);

        bb9 = new JLabel("Rs 18000");
        bb9.setBounds(875,170,150,40);
        bb9.setFont(new Font("serif",Font.PLAIN,20));
        add(bb9);

        bb10 = new JLabel("Rs 18000");
        bb10.setBounds(875,240,150,40);
        bb10.setFont(new Font("serif",Font.PLAIN,20));
        add(bb10);

        bb11 = new JLabel("Rs 18000");
        bb11.setBounds(875,310,150,40);
        bb11.setFont(new Font("serif",Font.PLAIN,20));
        add(bb11);

        bb12 = new JLabel("Rs 18000");
        bb12.setBounds(875,380,150,40);
        bb12.setFont(new Font("serif",Font.PLAIN,20));
        add(bb12);

        bb15 = new JLabel("Rs 18000");
        bb15.setBounds(875,450,150,40);
        bb15.setFont(new Font("serif",Font.PLAIN,20));
        add(bb15);

        bb16 = new JLabel("Rs 18000");
        bb16.setBounds(875,520,150,40);
        bb16.setFont(new Font("serif",Font.PLAIN,20));
        add(bb16);

        l6 = new JLabel("MBA");
        l6.setBounds(1075,100,100,40);
        l6.setFont(new Font("serif",Font.BOLD,20));
        add(l6);

        m1 = new JLabel("Rs 65000");
        m1.setBounds(1075,170,150,40);
        m1.setFont(new Font("serif",Font.PLAIN,20));
        add(m1);

        m2 = new JLabel("Rs 65000");
        m2.setBounds(1075,240,150,40);
        m2.setFont(new Font("serif",Font.PLAIN,20));
        add(m2);

        m3 = new JLabel("Rs 65000");
        m3.setBounds(1075,310,150,40);
        m3.setFont(new Font("serif",Font.PLAIN,20));
        add(m3);

        m4 = new JLabel("Rs 65000");
        m4.setBounds(1075,380,150,40);
        m4.setFont(new Font("serif",Font.PLAIN,20));
        add(m4);

        l7 = new JLabel("MCA");
        l7.setBounds(1275,100,100,40);
        l7.setFont(new Font("serif",Font.BOLD,20));
        add(l7);

        m5 = new JLabel("Rs 55000");
        m5.setBounds(1275,170,150,40);
        m5.setFont(new Font("serif",Font.PLAIN,20));
        add(m5);

        m6 = new JLabel("Rs 55000");
        m6.setBounds(1275,240,150,40);
        m6.setFont(new Font("serif",Font.PLAIN,20));
        add(m6);

        m7 = new JLabel("Rs 55000");
        m7.setBounds(1275,310,150,40);
        m7.setFont(new Font("serif",Font.PLAIN,20));
        add(m7);

        m8 = new JLabel("Rs 55000");
        m8.setBounds(1275,380,150,40);
        m8.setFont(new Font("serif",Font.PLAIN,20));
        add(m8);

        l8 = new JLabel("MTech");
        l8.setBounds(1475,100,100,40);
        l8.setFont(new Font("serif",Font.BOLD,20));
        add(l8);

        m9 = new JLabel("Rs 81000");
        m9.setBounds(1475,170,150,40);
        m9.setFont(new Font("serif",Font.PLAIN,20));
        add(m9);

        m10 = new JLabel("Rs 81000");
        m10.setBounds(1475,240,150,40);
        m10.setFont(new Font("serif",Font.PLAIN,20));
        add(m10);

        m11 = new JLabel("Rs 81000");
        m11.setBounds(1475,310,150,40);
        m11.setFont(new Font("serif",Font.PLAIN,20));
        add(m11);

        m12 = new JLabel("Rs 81000");
        m12.setBounds(1475,380,150,40);
        m12.setFont(new Font("serif",Font.PLAIN,20));
        add(m12);

        l10 = new JLabel("Semester 1");
        l10.setBounds(75,170,150,40);
        l10.setFont(new Font("serif",Font.BOLD,20));
        add(l10);

        l11 = new JLabel("Semester 2");
        l11.setBounds(75,240,150,40);
        l11.setFont(new Font("serif",Font.BOLD,20));
        add(l11);

        l12 = new JLabel("Semester 3");
        l12.setBounds(75,310,150,40);
        l12.setFont(new Font("serif",Font.BOLD,20));
        add(l12);

        l13 = new JLabel("Semester 4");
        l13.setBounds(75,380,150,40);
        l13.setFont(new Font("serif",Font.BOLD,20));
        add(l13);

        l14 = new JLabel("Semester 5");
        l14.setBounds(75,450,150,40);
        l14.setFont(new Font("serif",Font.BOLD,20));
        add(l14);

        l15 = new JLabel("Semester 6");
        l15.setBounds(75,520,150,40);
        l15.setFont(new Font("serif",Font.BOLD,20));
        add(l15);

        l16 = new JLabel("Semester 7");
        l16.setBounds(75,590,150,40);
        l16.setFont(new Font("serif",Font.BOLD,20));
        add(l16);

        l17 = new JLabel("Semester 8");
        l17.setBounds(75,660,150,40);
        l17.setFont(new Font("serif",Font.BOLD,20));
        add(l17);


        b1 = new JLabel("Rs 43000");
        b1.setBounds(275,170,100,40);
        b1.setFont(new Font("serif",Font.PLAIN,20));
        add(b1);

        b2 = new JLabel("Rs 43000");
        b2.setBounds(275,240,100,40);
        b2.setFont(new Font("serif",Font.PLAIN,20));
        add(b2);

        b3 = new JLabel("Rs 43000");
        b3.setBounds(275,310,100,40);
        b3.setFont(new Font("serif",Font.PLAIN,20));
        add(b3);

        b4 = new JLabel("Rs 43000");
        b4.setBounds(275,380,100,40);
        b4.setFont(new Font("serif",Font.PLAIN,20));
        add(b4);

        b5 = new JLabel("Rs 43000");
        b5.setBounds(275,450,100,40);
        b5.setFont(new Font("serif",Font.PLAIN,20));
        add(b5);

        b6 = new JLabel("Rs 43000");
        b6.setBounds(275,520,100,40);
        b6.setFont(new Font("serif",Font.PLAIN,20));
        add(b6);

        b7 = new JLabel("Rs 43000");
        b7.setBounds(275,590,100,40);
        b7.setFont(new Font("serif",Font.PLAIN,20));
        add(b7);

        b8 = new JLabel("Rs 43000");
        b8.setBounds(275,660,100,40);
        b8.setFont(new Font("serif",Font.PLAIN,20));
        add(b8);


        bb1 = new JLabel("Rs 32000");
        bb1.setBounds(475,170,100,40);
        bb1.setFont(new Font("serif",Font.PLAIN,20));
        add(bb1);

        bb2 = new JLabel("Rs 32000");
        bb2.setBounds(475,240,100,40);
        bb2.setFont(new Font("serif",Font.PLAIN,20));
        add(bb2);

        bb3 = new JLabel("Rs 32000");
        bb3.setBounds(475,310,100,40);
        bb3.setFont(new Font("serif",Font.PLAIN,20));
        add(bb3);

        bb4 = new JLabel("Rs 32000");
        bb4.setBounds(475,380,100,40);
        bb4.setFont(new Font("serif",Font.PLAIN,20));
        add(bb4);

        bb17 = new JLabel("Rs 32000");
        bb17.setBounds(475,450,100,40);
        bb17.setFont(new Font("serif",Font.PLAIN,20));
        add(bb17);

        bb18 = new JLabel("Rs 32000");
        bb18.setBounds(475,520,100,40);
        bb18.setFont(new Font("serif",Font.PLAIN,20));
        add(bb18);

        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    public static void main(String[] args){
        new FeeStructure().setVisible(true);
    }
}

