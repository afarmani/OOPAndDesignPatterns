package com.afarmani.patterns.behavioral.behavioral.strategy;

public class BWFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Applying BW filter to: " + fileName);
    }
}
