package list_5.factoryMethod.Exercise3;

abstract class ReportGenerator {
    public void generate() {
        Report r = createReport();
        r.render();
    }

    protected abstract Report createReport();
}
