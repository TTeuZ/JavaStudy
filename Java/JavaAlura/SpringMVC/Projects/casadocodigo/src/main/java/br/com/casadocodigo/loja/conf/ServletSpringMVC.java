// Arquivo de configuração do servlet 

package br.com.casadocodigo.loja.conf;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {AppWebConfiguration.class, JPAConfiguration.class}; // retornar as classes de configuração do servlet
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};  // indica que vai mapear todo o que vier apos a "/"
	}
	
	@Override
	protected Filter[] getServletFilters() {  // fução para instanciar o padrao de escrita 'UTF-8' para aceitar acentos e wherever
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		encodingFilter.setEncoding("UTF-8");
		return new Filter[] {encodingFilter};
	}
	
	@Override // configuração do Multipart para receber arquivos
	protected void customizeRegistration(Dynamic registration) {
		registration.setMultipartConfig(new MultipartConfigElement(""));
	}

}
