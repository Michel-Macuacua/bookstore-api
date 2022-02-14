package com.michel.bookstore.domain;

import mz.gov.cedsif.datavalidapi.domain.Fae;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaeRepository extends JpaRepository<Fae, Integer>
{
}