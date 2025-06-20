package com.koalawiki.options;

import javax.crypto.spec.SecretKeySpec;
import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.Objects;

/**
 * JWT配置选项
 */
public class JwtOptions {
    /**
     * 配置名称
     */
    public static final String NAME = "Jwt";

    /** 密钥 */
    private String secret = "";

    /** 颁发者 */
    private String issuer = "";

    /** 接收者 */
    private String audience = "";

    /** 过期时间（分钟） */
    private int expireMinutes = 60 * 24; // 默认1天

    /** 刷新令牌过期时间（分钟） */
    private int refreshExpireMinutes = 60 * 24 * 7; // 默认7天

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public int getExpireMinutes() {
        return expireMinutes;
    }

    public void setExpireMinutes(int expireMinutes) {
        this.expireMinutes = expireMinutes;
    }

    public int getRefreshExpireMinutes() {
        return refreshExpireMinutes;
    }

    public void setRefreshExpireMinutes(int refreshExpireMinutes) {
        this.refreshExpireMinutes = refreshExpireMinutes;
    }

    /**
     * 获取签名凭证
     */
    public SecretKey getSymmetricSecurityKey() {
        return new SecretKeySpec(secret.getBytes(StandardCharsets.UTF_8), "HmacSHA256");
    }

    /**
     * 初始化配置
     */
    public static JwtOptions initConfig(ConfigProvider configuration) {
        JwtOptions options = configuration.getSection(NAME, JwtOptions.class);
        if (options == null) {
            options = new JwtOptions();
        }

        if (options.secret == null || options.secret.isEmpty()) {
            options.secret = UUID.randomUUID().toString().replace("-", "") +
                    UUID.randomUUID().toString().replace("-", "");
        }

        if (options.issuer == null || options.issuer.isEmpty()) {
            options.issuer = "KoalaWiki";
        }

        if (options.audience == null || options.audience.isEmpty()) {
            options.audience = "KoalaWiki";
        }

        return options;
    }

    /**
     * 简单的配置提供者接口，便于示例
     */
    public interface ConfigProvider {
        <T> T getSection(String name, Class<T> clazz);
    }
}
