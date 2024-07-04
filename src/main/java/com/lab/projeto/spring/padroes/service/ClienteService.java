package com.lab.projeto.spring.padroes.service;

import com.lab.projeto.spring.padroes.model.Cliente;

public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}