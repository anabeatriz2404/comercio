package com.itb.inf2fm.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2fm.comercio.model.Produto;


@Controller 
@RequestMapping("/comercio/produtos")


public class LojaController {
	
	List<Produto> listaDeProdutos = new ArrayList<Produto>();
	
    @GetMapping("/listar")
	public String listarProdutos(Model model) {
    	
    	Produto p1 = new Produto();
    	p1.setId(20l);
    	p1.setNome("Máquina de lavar roupa Brastemp 15L");
    	p1.setCodigoBarras("01234567890123456789");
    	p1.setDescricao("Produto Linha Branca com painel digital");
    	p1.setPreco(3215.89);
    	
    	
    	Produto p2 = new Produto();
    	p2.setId(20l);
    	p2.setNome("Air Fryer");
    	p2.setCodigoBarras("98765432109876543210");
    	p2.setDescricao("Fritadeira elétrica Mondial");
    	p2.setPreco(350.99);
    	
    	
    	Produto p3 = new Produto();
    	p3.setId(21l);
    	p3.setNome("Geladeira");
    	p3.setCodigoBarras("1472583690963852741");
    	p3.setDescricao("Geladeira 2 portas inox Electrolux");
    	p3.setPreco(3500.59);
    	
    	
    	// Adicionando os produtos a lista
    	
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		listaDeProdutos.add(p3);


		model.addAttribute("listaDeProdutos", listaDeProdutos);
    	
    	return "produtos";
    	
    	
    	
    	

	}
}
