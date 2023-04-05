package com.tbtk.blgm.spring3securitydemo.repository;

import java.util.List;

import com.tbtk.blgm.spring3securitydemo.model.Cards;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CardsRepository extends CrudRepository<Cards, Long> {
	
	List<Cards> findByCustomerId(int customerId);

}