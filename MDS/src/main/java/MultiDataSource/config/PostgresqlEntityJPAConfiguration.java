package MultiDataSource.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@EnableTransactionManagement
@Configuration
@EnableJpaRepositories(

        basePackages = "MultiDataSource.orderRepo", entityManagerFactoryRef = "postgresqlLocalContainerEntityManagerFactoryBean",

        transactionManagerRef = "postgresPlatformTransactionManager")
public class PostgresqlEntityJPAConfiguration {

    @Bean
    LocalContainerEntityManagerFactoryBean postgresqlLocalContainerEntityManagerFactoryBean(EntityManagerFactoryBuilder entityManagerFactoryBuilder, @Qualifier("pstgresataSource") DataSource dataSource) {

        return entityManagerFactoryBuilder.dataSource(dataSource).packages("MultiDataSource.orderentity").build();

    }


    @Bean
    PlatformTransactionManager postgresPlatformTransactionManager(@Qualifier("postgresqlLocalContainerEntityManagerFactoryBean") LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean) {


        return new JpaTransactionManager(localContainerEntityManagerFactoryBean.getObject());


    }
}
