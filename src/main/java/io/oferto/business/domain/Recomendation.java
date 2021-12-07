package io.oferto.business.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Recomendation {
	private String message;
	private LocalDateTime time;
	private String productCode;
}