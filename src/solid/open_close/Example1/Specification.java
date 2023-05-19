package solid.open_close.Example1;

public interface Specification<T> {

    boolean isSatisfied(T item);
}

