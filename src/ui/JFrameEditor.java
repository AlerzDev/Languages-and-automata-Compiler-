package ui;

import bases.JFrameBase;
import utils.FontsUtil;
import utils.ImagesUtil;

import javax.swing.*;
import java.awt.*;

public class JFrameEditor extends JFrameBase {

    private JButton      mPlay;
    private JButton      mSave;
    private JButton      mStructure;
    private JButton      mAbout;
    private JButton      mExit;
    private JTextArea mConsole;
    private JTextArea mEditor;
    private Font      mFontConsole;
    private Font      mFontEditor;

    @Override
    protected void initView() {

        mFontConsole = FontsUtil.getInstance().getRobotoLightFont(13f);
        mFontEditor = FontsUtil.getInstance().getRobotoLightFont(15f);
        add(panelMenu());
        add(panelAreaEditor());
        add(panelConsole());
    }

    private JPanel panelMenu(){

        JPanel panel = new JPanel(new GridLayout(5,1));
        panel.setLocation(0,0);
        panel.setSize(50,575);
        mPlay = new JButton(new ImageIcon(ImagesUtil.getInstance().getImage("resources/icons/ic_play.png")));
        mSave = new JButton(new ImageIcon(ImagesUtil.getInstance().getImage("resources/icons/ic_save.png")));
        mStructure = new JButton(new ImageIcon(ImagesUtil.getInstance().getImage("resources/icons/ic_format.png")));
        mAbout = new JButton(new ImageIcon(ImagesUtil.getInstance().getImage("resources/icons/ic_help.png")));
        mExit = new JButton(new ImageIcon(ImagesUtil.getInstance().getImage("resources/icons/ic_exit.png")));
        panel.add(mPlay);
        panel.add(mSave);
        panel.add(mStructure);
        panel.add(mAbout);
        panel.add(mExit);
        return panel;
    }

    private JPanel panelAreaEditor(){
        JPanel panel = new JPanel(new BorderLayout());
        panel.setLocation(50,0);
        panel.setSize(750,400);
        panel.setBackground(Color.BLACK);
        mEditor = new JTextArea();
        mEditor.setFont(mFontEditor);
        JScrollPane sp = new JScrollPane(mEditor);
        panel.add(sp);
        return panel;
    }

    private JPanel panelConsole(){

        JPanel panel = new JPanel(new BorderLayout());
        panel.setLocation(50,400);
        panel.setSize(750,174);
        mConsole = new JTextArea("CodeDraw(Console)===>>>> Version 1.0.0 Beta");
        mConsole.setFont(mFontConsole);
        mConsole.setForeground(Color.blue);
        mConsole.setEditable(true);
        JScrollPane sp = new JScrollPane(mConsole);
        panel.add(sp);
        return panel;

    }

    @Override
    protected String title() {
        return "Editor CodeDraw";
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
        return 800;
    }

    @Override
    protected int height() {
        return 600;
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

    public JTextArea getmConsole() {
        return mConsole;
    }

    public JTextArea getmEditor() {
        return mEditor;
    }

    public JButton getmPlay() {
        return mPlay;
    }

    public JButton getmSave() {
        return mSave;
    }

    public JButton getmStructure() {
        return mStructure;
    }

    public JButton getmAbout() {
        return mAbout;
    }

    public JButton getmExit() {
        return mExit;
    }
}
