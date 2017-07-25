package controllers.editor;

import ui.About;
import ui.JFrameEditor;
import utils.FileUtil;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditorController {

    private JFrameEditor mJFrame;
    private JTextArea    mConsole;
    private JTextArea    mEditor;
    private JButton      mPlay;
    private JButton      mSave;
    private JButton      mStructure;
    private JButton      mAbout;
    private JButton      mExit;

    public EditorController(JFrameEditor jfe){
        mJFrame = jfe;
        initUI();
    }

    private void initUI(){

        mPlay = mJFrame.getmPlay();
        mPlay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Play play = new Play(mEditor.getText().toString());
                mConsole.setText(play.getResult());
            }
        });
        mSave = mJFrame.getmSave();
        mSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileUtil.getInstance().write(mEditor.getText().toString());
            }
        });
        mStructure = mJFrame.getmStructure();
        mStructure.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String code = "CodeDraw{\n" +
                        "Canvas(400,400);\n" +
                        "CanvasAddFigure(Line(RED,70,50,200,200));\n" +
                        "}";
                mEditor.setText(code);
            }
        });
        mAbout = mJFrame.getmAbout();
        mAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                About about = new About();
            }
        });
        mExit = mJFrame.getmExit();
        mExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        mConsole = mJFrame.getmConsole();
        mEditor = mJFrame.getmEditor();
        mEditor.setText(FileUtil.getInstance().read());

    }
}
