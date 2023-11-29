package com.search.blog.api.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BlogSearchResponse {
    private Integer currentPage;
    private Integer totalPage;
    private List<BlogContent> contents;
}
