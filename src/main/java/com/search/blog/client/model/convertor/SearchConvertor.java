package com.search.blog.client.model.convertor;

import com.search.blog.api.request.BlogSearchRequest;
import com.search.blog.api.response.BlogSearchResponse;
import com.search.blog.client.model.request.BlogSearchApiRequest;
import com.search.blog.client.model.response.BlogSearchApiResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface SearchConvertor {
    @Mappings({
            @Mapping(target = "query", source = "keyword"),
            @Mapping(target = "size", source = "pagePerSize"),
            @Mapping(target = "page", source = "currentPage")
    })
    BlogSearchApiRequest toRequest(BlogSearchRequest blogSearchRequest);

    @Mappings({
            @Mapping(target = "totalPage", source = "meta.totalCount"),
            @Mapping(target = "contents", source = "documents")
    })
    BlogSearchResponse toResponse(BlogSearchApiResponse blogSearchApiResponse);
}
