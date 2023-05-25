package com.blockchaine.workshop.configuration;

import com.blockchaine.workshop.entity.Blockchain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BlockchainConfig {

    @Bean
    @Scope("singleton")
    public Blockchain blockchain() {
        return new Blockchain(2);
    }
}