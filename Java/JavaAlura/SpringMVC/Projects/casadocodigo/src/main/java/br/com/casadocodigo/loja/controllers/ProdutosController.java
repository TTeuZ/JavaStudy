package br.com.casadocodigo.loja.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.casadocodigo.loja.daos.ProdutoDAO;
import br.com.casadocodigo.loja.infra.FileSaver;
import br.com.casadocodigo.loja.models.Produto;
import br.com.casadocodigo.loja.models.tipoPreco;
import br.com.casadocodigo.loja.validation.ProdutoValidation;

@Controller
@RequestMapping("/produtos")  // foi retirado de cada mapping e colocado aqui para se tornar geral
public class ProdutosController {
	
	@Autowired  //permite que o spring injete o produtoDAO
	private ProdutoDAO produtoDao;
	
	@Autowired
	private FileSaver fileSaver;
	
	@InitBinder  // função e notação para vincular os validadores com as chamadas
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(new ProdutoValidation());
	}
	
	@RequestMapping("/form")
	public ModelAndView form(Produto produto) {
		ModelAndView modelAndView = new ModelAndView("produtos/form");  // classe utilizada para enviar itens do model para o view (back para front)
		modelAndView.addObject("tipos", tipoPreco.values()); // retornar os tipos de preços para o front;
		
		return modelAndView;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView grava(@Valid Produto produto, BindingResult result, RedirectAttributes redirectAttributes, MultipartFile arquivo) {
		
		String path = fileSaver.write("arquivos", arquivo);
		produto.setArquivoPath(path);
		
		if(result.hasErrors()) {
			return form(produto);
		}
		
		produtoDao.gravar(produto);
		redirectAttributes.addFlashAttribute("sucesso", "Produto cadastrado com sucesso!"); // vai madnar a mensagem de sucesso, isso é im atributo temporario que fica logo apos enviar o post.
		// proteje do bug do f5.
		return new ModelAndView("redirect:produtos"); // o 'redirect' esta aqui para informar par ao navegador que apos realizar esse post, ele deve nso redirecionar para o /produtos e nao no senviar para a pagina produtos.jsp
	}
	
	@RequestMapping(method=RequestMethod.GET) // isso informa quando esse função vai ser utilizada
	public ModelAndView listar() {
		List<Produto> produtos = produtoDao.listar();
		ModelAndView modelAndView = new ModelAndView("produtos/lista");
		modelAndView.addObject("produtos", produtos);
		return modelAndView;
	}
	
	@RequestMapping("/detalhe")
	public ModelAndView detalhe(Long id) {
		ModelAndView modelAndView = new ModelAndView("produtos/detalhe");
		Produto produto = produtoDao.find(id);
		modelAndView.addObject("produto", produto);
		
		return modelAndView;
	}
	
}

// o binding result é o que vai nos informar se houve erros ou nao
