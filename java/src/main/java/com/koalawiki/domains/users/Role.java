package com.koalawiki.domains.users;

import com.koalawiki.domains.Entity;
import java.time.Instant;

public class Role extends Entity<String> {
    private String name;
    private String description;
    private boolean isActive = true;
    private Instant updatedAt = Instant.now();
    private boolean isSystemRole = false;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }
    public Instant getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Instant updatedAt) { this.updatedAt = updatedAt; }
    public boolean isSystemRole() { return isSystemRole; }
    public void setSystemRole(boolean systemRole) { isSystemRole = systemRole; }
}
