package br.com.fatec.sistema.dao;

public interface DAO {
    public void create();
    public Object select();
    public void update();
    public void delete(Integer id);
}
