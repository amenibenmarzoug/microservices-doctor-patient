package com.eniso.pm.servicepatient;

import java.util.Properties;

import javax.activation.DataSource;
import javax.naming.NamingException;

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