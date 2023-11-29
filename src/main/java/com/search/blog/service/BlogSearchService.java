package com.search.blog.service;

import com.search.blog.api.request.BlogSearchRequest;
import com.search.blog.api.response.BlogSearchResponse;
import com.search.blog.client.handler.BlogSearchHandler;
import com.search.blog.client.model.convertor.SearchConvertor;
import com.search.blog.client.model.response.BlogSearchApiResponse;
import com.search.blog.exception.code.ErrorCode;
import com.search.blog.exception.exception.CustomException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BlogSearchService {
    private final BlogSearchHandler blogSearchHandler;
    private final SearchConvertor searchConvertor;
    public BlogSearchResponse getBlogSearch(BlogSearchRequest blogSearchRequest) {
        BlogSearchApiResponse response;
        BlogSearchResponse result;
        try {
            response = blogSearchHandler.getBlogSearch(searchConvertor.toRequest(blogSearchRequest));
            result = searchConvertor.toResponse(response);
            result.setCurrentPage(blogSearchRequest.getCurrentPage());
        } catch (Exception e) {
            throw new CustomException(ErrorCode.INTERNAL_SERVER_ERROR);
        }
        return result;
    }

}
