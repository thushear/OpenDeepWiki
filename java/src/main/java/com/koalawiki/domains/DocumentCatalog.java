package com.koalawiki.domains;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class DocumentCatalog extends Entity<String> {
    private String name = "";
    private String url = "";
    private String description = "";
    private String parentId = "";
    private int order = 0;
    private String ducumentId = "";
    private String warehouseId = "";
    private boolean isCompleted = false;
    private String prompt = "";
    private boolean isDeleted = false;
    private Instant deletedTime;
    private List<String> dependentFile = new ArrayList<>();

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getParentId() { return parentId; }
    public void setParentId(String parentId) { this.parentId = parentId; }
    public int getOrder() { return order; }
    public void setOrder(int order) { this.order = order; }
    public String getDucumentId() { return ducumentId; }
    public void setDucumentId(String ducumentId) { this.ducumentId = ducumentId; }
    public String getWarehouseId() { return warehouseId; }
    public void setWarehouseId(String warehouseId) { this.warehouseId = warehouseId; }
    public boolean isCompleted() { return isCompleted; }
    public void setCompleted(boolean completed) { isCompleted = completed; }
    public String getPrompt() { return prompt; }
    public void setPrompt(String prompt) { this.prompt = prompt; }
    public boolean isDeleted() { return isDeleted; }
    public void setDeleted(boolean deleted) { isDeleted = deleted; }
    public Instant getDeletedTime() { return deletedTime; }
    public void setDeletedTime(Instant deletedTime) { this.deletedTime = deletedTime; }
    public List<String> getDependentFile() { return dependentFile; }
    public void setDependentFile(List<String> dependentFile) { this.dependentFile = dependentFile; }
}
