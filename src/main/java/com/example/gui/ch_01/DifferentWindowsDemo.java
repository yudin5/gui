package com.example.gui.ch_01;

import javax.swing.*;

public class DifferentWindowsDemo {
    public static void main(String[] args) {
        // Заголовки для окон
        String[] name = {
                "Сообщение",
                "Ошибка",
                "Информация",
                "Вопрос"
        };

        String[] txt = {
                "Обычное окно",
                "Ошибка!",
                "Информационное окно",
                "Есть вопрос?"
        };

        int[] style = {
                JOptionPane.PLAIN_MESSAGE,
                JOptionPane.ERROR_MESSAGE,
                JOptionPane.INFORMATION_MESSAGE,
                JOptionPane.QUESTION_MESSAGE
        };

        for (int i = 0; i < 4; i++) {
            JOptionPane.showMessageDialog(null, txt[i], name[i], style[i]);
        }
    }
}
