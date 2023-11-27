package com.search.blog.api.controller;

import com.search.blog.service.WordSearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/search")
public class WordSearchController {

    private final WordSearchService wordSearchService;
    @GetMapping("/popular")
    public ResponseEntity<?> getPopularSearchWord() {
        return ResponseEntity.ok(wordSearchService.getWordSearch());
    }
}
