package com.search.blog.repository.impl;

import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.core.types.dsl.StringPath;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.search.blog.model.WordSearchModel;
import com.search.blog.repository.custom.SearchRepositoryCustom;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.search.blog.entity.QSearchEntity.searchEntity;

@Repository
@RequiredArgsConstructor
public class SearchRepositoryImpl implements SearchRepositoryCustom {
    private final JPAQueryFactory queryFactory;

    @Override
    public List<WordSearchModel> getWordSearch() {
        StringPath aliasQuantity = Expressions.stringPath("searchCount");
        return queryFactory.select(
                Projections.constructor(WordSearchModel.class,
                        searchEntity.searchWord,
                        searchEntity.searchWord.count().as("searchCount")
                ))
                .from(searchEntity)
                .groupBy(searchEntity.searchWord)
                .orderBy(aliasQuantity.desc())
                .limit(10)
                .fetch();
    }

}
