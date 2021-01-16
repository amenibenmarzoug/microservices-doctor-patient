package com.eniso.pm.servicedoctor;

import java.util.Properties;

import javax.activation.DataSource;
import javax.naming.NamingException;
import javax.persistence.EntityManagerFactory;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.jndi.JndiTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//@Configuration
//@EnableTransactionManagement
//@ComponentScan("com.eniso.pm.repository")
//@PropertySource("classpath:application.properties")
//@EnableJpaRepositories(basePackages = "com.eniso.pm.repository")
public class PersistenceJNDIConfig {

//     @Autowired
//        private Environment env;
//
//        @Bean
//        public LocalContainerEntityManagerFactoryBean entityManagerFactory() 
//          throws NamingException {
//            LocalContainerEntityManagerFactoryBean em 
//              = new LocalContainerEntityManagerFactoryBean();
//            em.setDataSource((javax.sql.DataSource) dataSource());
//            em.setPackagesToScan("com.sudeep.jpa.modal");
//            em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
//          //  em.setJpaProperties(additionalProperties());
//            // rest of entity manager configuration
//            return em;
//        }
//
//        @Bean
//        public DataSource dataSource() throws NamingException {
//            return (DataSource) new JndiTemplate().lookup(env.getProperty("spring.datasource.jndi-name"));
//        }
//
//        @Bean
//        public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
//
//            return new JpaTransactionManager(emf);
//        }
//        @Bean
//        public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
//            return new PersistenceExceptionTranslationPostProcessor();
//        }
//        final Properties additionalProperties() {
//            final Properties hibernateProperties = new Properties();
//            hibernateProperties.setProperty("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
//            hibernateProperties.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
//            hibernateProperties.setProperty("hibernate.cache.use_second_level_cache", "false");
//            return hibernateProperties;
//        }
}