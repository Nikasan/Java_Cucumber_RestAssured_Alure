package service;

import api.Article;

import java.util.ArrayList;
import java.util.List;

public interface ArticleService {
    List<Article> getArticles(String url);

}
