package com.flipkart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {
@Autowired
OrderRepo or;
	public String setOrder(OrderEntity o) {
		or.save(o);
		return "SAVED";
	}
	public List<OrderEntity> getOrder() {
		return or.getOrder();
	}

}
