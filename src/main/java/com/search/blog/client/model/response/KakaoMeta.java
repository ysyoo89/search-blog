package com.search.blog.client.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class KakaoMeta {
    private Integer total_count;
    private Integer pageable_count;
    private Boolean is_end;
}
