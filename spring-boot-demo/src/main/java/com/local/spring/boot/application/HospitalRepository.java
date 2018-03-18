package com.local.spring.boot.application;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface HospitalRepository extends CrudRepository<Hospital, Long> {
	List<Hospital> findById(long hospitalID);
}