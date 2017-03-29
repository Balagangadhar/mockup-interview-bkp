package com.sannsoft.mockupinterview.repository.search;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.sannsoft.mockupinterview.domain.User;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, Long> {
}
