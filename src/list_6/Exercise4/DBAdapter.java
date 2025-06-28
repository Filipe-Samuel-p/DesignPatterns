package list_6.Exercise4;

class DBAdapter implements NewDatabase {
    private LegacyDB legacy;

    public DBAdapter(LegacyDB legacy) {
        this.legacy = legacy;
    }

    public void insert(String data) {
        legacy.run("INSERT INTO table VALUES (" + data + ")");
    }

    public void delete(int id) {
        legacy.run("DELETE FROM table WHERE id = " + id);
    }
}