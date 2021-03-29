package com.gustavogabriel.backend.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gustavogabriel.backend.dao.ProdutoDao;
import com.gustavogabriel.backend.entidade.Produto;

import net.bytebuddy.implementation.bind.annotation.Pipe;
import springfox.documentation.annotations.ApiIgnore;


@RestController // faz a classe se comportar como webservice
@RequestMapping("/produto") //configura a url do webservice
public class ProdutoRest {

	@Autowired //injeta uma instancia de produtoDao aqui
	private ProdutoDao produtoDao;
	
	@GetMapping //expoe o metodo GET
	public List<Produto> get(){
		return produtoDao.findAll();
	}
	
	@PostMapping //expoe o metodo POST
	public Map<String, Object> post(@RequestBody Produto produto) { //@RequestBody - marca o objeto como corpo da mensagem POST
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("result", "ok");
		produtoDao.save(produto);
		return result;
	}
	
	@PutMapping("/{param}") //expoe o metodo PUT
	public Map<String, Object> put(@PathVariable("param") String param, @RequestBody Produto produto) { //@RequestBody - marca o objeto como corpo da mensagem PUT
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("result", "ok");
		result.put("param", param);
		produtoDao.save(produto);
		return result;
	}
	
	@PostMapping("/map")
	public void produtoFromMap( @RequestBody Map<String, Object> produtoMap) {
		System.out.println(produtoMap);
	}
	
//	@PostMapping("/exemplo")
//	public void exemploPost(@RequestParam(name = "nome") String nome, @RequestParam(name = "telefone") String telefone) {
//		System.out.println(nome);
//		System.out.println(telefone);
//	}
	
	@PutMapping("/exemplo")
	public void exemploPut(@RequestParam(name = "nome") String nome, @RequestParam(name = "telefone") String telefone) {
		System.out.println(nome);
		System.out.println(telefone);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		produtoDao.deleteById(id);
	}
	
	@GetMapping("/ok")
	@ApiIgnore
	public void ok() {
		
	}

	
//	@PostMapping("/{nome}/{valor}") //expoe o metodo POST
//	public void post(@PathVariable("nome") String nome, @PathVariable("valor") BigDecimal valor) { //@RequestBody - marca o objeto como corpo da mensagem POST
//		Produto produto = new Produto();
//		produto.setNome(nome);
//		produto.setValor(valor);
//		produtoDao.save(produto);
//	}
	

}
