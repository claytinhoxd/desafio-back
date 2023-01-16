package com.cce.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Entity
public class Geracao
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@ElementCollection
	@CollectionTable(name = "valor_geracao")
	private List<BigDecimal> valor;
}
