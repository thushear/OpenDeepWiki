package com.koalawiki.domains;

public class Entity<T> implements IEntity<T>, CreateEntity {
    private T id;
    private java.time.Instant createdAt;

    @Override
    public T getId() {
        return id;
    }

    @Override
    public void setId(T id) {
        this.id = id;
    }

    @Override
    public java.time.Instant getCreatedAt() {
        return createdAt;
    }

    @Override
    public void setCreatedAt(java.time.Instant createdAt) {
        this.createdAt = createdAt;
    }
}
