package model.dao;

import java.util.List;

public interface BaseDAO<T> {
	
	public T inserir(T novoObjeto);
	
	public boolean atualizar(T objeto);
	
	public boolean remover(int id);
	
	public T consultar(int id);
	
	public List<T> consultarTodos();
}
