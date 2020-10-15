//package com.laher.drools.config;
//
//import org.kie.api.KieServices;
//import org.kie.api.builder.KieBuilder;
//import org.kie.api.builder.KieFileSystem;
//import org.kie.api.builder.KieRepository;
//import org.kie.api.runtime.KieContainer;
//import org.kie.api.runtime.KieSession;
//import org.kie.internal.io.ResourceFactory;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.FileSystemResource;
//import org.springframework.core.io.Resource;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//
//import java.io.IOException;
//
///**
// * 配置
// * <p>
// *
// * @author laher
// * @version 1.0.0
// * @date 2020/10/15
// */
//@Configuration
//public class DroolsConfig {
//
//    private static final String RULE_PATH = "rules/";
//
//    /**
//     * 获取RULE_PATH的资源文件
//     *
//     * @return 资源文件
//     * @throws IOException 异常
//     */
//    private Resource[] getResources() throws IOException {
//        PathMatchingResourcePatternResolver path = new PathMatchingResourcePatternResolver();
//        return path.getResources("classpath*:" + RULE_PATH + "**/*.*");
//    }
//
//    @Bean
//    @ConditionalOnMissingBean(KieFileSystem.class)
//    public KieFileSystem kieFileSystem() throws IOException {
//        KieFileSystem kieFileSystem = getKieServices().newKieFileSystem();
//        Resource[] resources = getResources();
//        for (Resource resource : resources) {
//            String filePath = ((FileSystemResource)resource).getPath();
//            String fileLocalPath = filePath.substring(filePath.indexOf(RULE_PATH));
//            kieFileSystem.write(ResourceFactory.newClassPathResource(fileLocalPath, "UTF-8"));
//        }
//        return kieFileSystem;
//    }
//
//    @Bean
//    @ConditionalOnMissingBean(KieSession.class)
//    public KieSession kieSession() throws IOException {
//        return kieContainer().newKieSession();
//    }
//
//    @Bean
//    @ConditionalOnMissingBean(KieContainer.class)
//    public KieContainer kieContainer() throws IOException {
//        KieRepository kieRepository = getKieServices().getRepository();
//        kieRepository.addKieModule(kieRepository::getDefaultReleaseId);
//        KieBuilder kieBuilder = getKieServices().newKieBuilder(kieFileSystem());
//        kieBuilder.buildAll();
//        return getKieServices().newKieContainer(kieRepository.getDefaultReleaseId());
//    }
//
//    /**
//     * kie环境
//     *
//     * @return 结果
//     */
//    private KieServices getKieServices() {
//        return KieServices.Factory.get();
//    }
//}
