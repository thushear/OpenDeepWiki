package com.koalawiki.domains;

import java.time.Instant;

public interface CreateEntity {
    Instant getCreatedAt();
    void setCreatedAt(Instant createdAt);
}
