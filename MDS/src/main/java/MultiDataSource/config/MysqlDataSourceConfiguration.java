package MultiDataSource.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


@Configuration
public class MysqlDataSourceConfiguration {


    @Bean
    @ConfigurationProperties("spring.datasource.mysql")
    public DataSourceProperties mysqlDatasourceProperties(){




        return new DataSourceProperties();

    }

@Primary
    @Bean
    public DataSource mysqlDataSource(){

      return mysqlDatasourceProperties().initializeDataSourceBuilder().build();

    }
//    @Bean
//    public DataSource mysqlDataSource(){
//
//        DriverManagerDataSource dataSource=new DriverManagerDataSource();
//
//        dataSource.setPassword(mysqlDatasourceProperties().getPassword());
//        dataSource.setUsername(mysqlDatasourceProperties().getUsername());
//        dataSource.setUrl(mysqlDatasourceProperties().getUrl());
//return dataSource;
//
//    }
}
