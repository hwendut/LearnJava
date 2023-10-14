

# Java基础概念-11-键盘录入

Java写好了一个类叫Scanner，这个类可以接收键盘输入的数字

1. 步骤一：导包 -- Scanner这个类在哪

   import java.until.Scanner;  导包的动作必须出现在类定义的上边

2. 步骤二：创建对象 -- 表示我要开始用Scanner这个类了

   Scanner sc = new Scanner(System.in);

   sc 是变量名

3. 步骤三：接收数据 -- 真正开始干活

   int i = sc.nextInt();

