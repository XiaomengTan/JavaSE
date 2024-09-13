package Test177Graphic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Case178PinBall {
    Frame frame = new Frame("弹球游戏");

    //桌面宽度
    private final int TABLE_WIDTH = 300;
    //桌面高度
    private final int TABLE_HEIGHT = 400;
    //球拍高度和宽度
    private final int RACKET_WIDTH = 60;
    private final int RACKET_HEIGHT = 20;
    //球的大小
    private final int BALL_SIZE = 16;

    //小球坐标
    private int ballX = 120;
    private int ballY = 20;

    //定义变量记录小球在x和y方向的移动速度
    private int speedX = 10;
    private int speedY = 5;

    //定义变量，记录球拍的坐标
    private int racketX = 120;
    private final int racketY = 340;

    //定义变量标记当前游戏是否结束
    private boolean isOver = false;

    //声明一个定时器
    private Timer timer;

    //自定义一个类，继承Canves，充当画布
    private class MyCanves extends Canvas {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            if (isOver) {
                //游戏结束
                g.setColor(Color.YELLOW);
                g.setFont(new Font("Times", Font.BOLD, 30));
                g.drawString("游戏结束！", 90, 200);
            } else {
                //游戏中
                // 绘制小球
                g.setColor(Color.RED);
                g.fillOval(ballX, ballY, BALL_SIZE, BALL_SIZE);

                //绘制球拍
                g.setColor(Color.BLACK);
                g.fillRect(racketX, racketY, RACKET_WIDTH, RACKET_HEIGHT);
            }
        }
    }


    //创建绘画区域
    MyCanves drawArea = new MyCanves();

    public void init() {
        //组装视图，游戏逻辑的控制

        //球拍坐标变化
        KeyListener listener = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_LEFT) {
                    //向左移动
                    if (racketX > 0) {
                        racketX -= 10;
                    }
                }
                if (keyCode == KeyEvent.VK_RIGHT) {
                    //向右移动
                    if (racketX < TABLE_WIDTH - RACKET_WIDTH) {
                        racketX += 10;
                    }
                }
            }
        };

        //给frame和drawArea注册监听器
        frame.addKeyListener(listener);
        drawArea.addKeyListener(listener);

        //小球坐标的控制
        ActionListener task = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //


                //根据边界范围修正速度
                if (ballX <= 0 || ballX >= TABLE_WIDTH - BALL_SIZE) {
                    speedX = -speedX;
                }
                if (ballY <= 0 || (ballY > racketY - BALL_SIZE && ballX > racketX)) {
                    speedY = -speedY;
                }
                if(ballY>racketY-BALL_SIZE&&(ballX<racketX||ballX>racketX+RACKET_WIDTH)){
                    //游戏结束

                    //停止计时器
                    timer.stop();
                    //修改游戏标致
                    isOver = true;
                    //重绘界面
                    drawArea.repaint();
                }

                //更新小球坐标，重绘界面
                ballX += speedX;
                ballY += speedY;

                //重绘界面
                drawArea.repaint();

            }
        };
        timer = new Timer(100, task);
        timer.start();

        drawArea.setPreferredSize(new Dimension(TABLE_WIDTH,TABLE_HEIGHT));
        frame.add(drawArea);

        //frame
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Case178PinBall().init();
    }
}
