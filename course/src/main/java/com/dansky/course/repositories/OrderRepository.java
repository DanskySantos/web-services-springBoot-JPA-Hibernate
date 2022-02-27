package com.dansky.course.repositories;

import com.dansky.course.entities.Order;
import com.dansky.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
