package Test177Graphic;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Test180ReadAndImage {
    private Frame frame = new Frame("图片查看器");

    //菜单条
    MenuBar menuBar = new MenuBar();
    Menu menu = new Menu("文件");
    MenuItem open = new MenuItem("打开");
    MenuItem save = new MenuItem("另存为");


    BufferedImage image;

    private class MyCanves extends Canvas {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawImage(image, 0, 0, null);
        }
    }

    MyCanves drawArea = new MyCanves();

    public void init() throws Exception {
        open.addActionListener(e->{
            //打开文件对话框
            FileDialog fileDialog = new FileDialog(frame,"打开图片",FileDialog.LOAD);
            fileDialog.setVisible(true);

            //获取路径和名称
            String dir = fileDialog.getDirectory();
            String fileName = fileDialog.getFile();

            try {
                image = ImageIO.read(new File(dir, fileName));
                drawArea.repaint();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        save.addActionListener(e->{
            FileDialog fileDialog = new FileDialog(frame,"保存图片",FileDialog.SAVE);
            fileDialog.setVisible(true);

            //获取路径和名称
            String dir = fileDialog.getDirectory();
            String fileName = fileDialog.getFile();

            try {
                ImageIO.write(image,"png",new File(dir,fileName));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        menu.add(open);
        menu.add(save);

        menuBar.add(menu);

        frame.setMenuBar(menuBar);
        frame.add(drawArea);

        frame.setBounds(200, 200, 740, 508);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) throws Exception {
        new Test180ReadAndImage().init();
    }
}
