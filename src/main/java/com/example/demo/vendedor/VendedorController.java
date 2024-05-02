package com.example.demo.vendedor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VendedorController {
	@Autowired
	private VendedorRepository vendedorRepository;
	
	@GetMapping("/vendedores")
	public String listarVendedores(Model modelo) {
		List<Vendedor> listaVendedores = vendedorRepository.findAll();
		modelo.addAttribute("listaVendedores", listaVendedores);
		return "vendedores";
	}
	
	@GetMapping("vendedores/nuevo")
	public String mostrarFormularioDeNuevoVendedor(Model modelo) {
		modelo.addAttribute("vendedor", new Vendedor());
		return "vendedor_formulario";
	}
	
	@PostMapping("/vendedores/guardar")
	public String guardarVendedor(Vendedor vendedor) {
		vendedorRepository.save(vendedor);
		return "redirect:/vendedores";
	}

}
