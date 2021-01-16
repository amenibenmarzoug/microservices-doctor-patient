package com.eniso.pm.servicedoctor;

import javax.activation.DataSource;
import javax.annotation.Resource;
import javax.naming.NamingException;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JndiDataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.eniso.pm.controller.DoctorController;


@EnableAutoConfiguration

@ComponentScan(basePackages="com.eniso.pm.controller")
@EntityScan(basePackages = "com.eniso.pm.entities")
@EnableJpaRepositories("com.eniso.pm.repository")
@SpringBootApplication


//@EnableJpaRepositories(basePackages = { "com.eniso.pm.controller" , "com.eniso.pm.repository" } )
//@EnableTransactionManagement
//@Resource(lookup="java:jboss/datasources/test") 
public class ServiceDoctorApplication extends SpringBootServletInitializer  {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ServiceDoctorApplication.class);
	} 

	public static void main(String[] args) {
		SpringApplication.run(ServiceDoctorApplication.class, args);
	}


//   // @Primary
//	@Bean
//	//@Lazy
//	public DataSource dataSource() 
//	{
//	  JndiDataSourceLookup dataSourceLookup = new JndiDataSourceLookup();
//	  DataSource dataSource = (DataSource) dataSourceLookup.getDataSource("java:jboss/datasources/test");
//	  return dataSource;
//	}
////	
//    @Bean
//    public PlatformTransactionManager transactionManagerTwo() throws NamingException {
//        return new DataSourceTransactionManager((javax.sql.DataSource) dataSource());
//    }
    //@Primary
//    @Bean(name="entityManagerFactory")
//    public LocalSessionFactoryBean sessionFactory() {
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean(); 
//
//        return sessionFactory;
//    }
//    @Bean
//    public JpaTransactionManager jpaTransactionManager() {
//    JpaTransactionManager transactionManager = new JpaTransactionManager();
//    transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
//    return transactionManager;
//    }
//    
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//
//    LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//    //entityManagerFactoryBean.setJpaVendorAdapter(vendorAdaptor());
//    entityManagerFactoryBean.setDataSource((javax.sql.DataSource) dataSource());
//    entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
//   // entityManagerFactoryBean.setPackagesToScan(ENTITYMANAGER_PACKAGES_TO_SCAN);
//
//    return entityManagerFactoryBean;
//    }
	
}
