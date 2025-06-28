package list_6.Exercise1;

public class Main {
    public static void main(String[] args) {
        CsvExporter exporter = new TxtToCsvAdapter(new TxtExporter());
        System.out.println(exporter.exportCsv());
    }

}
