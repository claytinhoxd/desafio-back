package com.cce.api.controller;

import com.cce.api.dto.AgentesDTO;
import com.cce.api.repository.AgenteRepository;
import com.cce.api.service.AgenteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@Slf4j
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@RequestMapping("/api")
public class AgentesController
{
	@Autowired
	private AgenteRepository repository;
	@Autowired
	private AgenteService service;
	
	@PostMapping("/agentes")
	public ResponseEntity<?> agentesPost(@RequestBody AgentesDTO agentesDTO)
	{
		try
		{
			agentesDTO.getAgentes().forEach(x -> System.out.println(x.getCodigo()));
			service.save(agentesDTO);
		}
		catch (Exception e)
		{
			log.error("Um erro inesperado aconteceu {}", e);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@GetMapping("/regiao/{regiao}")
	public ResponseEntity<?> listarRegioesDadosPorSigla(@PathVariable String regiao)
	{
		try
		{
			return ResponseEntity.status(HttpStatus.OK).body(service.findRegioesBySigla(regiao));
		}
		catch (Exception e)
		{
			log.error("Um erro inesperado aconteceu {}", e);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.emptyList());
		}
	}
}
