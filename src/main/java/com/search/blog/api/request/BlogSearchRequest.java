package com.search.blog.api.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BlogSearchRequest {

    private Integer totalPage;
    private Integer currentPage;
    private Integer pagePerSize;
    private String keyword;
    private String sort;
}
