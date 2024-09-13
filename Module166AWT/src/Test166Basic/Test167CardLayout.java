package Test166Basic;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test167CardLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("这里测试CardLayout");

        //1.创建一个panel用来储存多个组件（卡片）
        Panel p1 = new Panel();

        //2.创建CardLayout对象，并把该对象设置给之前创建的容器
        CardLayout cardLayout = new CardLayout();
        p1.setLayout(cardLayout);

        //3.往panel中储存多个组件
        String[] names = {"第一张", "第二张", "第三张", "第四张", "第五张"};
        for (String s : names) {
            p1.add(s, new Button(s));
        }

        //4.把panel放到frame的中间区域
        frame.add(p1);

        //5.创建另一个panel p2，用来储存多个按钮组件
        Panel p2 = new Panel();

        //6.创建五个按钮组件
        Button b1 = new Button("上一张");
        Button b2 = new Button("下一张");
        Button b3 = new Button("第一张");
        Button b4 = new Button("最后一张");
        Button b5 = new Button("第三张");

        //7.创建一个事件监听器，监听按钮的点击动作
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand();
                switch (actionCommand) {
                    case "上一张":
                        cardLayout.previous(p1);
                        break;
                    case "下一张":
                        cardLayout.next(p1);
                        break;
                    case "第一张":
                        cardLayout.first(p1);
                        break;
                    case "最后一张":
                        cardLayout.last(p1);
                        break;
                    case "第三张":
                        cardLayout.show(p1,"第三张");
                        break;
                }
            }
        };
        //8.把当前这个事件监听器和多个按钮绑定在一起
        b1.addActionListener(listener);
        b2.addActionListener(listener);
        b3.addActionListener(listener);
        b4.addActionListener(listener);
        b5.addActionListener(listener);

        //9.把按钮添加到容器p2中
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        //10.把p2放到frame的南部
        frame.add(p2,BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}
