
package api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.List;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Article {
    private List<Object> categories;
    private String content;
    private String date;
    private String lang;
    private String layout;
    private List<Object> tags;
    private String title;
    private String url;

}
