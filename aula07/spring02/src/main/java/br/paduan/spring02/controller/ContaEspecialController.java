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

import br.paduan.spring02.dao.ContaEspecialDao;
import br.paduan.spring02.model.ContaEspecial;

@RestController
@CrossOrigin("*")

public class ContaEspecialController {

	@Autowired

	private ContaEspecialDao dao;

	@GetMapping("/teste2")
	public ResponseEntity<ArrayList<ContaEspecial>> obterTodos() {
		ArrayList<ContaEspecial> lista = (ArrayList<ContaEspecial>) dao.findAll();

		if (lista != null) {
			return ResponseEntity.ok(lista); // ok - status 200
		} else {
			return ResponseEntity.notFound().build(); // status 404
		}
	}

	@GetMapping("/teste2/{numero}")
	public ResponseEntity<ContaEspecial> obterContaEspecialPorNumero(@PathVariable int numero) {
		ContaEspecial teste2 = dao.findById(numero).orElse(null);

		if (teste2 != null) {
			return ResponseEntity.ok(teste2);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping("/teste2/novo")
	public ResponseEntity<ContaEspecial> novoContaEspecial(@RequestBody ContaEspecial teste2) {
		try {
			ContaEspecial novoContaEspecial = dao.save(teste2);
			return ResponseEntity.ok(novoContaEspecial);
		} catch (Exception e) {
			// return ResponseEntity.badRequest().build();
			return ResponseEntity.status(400).build();
		}

	}

	@PostMapping("/teste2/atualiza")
	public ResponseEntity<ContaEspecial> atualizaContaEspecial(@RequestBody ContaEspecial teste2) {
		try {
			if (teste2.getNumero() > 0) {
				ContaEspecial novoContaEspecial = dao.save(teste2);
				return ResponseEntity.ok(novoContaEspecial);
			}
			return ResponseEntity.badRequest().build();

		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}
	}

}
