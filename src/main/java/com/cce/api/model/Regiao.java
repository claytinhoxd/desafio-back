package com.cce.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Regiao
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String sigla;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Compra compra;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Geracao geracao;
}
