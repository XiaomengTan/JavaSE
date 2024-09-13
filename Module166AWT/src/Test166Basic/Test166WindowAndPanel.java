package Test166Basic;

import java.awt.*;

public class Test166WindowAndPanel {
    public static void main(String[] args) {
        //1.创建一个window对象
        Frame frame = new Frame("test");
        //2.创建一个panel对象
        Panel panel = new Panel();
        //3.创建一个文本框和按钮，把他们放入panel容器中
        TextField textField = new TextField("testText");
        panel.add(textField);
        Button button = new Button("testButton");
        panel.add(button);
        //4.把panel放到window中
        frame.add(panel);
        //5.设置window的位置以及大小
        frame.setBounds(100,100,500,300);
        //6.设置window可见
        frame.setVisible(true);
    }
}
