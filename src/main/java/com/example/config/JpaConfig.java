//package com.example.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.JpaVendorAdapter;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//
///**
// * @author: dj
// * @create: 2019-12-16 15:53
// * @description:
// */
//@Configuration
//@EnableJpaRepositories(
//        basePackages = "com.example.modules.*.dao",
//        transactionManagerRef = "jpaTransactionManager",
//        entityManagerFactoryRef = "localContainerEntityManagerFactoryBean"
//)
//@EnableTransactionManagement
//public class JpaConfig {
//    @Autowired
//    @Bean
//    public JpaTransactionManager jpaTransactionManager(@Qualifier(value = "EmbeddedDataSource") DataSource dataSource, EntityManagerFactory entityManagerFactory) {
//        JpaTransactionManager jpaTransactionManager
//                = new JpaTransactionManager();
//        jpaTransactionManager.setEntityManagerFactory(entityManagerFactory);
//        jpaTransactionManager.setDataSource(dataSource);
//
//        return jpaTransactionManager;
//    }
//
//    @Autowired
//    @Bean
//    LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean(@Qualifier(value = "EmbeddedDataSource") DataSource dataSource, JpaVendorAdapter jpaVendorAdapter) {
//        LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean
//                = new LocalContainerEntityManagerFactoryBean();
//        localContainerEntityManagerFactoryBean.setDataSource(dataSource);
//        localContainerEntityManagerFactoryBean.setPackagesToScan("com.site.model");
//        localContainerEntityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter);
//        return localContainerEntityManagerFactoryBean;
//    }
//
//    @Bean
//    public JpaVendorAdapter jpaVendorAdapter() {
//        HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
//        hibernateJpaVendorAdapter.setGenerateDdl(true);
//        hibernateJpaVendorAdapter.setShowSql(true);
//        hibernateJpaVendorAdapter.setDatabasePlatform("com.enigmabridge.hibernate.dialect.SQLiteDialect");
//        return hibernateJpaVendorAdapter;
//    }
//}
