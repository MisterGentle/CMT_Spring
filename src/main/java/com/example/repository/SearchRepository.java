package com.example.repository;

import com.example.model.SearchData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SearchRepository extends JpaRepository<SearchData, Long> {
    // 특별한 쿼리 메서드나 기능을 추가할 수 있습니다.
}
