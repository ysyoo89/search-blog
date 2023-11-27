package com.search.blog.service;

import com.search.blog.model.WordSearchModel;
import com.search.blog.repository.repository.SearchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WordSearchService {
    private final SearchRepository searchRepository;

    public List<WordSearchModel> getWordSearch() {
        return searchRepository.getWordSearch();
    }
}
