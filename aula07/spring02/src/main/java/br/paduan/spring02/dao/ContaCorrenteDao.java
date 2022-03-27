package br.paduan.spring02.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.paduan.spring02.model.ContaCorrente;

public interface ContaCorrenteDao extends CrudRepository<ContaCorrente, Integer> {

	public ArrayList<ContaCorrente> findByNumeroLike(int numero);

	public ArrayList<ContaCorrente> findBySaldoLessThan(double saldo);

}
