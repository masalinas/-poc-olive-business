package io.oferto.business.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
	private String code;
	private String Description;
	private float price;
	private boolean active;
}
