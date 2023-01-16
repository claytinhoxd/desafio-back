package com.cce.api.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Agentes
{
	private String versao;
	private List<Agente> agentes;
}
