package com.koalawiki.domains.mcp;

import com.koalawiki.domains.Entity;

public class MCPHistory extends Entity<String> {
    private String question;
    private String answer;
    private String userId;
    private String warehouseId;
    private int costTime;
    private String ip;
    private String userAgent;

    public String getQuestion() { return question; }
    public void setQuestion(String question) { this.question = question; }
    public String getAnswer() { return answer; }
    public void setAnswer(String answer) { this.answer = answer; }
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
    public String getWarehouseId() { return warehouseId; }
    public void setWarehouseId(String warehouseId) { this.warehouseId = warehouseId; }
    public int getCostTime() { return costTime; }
    public void setCostTime(int costTime) { this.costTime = costTime; }
    public String getIp() { return ip; }
    public void setIp(String ip) { this.ip = ip; }
    public String getUserAgent() { return userAgent; }
    public void setUserAgent(String userAgent) { this.userAgent = userAgent; }
}
