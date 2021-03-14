package com.buje.app.ws.mobileappws.security;

import com.buje.app.ws.mobileappws.SpringApplicationContext;

public class SecurityConstants {
    public static final long EXPIRATION_TIME = 864_000_000L; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/users";
//    public static final String TOKEN_SECRET = "faLkemaionrb63BveuB453ldkmg9e";

    public static String getTokenSecret() {
        AppProperties appProperties = (AppProperties) SpringApplicationContext.getBean("appProperties");
        return appProperties.getTokenSecret();
    }
}
