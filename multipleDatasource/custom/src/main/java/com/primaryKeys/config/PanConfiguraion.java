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

@EnableJpaRepositories(basePackages = "com.primaryKeys.Repository.pan.Pan", entityManagerFactoryRef = "panLocalContainerEntityManagerFactory", transactionManagerRef = "panPlatformTransactionManager")

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
    public DataSource panDataSource(@Qualifier("panDataSourceProperties") DataSourceProperties panDataSourceProperties) {
        return panDataSourceProperties.initializeDataSourceBuilder().type(HikariDataSource.class).build();
    }

    @Primary
    @Bean
    public LocalContainerEntityManagerFactoryBean panLocalContainerEntityManagerFactory(@Qualifier("pandataSource") DataSource pandataSource, EntityManagerFactoryBuilder builder) {

        return builder.dataSource(pandataSource).packages(Pan.class).persistenceUnit("pan").build();

    }

    @Primary
    @Bean
    public PlatformTransactionManager panPlatformTransactionManager(@Qualifier("panLocalContainerEntityManagerFactory") LocalContainerEntityManagerFactoryBean panLocalContainerEntityManagerFactory) {
        return new JpaTransactionManager(panLocalContainerEntityManagerFactory.getObject());
    }


}
