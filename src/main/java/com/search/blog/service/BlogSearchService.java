package com.search.blog.service;

import com.search.blog.api.request.BlogSearchRequest;
import com.search.blog.api.response.BlogSearchResponse;
import com.search.blog.client.handler.BlogSearchHandler;
import com.search.blog.client.model.convertor.SearchConvertor;
import com.search.blog.client.model.response.BlogSearchApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BlogSearchService {
    private final BlogSearchHandler blogSearchHandler;
    private final SearchConvertor searchConvertor;
    public BlogSearchResponse getBlogSearch(BlogSearchRequest blogSearchRequest) {
        BlogSearchApiResponse blogSearchApiResponse =blogSearchHandler.getBlogSearch(searchConvertor.toRequest(blogSearchRequest));
        return searchConvertor.toResponse(blogSearchApiResponse);
    }

}
