package com.koalawiki.domains.warehouse;

import com.koalawiki.domains.Entity;
import com.koalawiki.domains.ClassifyType;

public class Warehouse extends Entity<String> {
    private String organizationName = "";
    private String name;
    private String description;
    private String address;
    private String gitUserName;
    private String gitPassword;
    private String email;
    private String type;
    private String branch;
    private WarehouseStatus status;
    private String error;
    private String prompt;
    private String version;
    private boolean isEmbedded;
    private boolean isRecommended;
    private String optimizedDirectoryStructure;
    private String readme;
    private ClassifyType classify;

    public String getOrganizationName() { return organizationName; }
    public void setOrganizationName(String organizationName) { this.organizationName = organizationName; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getGitUserName() { return gitUserName; }
    public void setGitUserName(String gitUserName) { this.gitUserName = gitUserName; }
    public String getGitPassword() { return gitPassword; }
    public void setGitPassword(String gitPassword) { this.gitPassword = gitPassword; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getBranch() { return branch; }
    public void setBranch(String branch) { this.branch = branch; }
    public WarehouseStatus getStatus() { return status; }
    public void setStatus(WarehouseStatus status) { this.status = status; }
    public String getError() { return error; }
    public void setError(String error) { this.error = error; }
    public String getPrompt() { return prompt; }
    public void setPrompt(String prompt) { this.prompt = prompt; }
    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }
    public boolean isEmbedded() { return isEmbedded; }
    public void setEmbedded(boolean embedded) { isEmbedded = embedded; }
    public boolean isRecommended() { return isRecommended; }
    public void setRecommended(boolean recommended) { isRecommended = recommended; }
    public String getOptimizedDirectoryStructure() { return optimizedDirectoryStructure; }
    public void setOptimizedDirectoryStructure(String optimizedDirectoryStructure) { this.optimizedDirectoryStructure = optimizedDirectoryStructure; }
    public String getReadme() { return readme; }
    public void setReadme(String readme) { this.readme = readme; }
    public ClassifyType getClassify() { return classify; }
    public void setClassify(ClassifyType classify) { this.classify = classify; }
}
