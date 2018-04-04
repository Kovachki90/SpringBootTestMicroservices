package com.kovachki.stock.dbservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kovachki.stock.dbservice.model.Quote;

public interface QuotesRepository extends CrudRepository<Quote, Integer> {
	List<Quote> findByUserName(String username);
}
