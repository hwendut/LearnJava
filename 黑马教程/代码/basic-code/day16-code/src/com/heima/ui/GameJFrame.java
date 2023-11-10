package com.heima.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    // 游戏主界面
    // 游戏相关逻辑代码，写在此处

    public GameJFrame() {
        // 设置界面宽高
        setSize(603, 680);
        // 设置界面的标题
        setTitle("拼图单机版 v1.0");
        // 设置界面置顶
        setAlwaysOnTop(true);
        // 设置界面居中
        setLocationRelativeTo(null);
        // 设置关闭模式
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 初始化菜单
        // 创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();
        // 创建菜单上面的两个选项的对象（功能  关于我们）
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");
        // 创建选项下面的条目对象
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem replayItem = new JMenuItem("重新游戏");
        
        JMenuItem replayItem = new JMenuItem("重新游戏");
        // 让界面显示出来，建议写在最后
        setVisible(true);
    }
}
