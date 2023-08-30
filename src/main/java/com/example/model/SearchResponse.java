package com.example.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SearchResponse {
    private List<SearchData> results; // Used in SearchController class
}
