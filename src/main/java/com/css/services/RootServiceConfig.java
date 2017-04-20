package com.css.services;

import com.css.config.DBRootConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({"com.css.services","com.css.daos"})
@Import({DBRootConfig.class})
public class RootServiceConfig {
    
}
