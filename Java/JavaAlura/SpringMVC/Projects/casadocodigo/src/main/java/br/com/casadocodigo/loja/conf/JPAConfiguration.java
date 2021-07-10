package br.com.casadocodigo.loja.conf;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement  // isso permite que o spring controle todas as transaçoes feitas pela jpa 'em.transition...."
public class JPAConfiguration {
	
	@Bean // permite que o spring invoque esse metodo automaticamente
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();  // aparentemente se iguala ao percistence.xml, nesse caso o spring ja fornece classes prontas para a estruturação
	
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		factoryBean.setJpaVendorAdapter(vendorAdapter); // seta o vendor adapter na factory
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();  // isso é utilizado para indicar o nome do banco de dados que vai ser usado, usuario e senha para entrar
	
		dataSource.setUsername("root");  // usuario
		dataSource.setPassword("pregox99");  // senha
		dataSource.setUrl("jdbc:mysql://localhost/casadocodigo"); // nome do banco
		dataSource.setDriverClassName("com.mysql.jdbc.Driver"); // seta a classe driver que vai ser utilizada
		
		factoryBean.setDataSource(dataSource); // seta a datasource na factory
		
		Properties props = new Properties();
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");  // seta o dialeto
		props.setProperty("hibernate.show_sql", "true");
		props.setProperty("hibernate.hbm2ddl.auto", "update"); // para atualizar o banco automaticamente, a jpa ira gerenciar todo o banco
		
		factoryBean.setJpaProperties(props); // seta as properties na factory
		factoryBean.setPackagesToScan("br.com.casadocodigo.loja.models"); // indica o pacote aonde vamos ter as entidades
		
		return factoryBean;
	}
	
	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory emf) { // ira receber uma factory
		return new JpaTransactionManager(emf); // associa a factory com o gerente de transiçoes
	}
}


// é necessario utilizr um vendoradapter para saber a implementacao do JPA que esta sendo utilizada
// para isso é necessario ciar um aparttir do hibernate 'linha 14'