package com.search.blog.client.config;

import feign.Retryer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class RetryConfig {
    @Value("500")
    private long period;
    @Value("1000")
    private long maxPeriod;
    @Value("3")
    private int maxAttempt;

    public RetryConfig() {
    }

    @Bean
    public Retryer retryer() {
        return new Retryer.Default(this.period, this.maxPeriod, this.maxAttempt);
    }
}
