package list_5.factoryMethod.Exercise3;

public class Main {
    public static void main(String[] args) {
        ReportGenerator generator = new PDFReportGenerator();
        generator.generate();
    }


}
