package com.koalawiki.domains.documentfile;

import com.koalawiki.domains.Entity;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class DocumentFileItem extends Entity<String> {
    private String title;
    private String description;
    private String content;
    private long commentCount;
    private long size;
    private String documentCatalogId;
    private int requestToken;
    private int responseToken;
    private boolean isEmbedded;
    private List<DocumentFileItemSource> source;
    private Map<String, String> metadata = new HashMap<>();
    private Map<String, String> extra = new HashMap<>();

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public long getCommentCount() { return commentCount; }
    public void setCommentCount(long commentCount) { this.commentCount = commentCount; }
    public long getSize() { return size; }
    public void setSize(long size) { this.size = size; }
    public String getDocumentCatalogId() { return documentCatalogId; }
    public void setDocumentCatalogId(String documentCatalogId) { this.documentCatalogId = documentCatalogId; }
    public int getRequestToken() { return requestToken; }
    public void setRequestToken(int requestToken) { this.requestToken = requestToken; }
    public int getResponseToken() { return responseToken; }
    public void setResponseToken(int responseToken) { this.responseToken = responseToken; }
    public boolean isEmbedded() { return isEmbedded; }
    public void setEmbedded(boolean embedded) { isEmbedded = embedded; }
    public List<DocumentFileItemSource> getSource() { return source; }
    public void setSource(List<DocumentFileItemSource> source) { this.source = source; }
    public Map<String, String> getMetadata() { return metadata; }
    public void setMetadata(Map<String, String> metadata) { this.metadata = metadata; }
    public Map<String, String> getExtra() { return extra; }
    public void setExtra(Map<String, String> extra) { this.extra = extra; }
}
