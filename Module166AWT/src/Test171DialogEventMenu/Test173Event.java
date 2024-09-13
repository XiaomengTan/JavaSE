package Test171DialogEventMenu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test173Event {
    Frame frame = new Frame("这里测试事件处理");
    TextField tf = new TextField(30);
    Button ok = new Button("确定");

    public void init(){
        //创建监听器
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("hello world");
            }
        };

        ok.addActionListener(listener);

        frame.add(tf,BorderLayout.NORTH);
        frame.add(ok);

        frame.pack();
        frame.setVisible(true);
    }



    public static void main(String[] args) {
        new Test173Event().init();
    }
}
