package com.search.blog.api.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PopularSearchWordResponse {
    private String searchWord;
    private Long hitCount;
}
