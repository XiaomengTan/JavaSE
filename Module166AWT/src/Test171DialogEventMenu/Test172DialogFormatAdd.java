package Test171DialogEventMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test172DialogFormatAdd {
    public static void main(String[] args) {
        Frame frame = new Frame("测试Dialog");
        //创建一个对话框
        Dialog d1 = new Dialog(frame,"模式对话框",true);

        //创建一个Box容器，把一个文本框和一个按钮添加到Box容器中
        Box vBox = Box.createVerticalBox();
        vBox.add(new TextField(20));
        vBox.add(new Button("确认"));

        //把box容器添加到Dialog中
        d1.add(vBox);

        //用setbounds方法设置Dialog的位置以及大小
        d1.setBounds(20,30,300,200);


        //创建两个按钮
        Button b1 = new Button("打开模式对话框");
        b1.setLabel("1");

        //给这两个按钮添加点击后的行为
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d1.setVisible(true);
            }
        });


        //把按钮添加到frame中
        frame.add(b1,BorderLayout.NORTH);


        frame.pack();
        frame.setVisible(true);
    }
}