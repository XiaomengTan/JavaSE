package Test181SwingBasic;

import javax.swing.*;
import java.awt.*;
import java.sql.PseudoColumnUsage;
import java.util.Scanner;

public class test {
    JFrame frame = new JFrame("Swing基本组件测试");

    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("文件");
    JMenu editMenu = new JMenu("编辑");

    JMenuItem auto = new JMenuItem("自动换行");
    JMenuItem copy = new JMenuItem("复制");
    JMenuItem paste = new JMenuItem("粘贴");

    JMenu formatMenu = new JMenu("格式");
    JMenuItem comment = new JMenuItem("注释");
    JMenuItem cancelComment = new JMenuItem("取消注释");

    JTextArea ta = new JTextArea(8, 20);

    String[] colors = {"红色","绿色","蓝色"};

    JList<String> colorList = new JList<>(colors);

    JComboBox<String> colorSelect = new JComboBox<>();

    ButtonGroup bg = new ButtonGroup();
    JRadioButton male = new JRadioButton("男", false);
    JRadioButton female = new JRadioButton("女", true);

    JCheckBox isMarried = new JCheckBox("是否已婚", true);

    JTextField tf = new JFormattedTextField(40);
    JButton ok = new JButton("确定");

    JPopupMenu jPopupMenu = new JPopupMenu();

    ButtonGroup poupButtonBg = new ButtonGroup();

    JRadioButtonMenuItem metal = new JRadioButtonMenuItem("Metal 风格");
    JRadioButtonMenuItem nibus = new JRadioButtonMenuItem("Nibus 风格");
    JRadioButtonMenuItem windows = new JRadioButtonMenuItem("Windows 风格", true);
    JRadioButtonMenuItem windosClassic = new JRadioButtonMenuItem("Windos 经典风格");
    JRadioButtonMenuItem motif = new JRadioButtonMenuItem("Motif 风格");

    public void init(){
        JPanel bottonPanel = new JPanel();
        bottonPanel.add(tf);
        bottonPanel.add(ok);

        frame.add(bottonPanel, BorderLayout.SOUTH);

        JPanel selectPanel = new JPanel();

        colorSelect.addItem("红色");
        colorSelect.addItem("绿色");
        colorSelect.addItem("蓝色");

        selectPanel.add(colorSelect);
        bg.add(male);
        bg.add(female);
        selectPanel.add(male);
        selectPanel.add(female);

        selectPanel.add(isMarried);

        Box topLeft = Box.createVerticalBox();
        topLeft.add(ta);
        topLeft.add(selectPanel);

        Box top = Box.createHorizontalBox();
        top.add(topLeft);
        top.add(colorList);

        frame.add(top);

        formatMenu.add(comment);
        formatMenu.add(cancelComment);

        editMenu.add(auto);
        editMenu.addSeparator();
        editMenu.add(copy);
        editMenu.add(paste);
        editMenu.addSeparator();
        editMenu.add(formatMenu);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        frame.setJMenuBar(menuBar);

        poupButtonBg.add(metal);
        poupButtonBg.add(nibus);
        poupButtonBg.add(windows);
        poupButtonBg.add(windosClassic);
        poupButtonBg.add(motif);

        frame.setVisible(true);
    }


    public static void main(String[] args) {
        test t = new test();
        t.init();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
    }
}
