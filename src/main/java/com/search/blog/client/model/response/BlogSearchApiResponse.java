package com.search.blog.client.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class BlogSearchApiResponse {
    private KakaoMeta meta;
    private List<KakaoDocument> documents;
}
