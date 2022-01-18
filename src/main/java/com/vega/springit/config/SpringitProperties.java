package com.vega.springit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("springit")
public class SpringitProperties {

    /**
     * This is our welcome message
     * */
    private String WelcomeMsg = "Hello, World!";

    public String getWelcomeMsg(){
        return WelcomeMsg;
    }

    public void setWelcomeMsg(String welcomeMsg) {
        WelcomeMsg = welcomeMsg;
    }
}
