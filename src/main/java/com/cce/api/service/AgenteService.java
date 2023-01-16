package com.cce.api.service;

import com.cce.api.dto.AgentesDTO;
import com.cce.api.dto.RegiaoDTO;
import com.cce.api.model.Agentes;
import com.cce.api.repository.AgenteRepository;
import com.cce.api.repository.RegiaoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgenteService
{
	@Autowired
	private AgenteRepository agenteRepository;
	
	@Autowired
	private RegiaoRepository regiaoRepository;
	
	@Autowired
	private ModelMapper mapper;
	
	public void save(AgentesDTO agentesDTO)
	{
		final var agentes = mapper.map(agentesDTO, Agentes.class);
		agenteRepository.saveAll(agentes.getAgentes());
	}
	
	public List<RegiaoDTO> findRegioesBySigla(String regiaoSigla)
	{
		return regiaoRepository.findRegioesBySigla(regiaoSigla).stream().map(obj -> mapper.map(obj, RegiaoDTO.class)).toList();
	}
}
