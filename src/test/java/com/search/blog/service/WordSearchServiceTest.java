package com.search.blog.service;

import com.search.blog.model.WordSearchModel;
import com.search.blog.repository.repository.SearchRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class WordSearchServiceTest {
    @InjectMocks
    private WordSearchService wordSearchService;
    @Mock
    private SearchRepository searchRepository;
    private List<WordSearchModel> wordSearchModelList = new ArrayList<>();

    @BeforeEach
    private void wordSearchInit() {
        wordSearchModelList.add(new WordSearchModel("블로그", 4L));
        wordSearchModelList.add(new WordSearchModel("카카오뱅크", 2L));
        wordSearchModelList.add(new WordSearchModel("가방", 1L));
    }

    @Test
    @DisplayName("Success getWordSearch")
    public void getWordSearchSuccess() {
        List<WordSearchModel> list = new ArrayList<>();
        list.add(new WordSearchModel("블로그", 4L));
        list.add(new WordSearchModel("카카오뱅크", 2L));
        list.add(new WordSearchModel("가방", 1L));
        doReturn(wordSearchModelList).when(searchRepository).getWordSearch();

        List<WordSearchModel> responseList = wordSearchService.getWordSearch();

        assertThat(responseList.size()).isEqualTo(3);
    }

}
