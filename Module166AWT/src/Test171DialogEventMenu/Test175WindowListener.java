package Test171DialogEventMenu;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test175WindowListener {
    public static void main(String[] args) {
        Frame frame = new Frame("这里测试WindowListener");
        frame.setBounds(200,200,500,300);

        //监听x，点击则关闭
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}
