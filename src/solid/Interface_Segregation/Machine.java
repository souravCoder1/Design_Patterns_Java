package solid.Interface_Segregation;

public interface Machine {
    void scan(Document document);
    void fax(Document document);
    void print(Document document);
}

