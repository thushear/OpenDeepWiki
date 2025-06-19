package com.koalawiki.domains;

public class DocumentOverview extends Entity<String> {
    private String documentId;
    private String content;
    private String title;

    public String getDocumentId() { return documentId; }
    public void setDocumentId(String documentId) { this.documentId = documentId; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
}
