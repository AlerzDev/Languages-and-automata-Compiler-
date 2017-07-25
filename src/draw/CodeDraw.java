package draw;

import helpers.ErrorHelper;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.plaf.ColorUIResource;
import java.awt.Color;
import java.awt.Shape;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by lemux-dev on 20/07/17.
 */
public class CodeDraw extends JPanel {

    public static JFrame mJFrame;
    private List<Shape> mShapes;
    private List<Color> mBorders;
    private List<Color> mSolids;
    private int         mWidth;
    private int         mHeight;
    private ErrorHelper helper;
    private String      mMsgError;

    public CodeDraw(){

        mJFrame  = new JFrame();
        mShapes  = new ArrayList<>();
        mBorders = new ArrayList<>();
        mSolids  = new ArrayList<>();
        mJFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        mJFrame.setResizable(false);
        mJFrame.setTitle("Code Draw");
        mJFrame.setContentPane(this);
        helper = ErrorHelper.getInstance();
    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);
        Graphics2D gD2 = (Graphics2D)g;
        int i = 0;
        for (Shape shape: mShapes) {
            gD2.setColor(mBorders.get(i));
            gD2.draw(shape);
            i++;
        }

    }

    public void createCanvas(final int width, final int height){

        mJFrame.setSize(width, height);
        mJFrame.setLocationRelativeTo(null);
        mJFrame.setVisible(true);

    }

    public void drawLine(final Color border, final int x1, final int y1, final int x2, final int y2){

        Line2D line = new Line2D.Float(x1,y1,x2,y2);
        mShapes.add(line);
        mBorders.add(border);

    }

    public void drawSquare(final Color border, final int x, final int y, final int size){

        Rectangle rectangle = new Rectangle(x,y,size,size);
        mShapes.add(rectangle);
        mBorders.add(border);

    }

    public void drawCircle(final Color border, final int x, final int y, final int radius){

        Ellipse2D ellipse = new Ellipse2D.Float(x,y,radius,radius);
        mShapes.add(ellipse);
        mBorders.add(border);

    }

    public void setJFrameBackGround(final Color color){

        mJFrame.getContentPane().setBackground(color);

    }

    public void setmWidth(int mWidth) {
        this.mWidth = mWidth;
    }

    public void setmHeight(int mHeight) {
        this.mHeight = mHeight;
    }

    public boolean validityRangeCanvas(final int x, final int y){
        return x <= mWidth && x >= 0 && y <= (mHeight-30) && y >= 0;
    }

    public void setMsgError(String error){
        if(helper.getErrorSyntax()==null){
            helper.setErrorSyntax("");
        }
        mMsgError = helper.getErrorSyntax();
        mMsgError += error;
        helper.setErrorSyntax(mMsgError);
    }


}
