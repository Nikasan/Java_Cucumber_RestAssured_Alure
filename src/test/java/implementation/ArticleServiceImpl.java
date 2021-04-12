package implementation;

import api.Article;
import config.TestCongig;
import io.restassured.response.ValidatableResponse;
import lombok.extern.log4j.Log4j2;
import service.ArticleService;

import java.util.ArrayList;
import java.util.List;

import static context.RunContext.RUN_CONTEXT;
import static io.restassured.RestAssured.given;

@Log4j2
public class ArticleServiceImpl implements ArticleService {
    TestCongig testCongig = new TestCongig();

    @Override
    public List<Article> getArticles(String url) {
        String URL = testCongig.getURL() + url;
        List<Article> articles = new ArrayList<>();

        ValidatableResponse r = given().log().everything().
                get(URL).then().log().ifError();
        RUN_CONTEXT.put("responce", r);

        try {
            articles = r.extract().jsonPath().getList("articles.", Article.class);
        } catch (Exception e) {
            log.error("Articles request exeption" + e.getStackTrace());
        }
        return articles;
    }
}
