package list_6.Exercise1;

class TxtToCsvAdapter implements CsvExporter {
    private TxtExporter txtExporter;

    public TxtToCsvAdapter(TxtExporter txtExporter) {
        this.txtExporter = txtExporter;
    }

    public String exportCsv() {
        String txt = txtExporter.export();
        return txt.replace(';', ',');
    }
}