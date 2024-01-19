package seminar9;

public class Notifier {
    public String message = "Hello";

    public void myNotify(Writer writer) throws Exception{
        writer.write(message);
    }
}
