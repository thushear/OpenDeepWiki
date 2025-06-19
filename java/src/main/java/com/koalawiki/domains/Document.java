package com.koalawiki.domains;

import com.koalawiki.domains.warehouse.WarehouseStatus;
import java.time.Instant;

public class Document extends Entity<String> {
    private String warehouseId = "";
    private Instant lastUpdate = Instant.now();
    private String description = "";
    private long likeCount = 0;
    private long commentCount = 0;
    private String gitPath = "";
    private WarehouseStatus status;

    public String getWarehouseId() { return warehouseId; }
    public void setWarehouseId(String warehouseId) { this.warehouseId = warehouseId; }

    public Instant getLastUpdate() { return lastUpdate; }
    public void setLastUpdate(Instant lastUpdate) { this.lastUpdate = lastUpdate; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public long getLikeCount() { return likeCount; }
    public void setLikeCount(long likeCount) { this.likeCount = likeCount; }

    public long getCommentCount() { return commentCount; }
    public void setCommentCount(long commentCount) { this.commentCount = commentCount; }

    public String getGitPath() { return gitPath; }
    public void setGitPath(String gitPath) { this.gitPath = gitPath; }

    public WarehouseStatus getStatus() { return status; }
    public void setStatus(WarehouseStatus status) { this.status = status; }
}
