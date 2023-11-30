package com.heima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener {
    // 游戏主界面
    // 游戏相关逻辑代码，写在此处

    // 创建二维数组
    // 用来管理数据
    // 加载图片的时候，会根据二维数组中的数据进行加载
    int[][] data = new int[4][4];

    public GameJFrame() {
        // 初始化界面
        initJFrame();

        // 初始化菜单
        initJMenuBar();

        // 初始化数据（打乱）
        initData();

        // 初始化图片（根据打乱之后的结果去加载图片）
        initImage();

        // 让界面显示出来，建议写在最后
        setVisible(true);
    }

    private void initData() {
        // 定义一维数组
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        // 打乱数组中的数据的顺序
        // 遍历数组，得到每一个元素，再将该元素和随机索引上的数据交换
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int randomIndex = r.nextInt(arr.length);
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        // 解法1
        for (int i = 0; i < arr.length; i++) {
            data[i / 4][i % 4] = arr[i];
        }
        // 解法2
        // 遍历二维数组，给二维数组的每一个数据赋值
        /*for (int i = 0; i < data.length; i++) {
            System.arraycopy(arr, i * 4 + 0, data[i], 0, data[i].length);
        }*/
    }

    // 初始化图片
    // 添加图片的时候，需要按照二维数组中管理的数据添加图片
    private void initImage() {
        // 路径有两种
        // 绝对路径：从盘符开始
        // 相对路径：不是从盘符开始，相对当前项目而言
        // 先加载的图片在上方，后加载的图片在下方
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // 获取需要加载的图片的序号
                int num = data[i][j];
                // 创建图片对象和管理容器
                JLabel jLabel = new JLabel(new ImageIcon("day16-code\\image\\animal\\animal3\\" + num + ".jpg"));
                // 指定图片的位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                // 给图片添加边框
                // 0表示让图片凸出
                // 1表示让图片凹陷
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                // 把管理容器添加到界面中
                getContentPane().add(jLabel);
                // 添加一次后number自增，表示添加下一张图片
                // 第16张图需要注意：因为没有这张图，所以jLabel找不到，他会加载一张空白
            }
        }
        // 添加背景图片
        JLabel background = new JLabel(new ImageIcon("day16-code\\image\\background.png"));
        background.setBounds(40, 40, 508, 560);
        // 把背景图片添加到界面当中
        getContentPane().add(background);
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
        // 给整个界面添加键盘监听事件
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
