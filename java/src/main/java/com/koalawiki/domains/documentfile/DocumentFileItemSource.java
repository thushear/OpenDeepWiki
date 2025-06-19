package com.koalawiki.domains.documentfile;

import com.koalawiki.domains.Entity;

public class DocumentFileItemSource extends Entity<String> {
    private String documentFileItemId = "";
    private String address = "";
    private String name;
    private DocumentFileItem documentFileItem;

    public String getDocumentFileItemId() { return documentFileItemId; }
    public void setDocumentFileItemId(String documentFileItemId) { this.documentFileItemId = documentFileItemId; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public DocumentFileItem getDocumentFileItem() { return documentFileItem; }
    public void setDocumentFileItem(DocumentFileItem documentFileItem) { this.documentFileItem = documentFileItem; }
}
