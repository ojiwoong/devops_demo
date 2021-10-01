package com.example.devops_demo;

import lombok.Data;

@Data
public class Greeting {
    private final long id;
    private final String contnet;
    private final String version;

    public Greeting(long id, String content, String  version){
        this.id = id;
        this.contnet = content;
        this.version = version;
    }
}
