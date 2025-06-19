package com.koalawiki.domains.finetuning;

import com.koalawiki.domains.Entity;
import com.koalawiki.domains.DocumentCatalog;
import java.time.Instant;

public class FineTuningTask extends Entity<String> {
    private String warehouseId = "";
    private String trainingDatasetId = "";
    private String documentCatalogId = "";
    private String name;
    private String userId;
    private String description;
    private Instant createdAt;
    private Instant startedAt;
    private Instant completedAt;
    private FineTuningTaskStatus status = FineTuningTaskStatus.NOT_STARTED;
    private String dataset = "";
    private String error;
    private String originalDataset;
    private DocumentCatalog documentCatalog;

    public String getWarehouseId() { return warehouseId; }
    public void setWarehouseId(String warehouseId) { this.warehouseId = warehouseId; }
    public String getTrainingDatasetId() { return trainingDatasetId; }
    public void setTrainingDatasetId(String trainingDatasetId) { this.trainingDatasetId = trainingDatasetId; }
    public String getDocumentCatalogId() { return documentCatalogId; }
    public void setDocumentCatalogId(String documentCatalogId) { this.documentCatalogId = documentCatalogId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Instant getCreatedAt() { return createdAt; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }
    public Instant getStartedAt() { return startedAt; }
    public void setStartedAt(Instant startedAt) { this.startedAt = startedAt; }
    public Instant getCompletedAt() { return completedAt; }
    public void setCompletedAt(Instant completedAt) { this.completedAt = completedAt; }
    public FineTuningTaskStatus getStatus() { return status; }
    public void setStatus(FineTuningTaskStatus status) { this.status = status; }
    public String getDataset() { return dataset; }
    public void setDataset(String dataset) { this.dataset = dataset; }
    public String getError() { return error; }
    public void setError(String error) { this.error = error; }
    public String getOriginalDataset() { return originalDataset; }
    public void setOriginalDataset(String originalDataset) { this.originalDataset = originalDataset; }
    public DocumentCatalog getDocumentCatalog() { return documentCatalog; }
    public void setDocumentCatalog(DocumentCatalog documentCatalog) { this.documentCatalog = documentCatalog; }
}
