//COntroller da home

package br.com.casadocodigo.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/") // vai mapear e aparecer logo apos a leitura da "/"
	public String index() {
		System.out.println("Entrando na Home");
		return "home";  // nao é necessario colocas mais o .jsp por causa da função do AppWebCOnfiguration
	}
}
