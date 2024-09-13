package Test171DialogEventMenu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test171DialogFormat {
    public static void main(String[] args) {
        Frame frame = new Frame("测试Dialog");
        //创建两个对话框
        Dialog d1 = new Dialog(frame,"模式对话框",true);
        Dialog d2 = new Dialog(frame,"非模式对话框",false);

        //用setbounds方法设置Dialog的位置以及大小
        d1.setBounds(20,30,300,200);
        d2.setBounds(20,30,300,200);

        //创建两个按钮
        Button b1 = new Button("打开模式对话框");
        Button b2 = new Button("打开非模式对话框");

        //给这两个按钮添加点击后的行为
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d1.setVisible(true);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d2.setVisible(true);
            }
        });

        //把按钮添加到frame中
        frame.add(b1,BorderLayout.NORTH);
        frame.add(b2,BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}
