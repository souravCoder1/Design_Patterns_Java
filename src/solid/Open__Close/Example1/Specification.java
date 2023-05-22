package solid.Open__Close.Example1;

import java.util.List;
import java.util.stream.Stream;

public interface Specification<T> {

    boolean isSatisfied(T item);
}

interface FilterI<T> {
    Stream<T> filter(List<T> items, Specification<T> specs);
}

