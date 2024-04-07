package com.pro.Ecommerce.product;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	ProductRepositry pr;
	
	public List<Product> views(){
		return pr.findAll();
	}
	
	public Product editPro(Long id,Product p) {
		p.setId(id);
		return pr.save(p);
	}
	
	public Optional<Product> view(Long id){
		return pr.findById(id);
	}
	
	public Product saveProduct(Product p) {
		return pr.save(p);
	}
	
	public String deletPro(Long id) {
		pr.deleteById(id);
		return id+" data deleted sucessfully!!";
	}
	
	
	
	
	
}
