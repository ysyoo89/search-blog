package com.search.blog.config;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

public class MockCacheApi {
    public static void setupGetBlogResponse(WireMockServer mockCacheApi) {
        mockCacheApi.stubFor(WireMock.get(WireMock.urlMatching("/search"))
                .willReturn(WireMock.aResponse()
                        .withStatus(HttpStatus.OK.value())
                        .withHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                        .withBodyFile("blog/blog-response.json")
                )
        );
    }
}
