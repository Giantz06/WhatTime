package com.project;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DigitalClock extends JPanel {
    private JLabel timeLabel;
    private DateTimeFormatter formatter;

    public DigitalClock() {
        // 1. Thiết lập Layout cho Panel
        setLayout(new BorderLayout());

        // 2. Khởi tạo nhãn hiển thị thời gian
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Monospaced", Font.BOLD, 50));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Tùy chỉnh màu sắc (Style)
        timeLabel.setForeground(new Color(80, 250, 123)); // Màu xanh neon
        timeLabel.setBackground(new Color(40, 42, 54)); // Màu nền tối
        timeLabel.setOpaque(true);

        add(timeLabel, BorderLayout.CENTER);

        // 3. Thiết lập định dạng giờ: Phút: Giây
        formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // 4. Tạo Timer để cập nhật mỗi giây (1000ms)
        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();

        // Hiển thị giờ ngay lập tức khi vừa mở app
        updateTime();
    }

    private void updateTime() {
        LocalTime now = LocalTime.now();
        timeLabel.setText(now.format(formatter));
    }
}