package com.flipkart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired
	OrderDao od;

	public String setOrder(OrderEntity o) {
		return od.setOrder(o);
	}

	public List<OrderEntity> getOrder() {
		return od.getOrder();
	}
}
