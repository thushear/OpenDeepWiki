package com.koalawiki.options;

/**
 * Github 配置
 */
public class GithubOptions {
    private static String clientId;
    private static String clientSecret;
    private static String token;

    public static String getClientId() {
        return clientId;
    }

    public static String getClientSecret() {
        return clientSecret;
    }

    public static String getToken() {
        return token;
    }

    public static void initConfig(ConfigProvider configuration) {
        clientId = configuration.get("Github:ClientId", "GITHUB_CLIENT_ID");
        clientSecret = configuration.get("Github:ClientSecret", "GITHUB_CLIENT_SECRET");
        token = configuration.get("Github:Token", "GITHUB_TOKEN");
    }

    public interface ConfigProvider {
        String get(String... keys);
    }
}
