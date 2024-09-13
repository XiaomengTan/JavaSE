package Test177Graphic;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;


public class Case179DrawHand {
    private Frame frame = new Frame("简单手绘");

    private final int AREA_WIDTH = 500;
    private final int AREA_HEIGHT = 400;

    private PopupMenu colorMenu = new PopupMenu();
    private MenuItem redItem = new MenuItem("红色");
    private MenuItem greenItem = new MenuItem("绿色");
    private MenuItem blueItem = new MenuItem("蓝色");

    //定义一个变量，记录当前画笔的颜色
    private Color forceColor = Color.BLACK;

    //创建位图对象
    BufferedImage image = new BufferedImage(AREA_WIDTH, AREA_HEIGHT, BufferedImage.TYPE_INT_RGB);

    //通过位图，获取关联的Graphics对象
    Graphics g = image.getGraphics();

    //定义一个类，继承自Canves
    private class MyCanves extends Canvas {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawImage(image, 0, 0, null);

        }
    }

    MyCanves drawArea = new MyCanves();

    //定义两个变量，储存鼠标拖动点击的上一个坐标
    private int preX = -1;
    private int preY = -1;

    public void init() {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand();
                switch (actionCommand) {
                    case "红色":
                        forceColor = Color.RED;
                        break;
                    case "绿色":
                        forceColor = Color.GREEN;
                        break;
                    case "蓝色":
                        forceColor = Color.BLUE;
                        break;
                }
            }
        };

        redItem.addActionListener(listener);
        greenItem.addActionListener(listener);
        blueItem.addActionListener(listener);

        colorMenu.add(redItem);
        colorMenu.add(greenItem);
        colorMenu.add(blueItem);

        //把colorMenu设置给绘图区域
        drawArea.add(colorMenu);

        //注册鼠标监听器
        drawArea.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                boolean popupTrigger = e.isPopupTrigger();
                if (popupTrigger) {
                    colorMenu.show(drawArea, e.getX(), e.getY());
                }

                //鼠标抬起重置坐标
                preX = -1;
                preY = -1;
            }
        });

        //设置位图的背景为白色
        g.setColor(Color.white);
        g.fillRect(0, 0, AREA_WIDTH, AREA_HEIGHT);

        //监听鼠标移动完成绘图
        drawArea.addMouseMotionListener(new MouseAdapter() {
            //当鼠标左键按下并进行拖动时会被调用
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);

                //判断
                if(preX>0&&preY>0){
                    //设置颜色
                    g.setColor(forceColor);
                    //画线条，需要两组坐标，分别代表线条的起点和终点
                    g.drawLine(preX,preY,e.getX(),e.getY());
                }

                //修正preX和preY
                preX = e.getX();
                preY = e.getY();

                //重绘组件
                drawArea.repaint();
            }
        });
        drawArea.setPreferredSize(new Dimension(AREA_WIDTH,AREA_HEIGHT));
        frame.add(drawArea);


        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Case179DrawHand().init();
    }
}
