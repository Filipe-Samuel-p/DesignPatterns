package list_6.Exercise4;

public class Main {
    public static void main(String[] args) {
        NewDatabase db = new DBAdapter(new LegacyDB());
        db.insert("'Alice', 30");
        db.delete(1);
    }
}
