package com.search.blog.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class WordSearchModel {
    private String searchWord;
    private Long searchCount;
}
