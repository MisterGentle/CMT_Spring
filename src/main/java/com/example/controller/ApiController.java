package com.example.controller;

import com.example.model.SearchResponse;
import com.example.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    private final SearchService searchService;

    @Autowired
    public ApiController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping("/search")
    public SearchResponse searchTrend() {
        return searchService.getSearchTrend();
    }
}
