package com.search.blog.api.controller;

import com.search.blog.api.request.BlogSearchRequest;
import com.search.blog.service.BlogSearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/blog")
public class BlogSearchController {
    private final BlogSearchService blogSearchService;

    @GetMapping("/search")
    public ResponseEntity<?> getBlogSearch(BlogSearchRequest blogSearchRequest) {
        return ResponseEntity.ok(blogSearchService.getBlogSearch(blogSearchRequest));
    }
}
