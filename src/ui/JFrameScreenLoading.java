package ui;

import bases.JFrameBase;
import utils.FontsUtil;
import utils.ImagesUtil;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class JFrameScreenLoading extends JFrameBase{

    private JLabel mLogoName;
    private JLabel mDevelopers;
    private JLabel mLogo;
    private Color  color;
    private Font   mFont;
    private Font   mFontLittle;
    private JLabel mLoading;

    @Override
    protected void initView() {
        color = new Color(0x7B1FA2);
        mFont = FontsUtil.getInstance().getRobotoLightFont(40f);
        mFontLittle = FontsUtil.getInstance().getRobotoLightFont(10f);
        add(panelLeft());
        add(panelRight());
    }



    private JPanel panelLeft(){

        JPanel panel = new JPanel(new FlowLayout());
        panel.setSize(180,180);
        panel.setLocation(10,40);
        panel.setOpaque(false);
        mLogo = new JLabel(new ImageIcon(ImagesUtil.getInstance().getImage("resources/images/image.jpg")));
        panel.add(mLogo);
        return panel;

    }

    private JPanel panelRight(){

        JPanel panel = new JPanel(new FlowLayout());
        panel.setSize(295,180);
        panel.setLocation(195,20);
        panel.setOpaque(false);
        mLogoName = new JLabel("CodeDraw");
        mLogoName.setForeground(color);
        mLogoName.setFont(mFont);
        mDevelopers = new JLabel("By Alejandro Lemus and Miguel Pérez");
        mDevelopers.setForeground(color);
        mDevelopers.setFont(mFontLittle);
        URL url = null;
        try {
            url = new URL("https://es.cloud.im/content/images/preloader.gif");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        ImageIcon icon = new ImageIcon(url);
        mLoading = new JLabel(icon);
        panel.add(mLogoName);
        panel.add(mDevelopers);
        panel.add(mLoading);
        return panel;

    }

    @Override
    protected String title() {
        return null;
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
        return 500;
    }

    @Override
    protected int height() {
        return 200;
    }

    @Override
    protected Color background() {
        return Color.WHITE;
    }

    @Override
    protected boolean undecorated() {
        return true;
    }

    @Override
    protected boolean loading() {
        return true;
    }

}
