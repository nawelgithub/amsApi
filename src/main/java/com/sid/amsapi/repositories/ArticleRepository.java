package com.sid.amsapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sid.amsapi.entities.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

}
