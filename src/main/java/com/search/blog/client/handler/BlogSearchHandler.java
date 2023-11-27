package com.search.blog.client.handler;

import com.search.blog.client.model.request.BlogSearchApiRequest;
import com.search.blog.client.model.response.BlogSearchApiResponse;
import com.search.blog.client.service.KakaoApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BlogSearchHandler {

    private final KakaoApiService kakaoApiService;

    public BlogSearchApiResponse getBlogSearch(BlogSearchApiRequest blogSearchApiRequest) {
        return kakaoApiService.getBlogSearch(blogSearchApiRequest.getQuery(),
                blogSearchApiRequest.getSort(),
                blogSearchApiRequest.getPage(),
                blogSearchApiRequest.getSize());
    }
}
