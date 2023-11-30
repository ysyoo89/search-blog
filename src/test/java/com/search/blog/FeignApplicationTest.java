package com.search.blog;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.search.blog.client.service.KakaoApiService;
import com.search.blog.config.MockCacheApi;
import com.search.blog.config.MockCacheApiConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ActiveProfiles("test")
@EnableConfigurationProperties
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { MockCacheApiConfig.class })
class FeignApplicationTest {

    @Autowired
    private WireMockServer mockCacheApi;

    @Autowired
    private KakaoApiService kakaoApiService;

    @BeforeEach
    void setUp() throws Exception{
        MockCacheApi.setupGetBlogResponse(mockCacheApi);
    }

    @Test
    @DisplayName("feign 결과 테스트 실패")
    public void feignTestFail() {
        assertFalse(kakaoApiService.getBlogSearch("집짓기", "recency", 1, 5).getDocuments().isEmpty());
    }

    @Test
    @DisplayName("feign 결과 테스트 성공")
    public void feignTestSuccess() {
        assertTrue(kakaoApiService.getBlogSearch("집짓기", "recency", 1, 5).getDocuments().size() == 5);
    }

}
