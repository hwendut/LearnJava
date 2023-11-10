package com.heima.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    // 登录界面
    // 和登录相关的代码，写在此处

    public LoginJFrame() {
        setSize(488, 430);
        // 设置界面的标题
        setTitle("拼图 登录");
        // 设置界面置顶
        setAlwaysOnTop(true);
        // 设置界面居中
        setLocationRelativeTo(null);
        // 设置关闭模式
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setVisible(true);
    }
}
