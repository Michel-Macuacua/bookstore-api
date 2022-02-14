package com.michel.bookstore.repositories;

import com.michel.bookstore.domain.Fae;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaeRepository extends JpaRepository<Fae, Integer>
{
}
