import com.heima.ui.GameJFrame;
import com.heima.ui.LoginJFrame;
import com.heima.ui.RegisterJFrame;

public class App {
    public static void main(String[] args) {
        // 程序启动入口
        // 想开启某一个界面，就创建谁的对象
        new LoginJFrame();
        new RegisterJFrame();
        new GameJFrame();
    }
}
