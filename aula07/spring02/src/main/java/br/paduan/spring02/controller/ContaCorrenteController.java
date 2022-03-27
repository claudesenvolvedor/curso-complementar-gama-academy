package br.paduan.spring02.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.paduan.spring02.dao.ContaCorrenteDao;
import br.paduan.spring02.model.ContaCorrente;

@RestController
@CrossOrigin("*")

public class ContaCorrenteController {

	@Autowired

	private ContaCorrenteDao dao;

	@GetMapping("/teste1")
	public ResponseEntity<ArrayList<ContaCorrente>> obterTodos() {
		ArrayList<ContaCorrente> lista = (ArrayList<ContaCorrente>) dao.findAll();

		if (lista != null) {
			return ResponseEntity.ok(lista); // ok - status 200
		} else {
			return ResponseEntity.notFound().build(); // status 404
		}
	}

	@GetMapping("/teste1/{numero}")
	public ResponseEntity<ContaCorrente> obterContaCorrentePorNumero(@PathVariable int numero) {
		ContaCorrente teste1 = dao.findById(numero).orElse(null);

		if (teste1 != null) {
			return ResponseEntity.ok(teste1);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping("/teste1/novo")
	public ResponseEntity<ContaCorrente> novoContaCorrente(@RequestBody ContaCorrente teste1) {
		try {
			ContaCorrente novoContaCorrente = dao.save(teste1);
			return ResponseEntity.ok(novoContaCorrente);
		} catch (Exception e) {
			// return ResponseEntity.badRequest().build();
			return ResponseEntity.status(400).build();
		}

	}

	@PostMapping("/teste1/atualiza")
	public ResponseEntity<ContaCorrente> atualizaContaCorrente(@RequestBody ContaCorrente teste1) {
		try {
			if (teste1.getNumero() > 0) {
				ContaCorrente novoContaCorrente = dao.save(teste1);
				return ResponseEntity.ok(novoContaCorrente);
			}
			return ResponseEntity.badRequest().build();

		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}
	}
}
