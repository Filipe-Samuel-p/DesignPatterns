package list_5.factoryMethod.Exercise3;

class PDFReportGenerator extends ReportGenerator {
    protected Report createReport() {
        return new PDFReport();
    }
}

class HTMLReportGenerator extends ReportGenerator {
    protected Report createReport() {
        return new HTMLReport();
    }
}