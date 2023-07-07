package com.flipkart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@Autowired
	OrderService os;
	@PostMapping(value="/setOrder")
	public String setOrder(@RequestBody OrderEntity o) {
		return os.setOrder(o);
		
	}
	@GetMapping(value="/getOrder")
	public List<OrderEntity> getOrder() {
		return os.getOrder();
		
	}
}
