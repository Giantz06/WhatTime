package com.project;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Thiết lập giao diện FlatLaf (Dark Mode)
        FlatDarkLaf.setup();

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("My Digital Clock");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            // Thêm class DigitalClock chúng ta vừa tạo vào Frame
            frame.add(new DigitalClock());

            frame.pack(); // Tự động co dãn cửa sổ theo nội dung
            frame.setLocationRelativeTo(null); // Hiển thị giữa màn hình
            frame.setVisible(true);
        });
    }
}