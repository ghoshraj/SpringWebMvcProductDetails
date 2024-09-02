package com.raj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.raj.entity.ProductEntity;
import com.raj.repo.ProductRepo;

@Controller
public class ProductController {
	
	@Autowired
	private ProductRepo repo;
	
	@GetMapping("/")
	public String loadpage(Model model) {
		model.addAttribute("p" , new ProductEntity());
		return "index";
	}
	
	@PostMapping("/product")
	public String SaveProduct(@ModelAttribute("p") ProductEntity p , Model model) {
		p = repo.save(p);
		return "index";
	}
	
	@GetMapping("/products")
	public String returnProduct(Model model) {
		model.addAttribute("products",repo.findAll());
		return "data";
	}

}
