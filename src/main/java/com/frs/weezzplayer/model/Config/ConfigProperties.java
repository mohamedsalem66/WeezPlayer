package com.frs.weezzplayer.model.Config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigProperties {

    @Bean
    @ConfigurationProperties(prefix = "storage")
    public StorageConfig storageConfig(){
        return new StorageConfig();
    }

    @Bean
    @ConfigurationProperties(prefix = "longpolling")
    public LongPollingConfig longPollingConfig(){
        return new LongPollingConfig();
    }

}
