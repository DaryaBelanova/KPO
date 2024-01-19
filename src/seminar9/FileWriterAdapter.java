package seminar9;

public class FileWriterAdapter extends Writer {
    private FileWriter fileWriter;
     public FileWriterAdapter(FileWriter fileWriter) {
         this.fileWriter = fileWriter;
     }

    @Override
    public void write(String message) throws Exception {
         fileWriter.saveToFile(message);
    }
}
