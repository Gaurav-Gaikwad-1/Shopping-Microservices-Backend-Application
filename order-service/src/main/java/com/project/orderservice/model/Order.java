package com.project.orderservice.model;

import jakarta.persistence.Entity;

import java.util.List;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="t_orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String orderNumber;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<OrderLineItems> orderLineItemsList;
}
