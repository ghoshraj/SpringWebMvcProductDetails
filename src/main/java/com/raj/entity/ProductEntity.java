package com.raj.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ProductEntity {
	
	@Id
	@GeneratedValue
	private Integer ID;
	private String ProductName;
	private Double price;
	private Integer qty;
	
}
