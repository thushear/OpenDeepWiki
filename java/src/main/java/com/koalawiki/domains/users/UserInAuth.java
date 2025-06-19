package com.koalawiki.domains.users;

import com.koalawiki.domains.Entity;

public class UserInAuth extends Entity<String> {
    private String userId = "";
    private String provider = "";
    private String authId = "";

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
    public String getProvider() { return provider; }
    public void setProvider(String provider) { this.provider = provider; }
    public String getAuthId() { return authId; }
    public void setAuthId(String authId) { this.authId = authId; }
}
