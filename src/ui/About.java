package ui;

import bases.JFrameBase;
import utils.FontsUtil;

import javax.swing.*;
import java.awt.*;

public class About extends JFrameBase{
    @Override
    protected String title() {
        return "About";
    }

    @Override
    protected void initView() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        String msg = "Made with love  <3 By Alejandro Lemus and Miguel Angel\n\n\n"+
                "###Create canvas\n" +
                "createCanvas = Canvas(width, height);\n" +
                "\n" +
                "###Adding or update attributes to the canvas\n" +
                "lineCode = CanvasAddFigure(figure);\n" +
                "\n" +
                "lineCode = CanvasBackground(color);\n" +
                "\n" +
                "###Create line\n" +
                "figure = Line(color, x1, y1, x2, y2);\n" +
                "\n" +
                "###Create Square\n" +
                "figure = Square(color, color, x, y, size);\n" +
                "\n" +
                "###Create Circle\n" +
                "figure = Circle(color, color, x, y, radius);";
        JTextArea jTextArea = new JTextArea(msg);
        jTextArea.setEditable(false);
        Font font = FontsUtil.getInstance().getRobotoLightFont(15f);
        jTextArea.setFont(font);
        add(jTextArea);
    }

    @Override
    protected boolean resizable() {
        return false;
    }

    @Override
    protected boolean visible() {
        return true;
    }

    @Override
    protected int width() {
        return 400;
    }

    @Override
    protected int height() {
        return 400;
    }

    @Override
    protected Color background() {
        return Color.white;
    }

    @Override
    protected boolean undecorated() {
        return false;
    }

    @Override
    protected boolean loading() {
        return false;
    }
}
