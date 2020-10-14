package com.laher.drools.supermarket.config;

import org.kie.server.api.marshalling.MarshallingFormat;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * drools远程配置
 * <p>
 *
 * @author laher
 * @version 1.0.0
 * @date 2020/10/14
 */
@Configuration
public class DroolsRemoteConfig {
    private static final String URL = "http://192.168.50.44:8180/kie-server/services/rest/server";
    private static final String USER = "kieserver";
    private static final String PASSWORD = "kieserver1!";

    @Bean
    @ConditionalOnMissingBean(KieServicesClient.class)
    public KieServicesClient kieServicesClient() {
        KieServicesConfiguration kieServicesConfiguration =
            KieServicesFactory.newRestConfiguration(URL, USER, PASSWORD, 10000L);
        kieServicesConfiguration.setMarshallingFormat(MarshallingFormat.JSON);
        return KieServicesFactory.newKieServicesClient(kieServicesConfiguration);
    }

}
