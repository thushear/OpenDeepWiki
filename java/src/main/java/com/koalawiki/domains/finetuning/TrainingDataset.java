package com.koalawiki.domains.finetuning;

import com.koalawiki.domains.Entity;
import java.time.Instant;

public class TrainingDataset extends Entity<String> {
    private String warehouseId = "";
    private String userId;
    private Instant createdAt;
    private Instant updatedAt;
    private TrainingDatasetStatus status = TrainingDatasetStatus.NOT_STARTED;
    private String name = "";
    private String endpoint = "";
    private String apiKey = "";
    private String prompt = "";
    private String model = "";

    public String getWarehouseId() { return warehouseId; }
    public void setWarehouseId(String warehouseId) { this.warehouseId = warehouseId; }
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
    public Instant getCreatedAt() { return createdAt; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }
    public Instant getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Instant updatedAt) { this.updatedAt = updatedAt; }
    public TrainingDatasetStatus getStatus() { return status; }
    public void setStatus(TrainingDatasetStatus status) { this.status = status; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEndpoint() { return endpoint; }
    public void setEndpoint(String endpoint) { this.endpoint = endpoint; }
    public String getApiKey() { return apiKey; }
    public void setApiKey(String apiKey) { this.apiKey = apiKey; }
    public String getPrompt() { return prompt; }
    public void setPrompt(String prompt) { this.prompt = prompt; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
}
