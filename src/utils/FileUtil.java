package utils;

import java.io.*;

public class FileUtil {
    private static FileUtil instance;

    public static FileUtil getInstance(){
        if(instance==null){
            instance = new FileUtil();
        }
        return instance;
    }

    public void write(String text){
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("codeDraw.lm"), "utf-8"))) {
            writer.write(text);
        }catch (IOException ex){

        }
    }

    public String read(){
        String text = "";
        try(BufferedReader br = new BufferedReader(new FileReader("codeDraw.lm"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            text = sb.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

}
