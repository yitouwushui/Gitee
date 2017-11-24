package com.yitouwushui.gitee.model;

/**
 * Created by yitouwushui on 2017/11/23.
 * 身份验证
 */
public class Auth {

    /**
     * @example
     * access_token : 0797a8058f7b72d60027913c388a0a70
     * token_type : bearer
     * expires_in : 86400
     * refresh_token : 97e4344e97bb965df3f25a10463c6688624d2d774f42ac0a736366ba87973aa2
     * scope : user_info projects pull_requests issues notes keys hook groups gists
     * created_at : 1511439625
     */
    /**令牌*/
    private String accessToken;
    /**持有人*/
    private String tokenType;
    /**有效期*/
    private long expiresIn;
    /**刷新令牌*/
    private String refreshToken;
    /**令牌范围  scope : *user_info projects pull_requests issues notes keys hook groups gists*/
    private String scope;
    /**创建时间 **/
    private long createdAt;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }
}
