package com.search.blog.client.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BlogSearchApiRequest {
    private String query;
    private String sort;
    private Integer page;
    private Integer size;
}
