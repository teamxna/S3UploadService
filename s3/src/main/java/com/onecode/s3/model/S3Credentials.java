package com.onecode.s3.model;

import java.io.Serializable;

public class S3Credentials implements Serializable {

    private String accessKey;
    private String secretKey;
    private String sessionToken;

    public S3Credentials(String accessKey, String secretKey, String sessionToken) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
        this.sessionToken = sessionToken;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public String getSessionToken() {
        return sessionToken;
    }
}