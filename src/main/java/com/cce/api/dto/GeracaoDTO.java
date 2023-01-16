package com.cce.api.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;

@Getter
@Setter
public class GeracaoDTO
{
	@JacksonXmlElementWrapper(useWrapping = false)
	@JacksonXmlProperty(localName = "valor")
	private ArrayList<BigDecimal> valor;
}
