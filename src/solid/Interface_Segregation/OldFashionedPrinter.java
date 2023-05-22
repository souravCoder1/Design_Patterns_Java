package solid.Interface_Segregation;

public class OldFashionedPrinter implements Machine {
    @Override
    public void scan(Document document) {

    }

    @Override
    public void fax(Document document) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void print(Document document) {

    }
}
