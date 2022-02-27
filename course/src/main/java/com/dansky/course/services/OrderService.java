package com.dansky.course.services;

import com.dansky.course.entities.Order;
import com.dansky.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public List<Order> findAll() {
		return repository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

	//public User save(User user) { return repository.save(user); }

	//public void delete(Integer id) {repository.deleteById(id.longValue());}
}
