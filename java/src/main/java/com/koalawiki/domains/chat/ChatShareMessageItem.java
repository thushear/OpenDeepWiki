package com.koalawiki.domains.chat;

import com.koalawiki.domains.Entity;
import java.util.ArrayList;
import java.util.List;

public class ChatShareMessageItem extends Entity<String> {
    private String chatShareMessageId = "";
    private String warehouseId = "";
    private String question = "";
    private String answer = "";
    private String think = "";
    private int promptToken;
    private int completionToken;
    private int totalTime;
    private List<String> files = new ArrayList<>();

    public String getChatShareMessageId() { return chatShareMessageId; }
    public void setChatShareMessageId(String chatShareMessageId) { this.chatShareMessageId = chatShareMessageId; }
    public String getWarehouseId() { return warehouseId; }
    public void setWarehouseId(String warehouseId) { this.warehouseId = warehouseId; }
    public String getQuestion() { return question; }
    public void setQuestion(String question) { this.question = question; }
    public String getAnswer() { return answer; }
    public void setAnswer(String answer) { this.answer = answer; }
    public String getThink() { return think; }
    public void setThink(String think) { this.think = think; }
    public int getPromptToken() { return promptToken; }
    public void setPromptToken(int promptToken) { this.promptToken = promptToken; }
    public int getCompletionToken() { return completionToken; }
    public void setCompletionToken(int completionToken) { this.completionToken = completionToken; }
    public int getTotalTime() { return totalTime; }
    public void setTotalTime(int totalTime) { this.totalTime = totalTime; }
    public List<String> getFiles() { return files; }
    public void setFiles(List<String> files) { this.files = files; }
}
