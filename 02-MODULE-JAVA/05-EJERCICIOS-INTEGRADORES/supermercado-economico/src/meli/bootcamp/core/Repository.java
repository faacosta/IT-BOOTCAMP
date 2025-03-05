package meli.bootcamp.core;

import java.util.List;
import meli.bootcamp.exceptions.MethodNotImplementedException;

public interface Repository<K, V> {

    default void save(V entity) {
        throw new MethodNotImplementedException();
    }

    default List<V> findAll() {
        throw new MethodNotImplementedException();
    }

    default V findByKey(K key) {
        throw new MethodNotImplementedException();
    }

    default void remove(K key) {
        throw new MethodNotImplementedException();
    }

    default Boolean exists(K key) {
        throw new MethodNotImplementedException();
    }
    
}
