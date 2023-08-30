package com.example.controller;

import com.example.model.SearchResponse;
import com.example.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private SearchService searchService;

    @GetMapping("/trend")
    public String searchTrend(Model model) {
        SearchResponse searchResponse = searchService.getSearchTrend();
        model.addAttribute("searchResponse", searchResponse);
        return "search-trend"; // 이 부분이 템플릿 파일명과 일치해야 합니다.
    }
}
