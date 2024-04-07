package com.pro.Ecommerce.product;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ecom")
public class ProductController {
	@Autowired
	ProductService ps;
	@CrossOrigin
	@GetMapping("/pro/views")
	public List<Product> views() {
		return ps.views();
	}
	@GetMapping("/pro/view/{id}")
	public Optional<Product> view(@PathVariable Long id){
		return ps.view(id);
	}
	@PostMapping("/pro/save")
	public Product save(@RequestBody Product p) {
		return ps.saveProduct(p);
	}
	@PutMapping("/pro/edit/{id}")
	public Product editProduct(@PathVariable Long id,@RequestBody Product p){
		return ps.editPro(id, p);
	}
	
	@DeleteMapping("/pro/del/{id}")
	public String deletPro(@PathVariable Long id) {
		ps.deletPro(id);
		return "Data deeted sucessfully!! "+id;
	}
}
