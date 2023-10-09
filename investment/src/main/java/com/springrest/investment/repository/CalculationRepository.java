package com.springrest.investment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.investment.model.Investment;

@RestController
public interface CalculationRepository extends JpaRepository<Investment, Long> {
	
	 List<Investment> findByUserId(Long userId);
}
