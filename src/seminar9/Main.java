package seminar9;

public class Main {
    public static void main(String[] args) throws Exception {
        FileWriterAdapter adapter = new FileWriterAdapter(new FileWriter());
        Writer writer = new Writer();

        Notifier notifier = new Notifier();
        notifier.myNotify(writer);
        notifier.myNotify(adapter);
    }
}
