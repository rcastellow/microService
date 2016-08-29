package com.pac.sample.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by RobCastellow on 8/20/16.
 */

@SpringBootApplication
public class MicroServiceCoreConfiguration {

    private static final Logger log = LoggerFactory.getLogger(MicroServiceCoreConfiguration.class);

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCoreConfiguration.class, args);
    }

}
