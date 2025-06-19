package com.koalawiki.domains.chat;

import com.koalawiki.domains.Entity;
import java.util.ArrayList;
import java.util.List;

public class ChatShareMessage extends Entity<String> {
    private String warehouseId = "";
    private boolean isDeep = false;
    private String title = "";
    private String ip = "";
    private String question = "";
    private String userId;
    private List<ChatShareMessageItem> items = new ArrayList<>();

    public String getWarehouseId() { return warehouseId; }
    public void setWarehouseId(String warehouseId) { this.warehouseId = warehouseId; }
    public boolean isDeep() { return isDeep; }
    public void setDeep(boolean deep) { isDeep = deep; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getIp() { return ip; }
    public void setIp(String ip) { this.ip = ip; }
    public String getQuestion() { return question; }
    public void setQuestion(String question) { this.question = question; }
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
    public List<ChatShareMessageItem> getItems() { return items; }
    public void setItems(List<ChatShareMessageItem> items) { this.items = items; }
}
