package solid.Interface_Segregation;

public class MultiFunctionMachine implements MuntiFunctionDevice{

    private Printer printer;
    private Scanner scanner;
    @Override
    public void print(Document document) {
        printer.print(document);
    }

    @Override
    public void scan(Document document) {
        scanner.scan(document);
    }
}
