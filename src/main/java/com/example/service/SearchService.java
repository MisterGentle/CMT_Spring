package com.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.model.SearchResponse;

@Service
public class SearchService {
    @Value("${search.api.url}")
    private String API_URL; // Used for API call in the future

    private final RestTemplate restTemplate; // Used in the TODO section

    public SearchService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void someMethodUsingRestTemplate() {
        // You can use restTemplate here for making API requests
        // For example:
        ResponseEntity<String> response = restTemplate.exchange(API_URL, HttpMethod.GET, null, String.class);
        response.getBody();
    }

    public SearchResponse getSearchTrend() {
        return null;
    }
}
