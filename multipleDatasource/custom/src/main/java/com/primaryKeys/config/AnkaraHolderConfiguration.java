package com.primaryKeys.config;


import com.primaryKeys.model.ankara.Ankara;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@EnableJpaRepositories(basePackages = "com.primaryKeys.Repository.ankaraHolder.AnkaraHolder", entityManagerFactoryRef = "ankaraholderEntityManagerFactory", transactionManagerRef = "ankaraHolderPlatformTransactionManager")

@Configuration
public class AnkaraHolderConfiguration {


    @Bean
    @ConfigurationProperties("spring.ankaraHolder.datasource")
    public DataSourceProperties ankaraHolderDataSourceProperties() {


        return new DataSourceProperties();
    }


    @Bean
    public DataSource ankaraHolderDataSource(@Qualifier("ankaraHolderDataSourceProperties") DataSourceProperties ankaraHolderDataSourceProperties) {
        return ankaraHolderDataSourceProperties.initializeDataSourceBuilder().type(HikariDataSource.class).build();
    }


    @Bean
    public LocalContainerEntityManagerFactoryBean ankaraEntityManagerFactory(
            @Qualifier("ankaraDataSource") DataSource ankaraDataSource,
            EntityManagerFactoryBuilder builder) {
        return builder.dataSource(ankaraDataSource)
                .packages(Ankara.class)
                .persistenceUnit("ankara")
                .build();
    }

    @Bean
    public PlatformTransactionManager ankaraHolderPlatformTransactionManager(@Qualifier("ankaraHolderLocalContainerEntityManagerFactory") LocalContainerEntityManagerFactoryBean ankaraHolderLocalContainerEntityManagerFactory) {
        return new JpaTransactionManager(ankaraHolderLocalContainerEntityManagerFactory.getObject());
    }

}
