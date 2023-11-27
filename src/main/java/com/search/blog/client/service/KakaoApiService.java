package com.search.blog.client.service;

import com.search.blog.client.config.CustomErrorDecoderConfig;
import com.search.blog.client.config.KakaoAuthConfig;
import com.search.blog.client.config.RetryConfig;
import com.search.blog.client.model.response.BlogSearchApiResponse;
import com.search.blog.exception.exception.CustomException;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "KAKAO-API",
        url = "http://dapi.kakao.com/v2/search",
        configuration = {KakaoAuthConfig.class, RetryConfig.class, CustomException.class}
    )
public interface KakaoApiService {
    @GetMapping(value="/blog")
    BlogSearchApiResponse getBlogSearch(@RequestParam(value="query") String query,
                                        @RequestParam(value="sort") String sort,
                                        @RequestParam(value="page") Integer page,
                                        @RequestParam(value="size") Integer size);
}
