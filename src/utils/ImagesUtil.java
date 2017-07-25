package utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ImagesUtil {

    private static ImagesUtil instance;

    public static ImagesUtil getInstance(){
        if(instance == null) instance = new ImagesUtil();
        return instance;
    }

    public BufferedImage getImage(String path){
        BufferedImage picture = null;
        try {
            picture = ImageIO.read(new BufferedInputStream(new FileInputStream(path)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return picture;
    }

}
