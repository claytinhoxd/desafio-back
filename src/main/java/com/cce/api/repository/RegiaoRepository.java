package com.cce.api.repository;

import com.cce.api.model.Regiao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegiaoRepository extends JpaRepository<Regiao, Long>
{
	List<Regiao> findRegioesBySigla(String sigla);
}
