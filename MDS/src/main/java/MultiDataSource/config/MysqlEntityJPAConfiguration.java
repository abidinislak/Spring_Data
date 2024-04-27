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

        basePackages = "MultiDataSource.repository", entityManagerFactoryRef = "mysqlLocalContainerEntityManagerFactoryBean",
transactionManagerRef = "mysqlPlatformTransactionManager")
public class MysqlEntityJPAConfiguration {

    @Bean
    LocalContainerEntityManagerFactoryBean mysqlLocalContainerEntityManagerFactoryBean(EntityManagerFactoryBuilder entityManagerFactoryBuilder, @Qualifier("mysqlDataSource") DataSource dataSource) {

        return entityManagerFactoryBuilder.dataSource(dataSource).packages("MultiDataSource.productEntity").build();

    }

    @Bean
    PlatformTransactionManager mysqlPlatformTransactionManager(@Qualifier("mysqlLocalContainerEntityManagerFactoryBean") LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean){

        return new JpaTransactionManager(localContainerEntityManagerFactoryBean.getObject());
    }
}
