package Test166Basic;

import javax.swing.*;
import java.awt.*;

public class Test168BoxLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("这里测试BoxLayout");

        //1.基于frame容器创建一个BoxLayout对象，并且该对象存放组件是垂直存放的
        BoxLayout boxLayout = new BoxLayout(frame, BoxLayout.Y_AXIS);

        //2.把BoxLayout对象设置给Frame
        frame.setLayout(boxLayout);

        //3.往frame中添加两个按钮组件
        frame.add(new Button("按钮1"));
        frame.add(new Button("按钮2"));

        frame.pack();
        frame.setVisible(true);
    }
}
