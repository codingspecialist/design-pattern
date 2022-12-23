package ex07;

public class App {
    public static void main(String[] args) {
        DBFactory dbFactory = DBFactory.getInstance();
        DB db = dbFactory.createDB("or");
        db.execute("select");
    }
}
