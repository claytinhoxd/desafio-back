package com.cce.api.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegiaoDTO
{
	private String sigla;
	
	@JacksonXmlProperty(localName = "geracao")
	private GeracaoDTO geracao;
	
	@JacksonXmlProperty(localName = "compra")
	private CompraDTO compra;
}
