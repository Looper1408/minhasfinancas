package com.example.demo.api.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LancamentoDTO {

	private Long id;
	private String descricao;
	private Integer mes;
	private BigDecimal valor;
	private Long usuario;
	private String tipo;
	private String status;
	private Integer ano;
}
