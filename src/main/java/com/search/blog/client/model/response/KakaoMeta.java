package com.search.blog.client.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class KakaoMeta {
    private Integer totalCount;
    private Integer pageableCount;
    private Boolean isEnd;
}
