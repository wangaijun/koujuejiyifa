package com.company;

import com.sun.javafx.css.Size;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("谐音记忆法只适于帮助我们记忆一些抽象、难记的材料，并不能推而广之，用于记忆所有的材料。");

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        final JTextField jTextField1 = new JTextField("");
        jTextField1.setSize(300,50);
        jTextField1.setLocation(10,0);
        Map map = new HashMap();
        map.put(TextAttribute.SIZE,24);
        Font font = new Font(map);
        jTextField1.setFont(font);
        frame.add(jTextField1);

        final JTextField jTextField2 = new JTextField("");
        jTextField2.setSize(300,50);
        jTextField2.setLocation(320,0);
        jTextField2.setFont(font);
        frame.add(jTextField2);

        final JTextField jTextField3 = new JTextField("");
        jTextField3.setSize(300,50);
        jTextField3.setLocation(630,0);
        jTextField3.setFont(font);
        frame.add(jTextField3);

        final JTextField jTextField4 = new JTextField("");
        jTextField4.setSize(300,50);
        jTextField4.setLocation(940,0);
        jTextField4.setFont(font);
        frame.add(jTextField4);

        final JTextField jTextField5 = new JTextField("");
        jTextField5.setSize(300,50);
        jTextField5.setLocation(1250,0);
        jTextField5.setFont(font);
        frame.add(jTextField5);

        final JTextField jTextField6 = new JTextField("");
        jTextField6.setSize(300,50);
        jTextField6.setLocation(10,60);
        jTextField6.setFont(font);
        frame.add(jTextField6);

        final JTextField jTextField7 = new JTextField("");
        jTextField7.setSize(300,50);
        jTextField7.setLocation(320,60);
        jTextField7.setFont(font);
        frame.add(jTextField7);

        final JTextField jTextField8 = new JTextField("");
        jTextField8.setSize(300,50);
        jTextField8.setLocation(630,60);
        jTextField8.setFont(font);
        frame.add(jTextField8);

        final JTextField jTextField9 = new JTextField("");
        jTextField9.setSize(300,50);
        jTextField9.setLocation(940,60);
        jTextField9.setFont(font);
        frame.add(jTextField9);

        final JTextField jTextField10 = new JTextField("");
        jTextField10.setSize(300,50);
        jTextField10.setLocation(1250,60);
        jTextField10.setFont(font);
        frame.add(jTextField10);

        JButton jButton = new JButton("确定");
        jButton.setSize(300,50);
        jButton.setLocation(10,120);
        jButton.setFont(font);
        frame.add(jButton);

        JButton jButton2 = new JButton("置空");
        jButton2.setSize(300,50);
        jButton2.setLocation(320,120);
        jButton2.setFont(font);
        frame.add(jButton2);

        final JTextArea jTextArea = new JTextArea();
        jTextArea.setSize(1540,720);
        jTextArea.setLocation(10,180);
        jTextArea.setFont(font);
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jScrollPane.setSize(1540,720);
        jScrollPane.setLocation(10,180);
        frame.add(jScrollPane);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField[] jTextFields;
                String text = jTextField10.getText();
                if(text!=null && !text.trim().equals("")){
                    jTextFields = new JTextField[] {jTextField1,jTextField2,jTextField3,jTextField4,jTextField5,
                            jTextField6,jTextField7,jTextField8,jTextField9,jTextField10};
                }
                else if((text=jTextField9.getText())!=null && !text.trim().equals("")){
                    jTextFields = new JTextField[] {jTextField1,jTextField2,jTextField3,jTextField4,jTextField5,
                            jTextField6,jTextField7,jTextField8,jTextField9};
                }
                else if((text=jTextField8.getText())!=null && !text.trim().equals("")){
                    jTextFields = new JTextField[] {jTextField1,jTextField2,jTextField3,jTextField4,jTextField5,
                            jTextField6,jTextField7,jTextField8};
                }
                else if((text=jTextField7.getText())!=null && !text.trim().equals("")){
                    jTextFields = new JTextField[] {jTextField1,jTextField2,jTextField3,jTextField4,jTextField5,
                            jTextField6,jTextField7};
                }
                else if((text=jTextField6.getText())!=null && !text.trim().equals("")){
                    jTextFields = new JTextField[] {jTextField1,jTextField2,jTextField3,jTextField4,jTextField5,
                            jTextField6};
                }
                else if((text=jTextField5.getText())!=null && !text.trim().equals("")){
                    jTextFields = new JTextField[] {jTextField1,jTextField2,jTextField3,jTextField4,jTextField5
                            };
                }
                else if((text=jTextField4.getText())!=null && !text.trim().equals("")){
                    jTextFields = new JTextField[] {jTextField1,jTextField2,jTextField3,jTextField4};
                }
                else if((text=jTextField3.getText())!=null && !text.trim().equals("")){
                    jTextFields = new JTextField[] {jTextField1,jTextField2,jTextField3};
                }
                else if((text=jTextField2.getText())!=null && !text.trim().equals("")){
                    jTextFields = new JTextField[] {jTextField1,jTextField2};
                }
                else if((text=jTextField1.getText())!=null && !text.trim().equals("")){
                    jTextFields = new JTextField[] {jTextField1};
                }
                else{
                    jTextFields = new JTextField[]{};
                }

                text = "";
                for (int i = 0; i < jTextFields.length; i++) {
                    text += jTextFields[i].getText();
                    text +="\r\n";
                }
                try {
                    FileWriter fileWriter = new FileWriter("in.txt");
                    fileWriter.write(text);
                    fileWriter.flush();
                    fileWriter.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                try {
                    FileReader fileReader = new FileReader("in.txt");
                    char[] buf = new char[1024];
                    int len = fileReader.read(buf);
                    String string = new String(buf,0,len);
                    String[] strs = string.split("\r\n");
                    String[] strings = {" "," "," "," "," "," "," "," "," "," "};
                    for (int i = 0; i < strs.length; i++) {
                        strings[i] = strs[i];
                    }
                    String tmp = "";
                    jTextArea.setText("");
                    for (int i=0;i<strings[0].length();i++){
                        tmp = tmp + strings[0].charAt(i);
                        for (int j=0;j<strings[1].length();j++) {
                            tmp = tmp + strings[1].charAt(j);
                            for (int k=0;k<strings[2].length();k++){
                                tmp = tmp + strings[2].charAt(k);
                                for (int l=0;l<strings[3].length();l++){
                                    tmp = tmp + strings[3].charAt(l);
                                    for (int m=0;m<strings[4].length();m++){
                                        tmp = tmp + strings[4].charAt(m);
                                        for (int n=0;n<strings[5].length();n++){
                                            tmp = tmp + strings[5].charAt(n);
                                            for (int o=0;o<strings[6].length();o++){
                                                tmp = tmp + strings[6].charAt(o);
                                                for (int p=0;p<strings[7].length();p++){
                                                    tmp = tmp + strings[7].charAt(p);
                                                    for (int q=0;q<strings[8].length();q++){
                                                        tmp = tmp + strings[8].charAt(q);
                                                        for (int r = 0; r < strings[9].length(); r++) {
                                                            tmp = tmp + strings[9].charAt(r);
                                                            System.out.println(tmp);
                                                            jTextArea.append(tmp+"\n");
                                                            tmp = tmp.substring(0,tmp.length()-1);
                                                        }
                                                        tmp = tmp.substring(0,tmp.length()-1);
                                                    }
                                                    tmp = tmp.substring(0,tmp.length()-1);
                                                }
                                                tmp = tmp.substring(0,tmp.length()-1);
                                            }
                                            tmp = tmp.substring(0,tmp.length()-1);
                                        }
                                        tmp = tmp.substring(0,tmp.length()-1);
                                    }
                                    tmp = tmp.substring(0,tmp.length()-1);
                                }
                                tmp = tmp.substring(0,tmp.length()-1);
                            }
                            tmp = tmp.substring(0,tmp.length()-1);
                        }
                        tmp = tmp.substring(0,tmp.length()-1);
                    }

                    System.out.println("hello,waj!");
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

            }
        });

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                jTextField9.setText("");
                jTextField10.setText("");
            }
        });

        frame.setSize(1560,960);
        frame.setVisible(true);
//        kjjy();
    }

    {
        String[] strings = new String[]{"",""};
        String tmp = "";
        JTextArea jTextArea = new JTextArea();

    }
}
