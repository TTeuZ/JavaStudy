package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//classe que simula um banco de dados.
public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>(); // é estatico para ser da classe e nao do objeto instanciado, assim nao apaga as infos.
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	private static long chaveSeguencial = 1;
	
	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSeguencial++);
		empresa.setNome("Alura");
		lista.add(empresa);
		
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSeguencial++);
		empresa2.setNome("Caelum");
		lista.add(empresa2);
		
		Usuario u1 = new Usuario();
		u1.setLogin("paulo");
		u1.setSenha("1234");
		
		Usuario u2 = new Usuario();
		u2.setLogin("jose");
		u2.setSenha("1234");
		
		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
	}
	
	
	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSeguencial++);
		lista.add(empresa);
	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public void removeEmpresa(int id) { // metdo par apagar empresa.
		Iterator<Empresa> it = lista.iterator();
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() == id) it.remove();
		}

	}

	public Empresa buscaEmpresa(int id) {
		for (Empresa empresa : lista) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}

	public Usuario existeUsuario(String login, String senha) {
		for (Usuario u : listaUsuarios) {
			if(u.ehIgual(login, senha)) {
				return u;
			}
		}
		return null;
	}
}
