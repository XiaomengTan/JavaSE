package Test166Basic;

import javax.swing.*;
import javax.swing.text.BoxView;
import java.awt.*;

public class Test169Box {
    public static void main(String[] args) {
        Frame frame = new Frame("测试box");

        //1.创建一个水平排列组件的Box容器
        Box hBox = Box.createHorizontalBox();
        //2.添加两个按钮
        hBox.add(new Button("水平按钮1"));
        hBox.add(new Button("水平按钮2"));
        //3.创建一个竖直排列组件的Box容器
        Box vBox = Box.createVerticalBox();
        //4.添加两个按钮
        vBox.add(new Button("垂直按钮1"));
        vBox.add(new Button("垂直按钮2"));
        //5.把两个box容器放到frame中展示
        frame.add(hBox, BorderLayout.NORTH);
        frame.add(vBox);

        frame.pack();
        frame.setVisible(true);
    }
}
