package com.koalawiki.domains;

public interface IEntity<T> {
    T getId();
    void setId(T id);
}
