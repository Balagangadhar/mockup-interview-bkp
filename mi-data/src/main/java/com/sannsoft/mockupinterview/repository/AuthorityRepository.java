package com.sannsoft.mockupinterview.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sannsoft.mockupinterview.domain.Authority;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
