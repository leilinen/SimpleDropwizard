package com.example.helloworld.api;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2020-09-04
 */
public class Saying {

    private long id;

    private String content;

    public Saying() {}

    public Saying(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }

}
