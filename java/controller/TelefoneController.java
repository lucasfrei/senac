package controller;

import java.util.ArrayList;

import model.dao.TelefoneDAO;
import model.entity.Telefone;

public class TelefoneController {
	public ArrayList<Telefone> pesquisarTodos(){
		TelefoneDAO telefoneDAO = new TelefoneDAO();
		return telefoneDAO.consultarTodos();
	}
}
