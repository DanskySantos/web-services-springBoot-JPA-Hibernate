package com.dansky.course.services;

import com.dansky.course.entities.Category;
import com.dansky.course.repositories.CategoryRepository;
import com.dansky.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll() {
		return repository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}

	//public User save(User user) { return repository.save(user); }

	//public void delete(Integer id) {repository.deleteById(id.longValue());}
}
