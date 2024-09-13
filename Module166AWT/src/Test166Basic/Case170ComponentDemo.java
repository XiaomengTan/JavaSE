package Test166Basic;

import javax.swing.*;
import java.awt.*;

public class Case170ComponentDemo {
    Frame frame = new Frame("这里测试基本组件");

    TextArea ta = new TextArea(5, 20);//文本框

    Choice colorChooser = new Choice();//选择框

    CheckboxGroup cbg = new CheckboxGroup();//组对象
    Checkbox male = new Checkbox("男", cbg, true);
    Checkbox famale = new Checkbox("女", cbg, false);

    Checkbox isMarried = new Checkbox("是否已婚？");//复选框

    TextField tf = new TextField(50);//文本框

    Button ok = new Button("确认");//按钮

    List colorList = new List(6, true);//列表框


    public void init() {
        //组装底部
        Box bBox = Box.createHorizontalBox();
        bBox.add(tf);
        bBox.add(ok);
        frame.add(bBox,BorderLayout.SOUTH);

        //组装选择部分
        colorChooser.add("红色");
        colorChooser.add("蓝色");
        colorChooser.add("绿色");
        Box cBox = Box.createHorizontalBox();
        cBox.add(colorChooser);
        cBox.add(male);
        cBox.add(famale);
        cBox.add(isMarried);

        //组装文本域和选择部分
        Box topLeft = Box.createVerticalBox();
        topLeft.add(ta);
        topLeft.add(cBox);

        //组装顶部左边和列表框
        colorList.add("红色");
        colorList.add("绿色");
        colorList.add("蓝色");
        Box top = Box.createHorizontalBox();
        top.add(topLeft);
        top.add(colorList);

        frame.add(top);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Case170ComponentDemo().init();
    }
}
