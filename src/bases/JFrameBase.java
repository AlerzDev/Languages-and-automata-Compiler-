package bases;

import controllers.editor.EditorController;
import ui.JFrameEditor;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Color;

public abstract class JFrameBase extends JFrame {

    public JFrameBase(){
        setLayout(null);
        setResizable(resizable());
        setTitle(title());
        setSize(width(), height());
        getContentPane().setBackground(background());
        setUndecorated(undecorated());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initView();
        setVisible(visible());
        if (loading()){
            try {
                Thread.sleep(3000);
                JFrameEditor jFrameEditor = new JFrameEditor();
                EditorController ec = new EditorController(jFrameEditor);
                dispose();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    protected abstract String  title();
    protected abstract void    initView();
    protected abstract boolean resizable();
    protected abstract boolean visible();
    protected abstract int     width();
    protected abstract int     height();
    protected abstract Color   background();
    protected abstract boolean undecorated();
    protected abstract boolean loading();

}
