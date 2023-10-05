package com.primaryKeys.config;


import com.primaryKeys.model.pan.Pan;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.Properties;

@EnableJpaRepositories(basePackages = "com.primaryKeys.Repository.pan", entityManagerFactoryRef = "panEntityManagerFactory", transactionManagerRef = "panTransactionManager")

@Configuration
public class PanConfiguraion {

    @Bean
    @Primary
    @ConfigurationProperties("spring.pan.datasource")

    public DataSourceProperties panDataSourceProperties() {

        return new DataSourceProperties();
    }

    @Primary
    @Bean
    @ConfigurationProperties("spring.pan.datasource.hikari")
    public DataSource panDataSource(@Qualifier("panDataSourceProperties") DataSourceProperties panDataSourceProperties) {
        return panDataSourceProperties.initializeDataSourceBuilder().type(HikariDataSource.class).build();
    }

    @Primary
    @Bean
    public LocalContainerEntityManagerFactoryBean panEntityManagerFactory(
            @Qualifier("panDataSource") DataSource panDataSource,
            EntityManagerFactoryBuilder builder) {


        Properties properties = new Properties();
//        properties.put("hibernate.hbm2ddl.auto", "validate");
        properties.put("hibernate.physical_naming_strategy",
                "org.hibernate.boot.model.naming.CamelCaseToUnderscoresNamingStrategy");
        LocalContainerEntityManagerFactoryBean efb = builder.dataSource(panDataSource)
                .packages(Pan.class)
                .persistenceUnit("pan")
                .build();

        efb.setJpaProperties(properties);
        return efb;


    }

    @Primary
    @Bean
    public PlatformTransactionManager panTransactionManager(
            @Qualifier("panEntityManagerFactory") LocalContainerEntityManagerFactoryBean panEntityManagerFactory) {

        return new JpaTransactionManager(panEntityManagerFactory.getObject());
    }


}
