package com.search.blog.repository.repository;

import com.search.blog.entity.SearchEntity;
import com.search.blog.repository.core.DefaultJpaRepository;
import com.search.blog.repository.custom.SearchRepositoryCustom;

public interface SearchRepository extends DefaultJpaRepository<SearchEntity, Long>, SearchRepositoryCustom {
}
