package com.heima.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    // 游戏主界面
    // 游戏相关逻辑代码，写在此处

    public GameJFrame() {
        // 初始化界面
        initJFrame();

        // 初始化菜单
        initJMenuBar();

        // 初始化图片
        initImage();

        // 让界面显示出来，建议写在最后
        setVisible(true);
    }

    // 初始化图片
    private void initImage() {
        /*// 创建一个图片对象
        ImageIcon icon = new ImageIcon("C:\\Users\\wenhao\\Desktop\\LearnJava\\黑马教程\\代码\\basic-code\\day16-code\\image\\animal\\animal3\\3.jpg");
        // 创建管理容器JLabel
        JLabel jLabel = new JLabel(icon);
        // 指定图片的位置
        jLabel.setBounds(0, 0, 105, 105);
        // 把管理容器添加到界面中
        // add(jLabel);
        getContentPane().add(jLabel);*/

        int number = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // 创建图片对象和管理容器
                JLabel jLabel = new JLabel(new ImageIcon("C:\\Users\\wenhao\\Desktop\\LearnJava\\黑马教程\\代码\\basic-code\\day16-code\\image\\animal\\animal3\\" + number + ".jpg"));
                // 指定图片的位置
                jLabel.setBounds(105 * j, 105 * i, 105, 105);
                // 把管理容器添加到界面中
                getContentPane().add(jLabel);
                // 添加一次后number自增，表示添加下一张图片
                // 第16张图需要注意：因为没有这张图，所以jLabel找不到，他会加载一张空白
                number++;
            }
        }
    }

    private void initJMenuBar() {
        // 创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();
        // 创建菜单上面的两个选项的对象（功能  关于我们）
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");
        // 创建选项下面的条目对象
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

        // 将选项下面的条目添加到选项中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        // 将选项添加到菜单栏
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        // 给整个界面设置菜单
        setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
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
        // 取消默认的居中放置，取消之后才会按照xy轴的形式添加组件
        setLayout(null);
    }
}
