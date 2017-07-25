package utils;

import java.awt.*;
import java.io.*;

public class FontsUtil {

    private static FontsUtil instance;

    public static FontsUtil getInstance(){
        if(instance==null){
            instance = new FontsUtil();
        }
        return instance;
    }

    public Font getRobotoLightFont(final float size){

        InputStream stream = null;
        try {
            stream = new BufferedInputStream(new FileInputStream("resources/fonts/Roboto-Light.ttf"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Font font = null;
        try {
            font = Font.createFont(Font.TRUETYPE_FONT, stream).deriveFont(size);
        } catch (FontFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return font;
    }

}
