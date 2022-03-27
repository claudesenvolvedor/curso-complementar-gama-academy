package br.paduan.spring02.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.paduan.spring02.model.ContaEspecial;

public interface ContaEspecialDao extends CrudRepository<ContaEspecial, Integer> {

	public ArrayList<ContaEspecial> findByNumeroLike(int numero);

	public ArrayList<ContaEspecial> findBySaldoLessThan(double saldo);

}
