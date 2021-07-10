package br.com.casadocodigo.loja.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.casadocodigo.loja.models.Produto;

public class ProdutoValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Produto.class.isAssignableFrom(clazz); // isso indica que a classe produto é suportada por esse validador, apenas assim poderemos validar o produto por essa classe
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "titulo", "field.required"); // objeto que nos fornce uma validação melhor.
		ValidationUtils.rejectIfEmpty(errors, "descricao", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "dataLancamento", "field.required");
		
		Produto produto = (Produto) target;
		if (produto.getPaginas() <= 0 ) {
			errors.rejectValue("paginas", "field.required"); // o errors vai reijeitar o valor e enviar o erro.
		}
	}
}
