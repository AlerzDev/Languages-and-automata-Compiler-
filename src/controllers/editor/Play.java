package controllers.editor;

import compiler.parser;
import draw.CodeDraw;
import helpers.ErrorHelper;
import utils.FileUtil;

public class Play {

    private String text;
    private String result = "";

    public Play(String t){
        text = t;
        save();
        run();
    }
    private void save(){
        FileUtil.getInstance().write(text);
    }
    private void run(){
            String[] fileTest = {"codeDraw.lm"};
            parser.main(fileTest);
            result += "Run!\n";
            ErrorHelper helper = ErrorHelper.getInstance();
            if(helper.getErrorSyntax() != null){
                result += helper.getErrorSyntax();
                helper.setErrorSyntax(null);
                CodeDraw.mJFrame.dispose();
            }else {
                result += "Satisfactory compilation process.....";
            }
    }

    public String getResult() {
        return result;
    }

}
