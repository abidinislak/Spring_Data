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
import java.util.Properties;

@EnableJpaRepositories(basePackages = "com.primaryKeys.Repository.ankara",


        entityManagerFactoryRef = "ankaraEntityManagerFactory", transactionManagerRef = "ankaraTransactionManager")
@Configuration
public class AnkaraConfiguraion {

    @Bean
    @ConfigurationProperties("spring.ankara.datasource")
    public DataSourceProperties ankaraDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties("spring.ankara.datasource.hikari")

    public DataSource ankaraDataSource(@Qualifier("ankaraDataSourceProperties") DataSourceProperties ankaraDataSourceProperties) {
        return ankaraDataSourceProperties.initializeDataSourceBuilder()
                .type(HikariDataSource.class)
                .build();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean ankaraEntityManagerFactory(
            @Qualifier("ankaraDataSource") DataSource ankaraDataSource,
            EntityManagerFactoryBuilder builder) {

        Properties properties = new Properties();
//        properties.put("hibernate.hbm2ddl.auto", "validate");
        properties.put("hibernate.physical_naming_strategy",
                "org.hibernate.boot.model.naming.CamelCaseToUnderscoresNamingStrategy");
        LocalContainerEntityManagerFactoryBean efb = builder.dataSource(ankaraDataSource)
                .packages(Ankara.class)
                .persistenceUnit("ankara")
                .build();

        efb.setJpaProperties(properties);
        return efb;
    }

    @Bean
    public PlatformTransactionManager ankaraTransactionManager(
            @Qualifier("ankaraEntityManagerFactory") LocalContainerEntityManagerFactoryBean ankaraEntityManagerFactory) {

        return new JpaTransactionManager(ankaraEntityManagerFactory.getObject());
    }


}
