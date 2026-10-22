package com.legacycorp.ordermanagement.service;
import com.legacycorp.ordermanagement.model.Order; import com.legacycorp.ordermanagement.repository.OrderRepository; import org.springframework.stereotype.Service; import java.util.List;
@Service public class OrderService { private final OrderRepository repository; public OrderService(OrderRepository r){repository=r;} public List<Order> findAll(){return repository.findAll();} public Order findById(Long id){return repository.findById(id).orElse(null);} public Order save(Order o){return repository.save(o);} }
