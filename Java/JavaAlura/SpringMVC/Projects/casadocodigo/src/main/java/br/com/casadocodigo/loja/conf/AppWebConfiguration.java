// configuração do WEb

package br.com.casadocodigo.loja.conf;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.format.datetime.DateFormatterRegistrar;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.casadocodigo.loja.controllers.HomeController;
import br.com.casadocodigo.loja.daos.ProdutoDAO;
import br.com.casadocodigo.loja.infra.FileSaver;

@EnableWebMvc
@ComponentScan(basePackageClasses = {HomeController.class,ProdutoDAO.class,FileSaver.class})  // Seleciona e indica as classes que serao controladas por ele
public class AppWebConfiguration {
	
	@Bean // isso serve para indicar que essa função pode ser controlada pelo spring
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();  // para controlar e configurar as views
		resolver.setPrefix("/WEB-INF/views/");  // seta a rota prefixada
		resolver.setSuffix(".jsp"); // seta o sulfixo dos aquivos
		
		return resolver;
	}
	
	@Bean
	public MessageSource messageSource() { // função para informar aonde encontrar o arquivo com as mensagens de erro
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("/WEB-INF/message");
		messageSource.setDefaultEncoding("UTF-8");
		messageSource.setCacheSeconds(1);
		
		return messageSource;
	}
	
	@Bean
	public FormattingConversionService mvcConversionService() {
		DefaultFormattingConversionService convertionService = new DefaultFormattingConversionService(); // para setar uma formatação padrao
		DateFormatterRegistrar registrar = new DateFormatterRegistrar();  // para setar um formato de registro de data
		registrar.setFormatter(new DateFormatter("dd/MM/yyyy")); // finalmente setando o tipo da data
		registrar.registerFormatters(convertionService); // para registrar a formatação no serviço de conversão
		
		return convertionService;
	}
	
	@Bean
	public MultipartResolver multipartResolver() {
		return new StandardServletMultipartResolver(); // resolver padrao para configuração de recebimetno de arquivos
	}
}
