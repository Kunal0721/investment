package com.springrest.investment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.investment.model.InvestmentAmount;

@Repository
public interface AmountRepository  extends JpaRepository<InvestmentAmount, Integer>{
	
}
