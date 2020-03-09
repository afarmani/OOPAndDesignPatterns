package com.afarmani.patterns.behavioral.behavioral.iterator;

public class Sites{
    private String url;

    public Sites(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Sites{" +
                "url='" + url + '\'' +
                '}';
    }
}
