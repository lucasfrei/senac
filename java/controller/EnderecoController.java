package controller;

import java.util.ArrayList;

import model.dao.EnderecoDAO;
import model.entity.Endereco;

public class EnderecoController {

	public ArrayList<Endereco> pesquisarTodos(){
		EnderecoDAO enderecoDAO = new EnderecoDAO();
		return enderecoDAO.consultarTodos();
	}
}
