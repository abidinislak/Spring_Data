package MultiDataSource.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;


@Configuration
public class PostgresqlDataSourceConfiguration {


    @Bean
    @ConfigurationProperties("spring.datasource.pg")
    public DataSourceProperties postgresqDatasourceProperties() {


        return new DataSourceProperties();

    }


    @Bean
    public DataSource pstgresataSource() {

        return postgresqDatasourceProperties().initializeDataSourceBuilder().build();

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
