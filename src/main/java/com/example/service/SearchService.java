package com.example.service;

import com.example.model.SearchResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SearchService {

    private static final String API_URL = "https://openapi.naver.com/v1/datalab/search";
    private final RestTemplate restTemplate;

    public SearchService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public SearchResponse getSearchTrend() {
        return null;
        // TODO: API 호출 및 응답 처리 로직 작성
    }
}
