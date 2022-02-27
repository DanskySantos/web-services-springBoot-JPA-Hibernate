package com.dansky.course.services;

import com.dansky.course.entities.Product;
import com.dansky.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Product> findAll() {
		return repository.findAll();
	}

	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

	//public User save(User user) { return repository.save(user); }

	//public void delete(Integer id) {repository.deleteById(id.longValue());}
}
