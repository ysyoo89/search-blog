package com.search.blog.api.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class BlogSearchResponse {
    private Integer currentPage;
    private Integer totalPage;
    private List<BlogContent> contents;
}
