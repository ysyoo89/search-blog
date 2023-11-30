package com.search.blog.service;

import com.search.blog.entity.SearchEntity;
import com.search.blog.exception.code.ErrorCode;
import com.search.blog.exception.exception.CustomException;
import com.search.blog.model.WordSearchModel;
import com.search.blog.repository.repository.SearchRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class WordSearchService {
    private final SearchRepository searchRepository;

    public List<WordSearchModel> getWordSearch() {
        return searchRepository.getWordSearch();
    }
}
