package com.cce.api.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class AgenteDTO
{
	@JacksonXmlProperty(localName = "codigo")
	private Long codigo;
	
	@JacksonXmlProperty(localName = "data")
	private Date data;
	
	@JacksonXmlElementWrapper(useWrapping = false)
	@JacksonXmlProperty(localName = "regiao")
	private List<RegiaoDTO> regiao;
}
