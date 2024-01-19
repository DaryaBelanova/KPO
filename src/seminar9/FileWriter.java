package seminar9;

import java.io.BufferedWriter;

public class FileWriter {
    public static final String PATH = "";
    public void saveToFile(String str) throws Exception {
        BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(PATH));
        writer.write(str);
    }
}
