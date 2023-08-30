package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.SearchResponse;
import com.example.service.SearchService;

@Controller
public class WebController {

    private final SearchService searchService;

    @Autowired
    public WebController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping("/web")
    public String showWebPage(Model model) {
        SearchResponse searchResponse = searchService.getSearchTrend();
        model.addAttribute("searchResponse", searchResponse);
        return "webpage"; // HTML 파일의 이름 (webpage.html)
    }
}