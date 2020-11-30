package controller;

import dao.PessoaDao;
import model.Pessoa;

public class PessoaController {
	public int cadastrar(String nome, String cpf) {
		Pessoa p = new Pessoa(nome, cpf);
		PessoaDao pDao = new PessoaDao();
		return(pDao.create(p));
	}
	
}
