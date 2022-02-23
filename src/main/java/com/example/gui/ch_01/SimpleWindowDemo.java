package com.example.gui.ch_01;

import javax.swing.*;

public class SimpleWindowDemo {
    public static void main(String[] args) {
        // Отображение информационного окна
        JOptionPane.showMessageDialog(null, "Всем привет!");
        JOptionPane.showMessageDialog(null, "Всем пока!");
//        System.getProperties().forEach((k, v) -> {
//            System.out.printf("%s = %s%n", k, v);
//        });
//        String property = System.getProperty("java.class.path");
//        JOptionPane.showMessageDialog(null, property);
    }
}
