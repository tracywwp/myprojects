package com.lishuangqi.service.elasticsearch.repository.vo;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * Created by michael on 2017/11/9.
 */
@Document(indexName = "article-index", type = "article", shards = 1, replicas = 0)
public class ArticleVo implements Serializable {

    @Id
    public String id;
    @Field(type = FieldType.String, searchAnalyzer = "ik_max_word", analyzer = "ik_max_word")
    public String title;
    @Field(type = FieldType.String, searchAnalyzer = "ik", analyzer = "ik")
    public String content;

    // **** Getter and Setter ****

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}